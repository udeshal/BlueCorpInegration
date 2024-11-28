package com.example.bluecorpsys;

import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSchException;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class SFTPClient {
    private ChannelSftp setupJsch() throws JSchException {
        JSch jsch = new JSch();
        String username = System.getProperty("user.name");
        String remoteHost = System.getProperty("host");
        String password = System.getProperty("password");

        Session jschSession = null;
        try {
            jsch.setKnownHosts("/known_hosts");
            jschSession = jsch.getSession(username, remoteHost);
            jschSession.setPassword(password);
            jschSession.connect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (ChannelSftp) jschSession.openChannel("sftp");
    }
    public void uploadToSFTP(String content){
        try{
            ChannelSftp sftp = setupJsch();
            byte[] bytesContent = content.getBytes(StandardCharsets.UTF_8);
            InputStream inputStream = new ByteArrayInputStream(bytesContent);
            sftp.connect();
            sftp.put(new FileInputStream(String.valueOf(inputStream)), "ReadyForDispatch.csv");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}

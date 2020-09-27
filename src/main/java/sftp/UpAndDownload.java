package sftp;

import java.io.File;
import java.util.Iterator;
import java.util.Vector;

import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.ChannelSftp.LsEntry;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;

public class UpAndDownload {
	private static String remoteHost = "127.0.0.1";
	private static String username = "ghost-riders";
	private static String password = "  ";
	private static String pkey = "D:\\SFTP SERVER\\RECON_KEYS\\exported_recon_pvt.ppk";
	private static String keypass = "cdac";
	private static int port = 22;

	private static String localFile = "src/main/resources/text.txt";
	private static String remoteDir = "/C:/RECON_FILES/CreateReconFiles/";
	private static String localPath = "src/main/resources/";

	private static ChannelSftp setupJsch() {
		JSch jsch = new JSch();
		try {
			jsch.addIdentity(pkey, keypass);
		} catch (JSchException e) {
			System.out.println("Private Key and Password Error"+e);
		}
		try {
			jsch.setKnownHosts(pkey);
		} catch (JSchException e) {
			System.out.println("UnkownHosts Key Error : "+e);
		}
		Session jschSession=null;
		try {
			jschSession = jsch.getSession(username, remoteHost, port);
		} catch (JSchException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		jschSession.setPassword(password);
		jschSession.setConfig("StrictHostKeyChecking", "no");
		try {
			jschSession.connect();
		} catch (JSchException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			return (ChannelSftp) jschSession.openChannel("sftp");
		} catch (JSchException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public static void whenUploadFileUsingJsch_thenSuccess() throws JSchException, SftpException {
		ChannelSftp channelSftp = setupJsch();
		channelSftp.connect();

//		Vector<LsEntry> vr = channelSftp.ls("./");
//		if (!vr.isEmpty()) {
//			for (LsEntry lsEntry : vr) {
//				System.out.println("File List : " + lsEntry.getFilename());
//			}
//		}
		String[] li = { "text.txt", "CDACHPY_RECONTXN_180920.xlsx", "CDACHPY_RECONTXN_190920.xlsx" };
		channelSftp.cd(remoteDir);
		String ss = channelSftp.pwd();
		System.out.println("SFTP pwd : " + ss);

		for (int i = 0; i < li.length; i++) {
			channelSftp.put("../Practice/src/main/resources/" + li[i], ss + File.separator + li[i]);
			System.out.println("../Practice/src/main/resources/" + li[i] + "\t" + ss + File.separator + li[i]);
		}
		System.out.println("upload done");
		channelSftp.disconnect();
		Session sss = channelSftp.getSession();
		sss.disconnect();
	}

	public static void whenDownloadFileUsingJsch_thenSuccess() throws JSchException, SftpException {
		ChannelSftp channelSftp = setupJsch();
		channelSftp.connect();

		String remoteFile = "/home/manmath/Example/rec/anir.txt";
		String localDir = "./";
		// channelSftp.cd("/C:/RECON_FILES/CreateReconFiles/");
		// channelSftp.get("/C:/RECON_FILES/CreateReconFiles/anir.txt", localDir +
		// "jschFile.txt");
		Vector<LsEntry> vr = channelSftp.ls(remoteDir);
		System.out.println(vr.isEmpty());
		if (!vr.isEmpty()) {
			for (LsEntry lsEntry : vr) {
				System.out.println(remoteDir + File.separator + lsEntry.getFilename());
				channelSftp.get(remoteDir + File.separator + lsEntry.getFilename(), localDir);
			}
		}
		System.out.println("done");
		channelSftp.exit();
		Session ss = channelSftp.getSession();
		ss.disconnect();
	}

	public static void main(String[] args) throws JSchException, SftpException {
		whenUploadFileUsingJsch_thenSuccess();
//		whenDownloadFileUsingJsch_thenSuccess();
	}
}

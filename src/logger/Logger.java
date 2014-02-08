package logger;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;
import java.util.Properties;

public class Logger {
	private String logLocation;
	private Date date;
	
	public Logger()
	{
		parse();
		this.date = new Date();
	}
	
	
	/**
	 * When logging, if the message must contain a new line character, the escape sequence in Windows
	 * is /r/n instead of /n.
	 * */
	public void log(String message)
	{
		SimpleDateFormat sdfLog = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdfMessage = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		BufferedWriter bw = null;
		
		try {
			bw = new BufferedWriter(new FileWriter(new File(logLocation + sdfLog.format(this.date) + ".log"), true));
			bw.write("<" + sdfMessage.format(this.date) + ">: \r\n" + message.replace("\n", "\r\n") + "\r\n"); //windows format for newline
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(0);
		}finally
		{
			try {
				bw.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}
	
	
	/*	
	 * To take advantage of having a separate properties file, the properties file will later have to be moved into a
	 * separate location on the filesystem, and this parser code will have to adjust accordingly. In the meantime it is
	 * fine to keep the properties file within the project, and allow this class to use the relative path.
	 * */
	private void parse()
	{	
		Properties properties = new Properties();
		InputStream is = null;
		String filename = "/properties/logger.properties";
		
		is=getClass().getResourceAsStream(filename);
		try {
			properties.load(is);
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(0);
		}finally
		{
			try {
				is.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		this.logLocation = properties.getProperty(LoggerConstants.LOG_LOCATION);
	}
}

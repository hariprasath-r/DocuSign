package ca.bell.eside.logger;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LogClass {

	private static Logger log = Logger.getLogger(LogClass.class);
	private static String fileName;
	public static final String LOG_FILE_PATH = "logfilepath";
	
	private static void initializeLogger() {
		log.setLevel(Level.DEBUG);
//		String filePath = System.getProperty(LOG_FILE_PATH);
		String filePath = "C:\\Application-logs\\";
		String fileNameStr = filePath + fileName;
//		String logConfig = System.getProperty("log4jConfig");
//		String logConfig = "C:\\IBM\\IID\\PS\\v8.5.7\\lib\\ext\\eside-log4j.properties";
		String logConfig = "/src";
		System.setProperty("fileName", fileNameStr);
		PropertyConfigurator.configure(logConfig);
	}
	
	public static Logger getLogger() {
		initializeLogger();
		return LogClass.log;
	}
	
	public static void setFileName(String fileName){
	    LogClass.fileName = fileName;
	}
}

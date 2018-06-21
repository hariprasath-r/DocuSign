package ca.bell.eside.logger;

import java.sql.Timestamp;

public class ESIDELoggerUtil {

	public static void logMessage(String data, String filename, String logMessage, String source, String destination, String correlationID, String status) {
		try {
			System.out.println(">---Inside Custom LoggerManager---<");
//			String env = System.getProperty("Environment").trim();
			String env = "DEV";
			
			System.out.println("Environment is :: "+env);
			if(env.equalsIgnoreCase("DEV") || env.equalsIgnoreCase("DEVBOX")) {
				System.out.println("Log Message :: "+logMessage);
				System.out.println("Payload ::"+data);
			}
			//Creating Message Body
			LogClass.getLogger().info(LoggerConstants.DECORATOR + " START of Message" + LoggerConstants.DECORATOR) ;
	        LogClass.getLogger().info(LoggerConstants.LOG_MESSAGE + logMessage);
	        Timestamp time = new Timestamp(System.currentTimeMillis());
	        LogClass.getLogger().info(LoggerConstants.TIMESTAMP + time);
	        LogClass.getLogger().info(LoggerConstants.ENVIRONEMNT + env);
	        LogClass.getLogger().info(LoggerConstants.SOURCE + source);
	        LogClass.getLogger().info(LoggerConstants.DESTINATION + destination);
	        LogClass.getLogger().info(LoggerConstants.HOST + "localhost");
	        LogClass.getLogger().info(LoggerConstants.TRANSACTION_ID + correlationID);
	        LogClass.getLogger().info(LoggerConstants.STATUS + status);
	        LogClass.getLogger().info(LoggerConstants.PAYLOAD + data);
	        LogClass.getLogger().info(LoggerConstants.DECORATOR + " END of Message" + LoggerConstants.DECORATOR);
		}catch (Exception e) {
			System.out.println("Problem calling ESIDELogger.  Logging failed...");
			e.printStackTrace();
			System.out.println("Continuing with the service Flow. Messages may not get logged...");
		}
	}
}

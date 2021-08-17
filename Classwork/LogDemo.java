package com.yash.loggers;
import java.util.logging.FileHandler;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
public class LogDemo {
	static Logger Logger= org.apache.log4j.Logger.getLogger(LogDemo.class);
	
	public static void main(String args[])
	{
        PropertyConfigurator.configure("log.properties");
		Logger.info("This is the log for LogDemo");
		System.out.println("Loggers executed");
		Logger.warn("Thiss is warning msg");
		Logger.error("Thiss is error msg");
		Logger.debug("Thiss is debug msg");
		Logger.fatal("Thiss is fatal msg");
		
	}

}

package com.Utility;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log {
	public static Logger logg = Logger.getLogger("Log");
	
	public static void info(String message)
	{
		PropertyConfigurator.configure("log4j.properties");
		logg.info(message);		
	}
}

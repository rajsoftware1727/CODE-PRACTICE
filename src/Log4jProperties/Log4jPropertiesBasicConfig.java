package Log4jProperties;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Log4jPropertiesBasicConfig {
	
	static Logger logger=Logger.getLogger(Log4jPropertiesBasicConfig.class); //create object of logger class for factory model not use in new keyword
	
	public static void main(String args[])
	{
		//set basic configurator
		BasicConfigurator.configure();//set the basic config
		logger.info("this is info level");
		logger.warn("this is warn level");
		logger.error("this is error level");
		logger.fatal("this is fatal level");
		logger.debug("this is debug level");
		//level debug>info>error>warn>fatal
	}

}

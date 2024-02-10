package Log4jProperties;

 import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4jPropertiesConfig {
	
	static Logger logger=Logger.getLogger(Log4jPropertiesConfig.class);
	
	public static void main(String args[])
	{
		//set property configurator
		
		PropertyConfigurator.configure("log4j.properties");
 				logger.info("this is info level");
				logger.warn("this is warn level");
				logger.error("this is error level");
				logger.fatal("this is fatal level");
				logger.debug("this is debug level");
				//level debug>info>error>warn>fatal
	}

}

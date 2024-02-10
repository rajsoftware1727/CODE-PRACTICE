package Log4jProperties;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Log4jConfigureXML {
	
	
	static Logger logger=Logger.getLogger(Log4jConfigureXML.class);
	public static void main(String args[])
	{
		DOMConfigurator.configure("log4j.xml");
		logger.info("this is info level");
		logger.warn("this is warn level");
		logger.error("this is error level");
		logger.fatal("this is fatal level");
		logger.debug("this is debug level");
		//level debug>info>error>warn>fatal
	}

}

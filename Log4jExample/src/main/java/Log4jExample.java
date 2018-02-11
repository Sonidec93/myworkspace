import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Log4jExample {
	final static Logger log = Logger.getLogger(Log4jExample.class);

	public static void main(String[] arg) {
		DOMConfigurator.configure("log4j.xml");
//		while (true) {
//			log.error("This is a error");
//			log.info("This is info");
//			
//		}//Demo for Rolling file appender
		
		log.error("This is a error");
		log.info("This is info");
	}
}

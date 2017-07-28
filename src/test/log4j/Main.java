package test.log4j;

import org.apache.log4j.Logger;

public class Main {

	private static Logger log = Logger.getLogger(Main.class);

	public static void main(String[] args) throws InterruptedException {
		while(true) {
			Thread.sleep(2 * 1000);
			log.info("Hello Log4j!");
		}
	}

}

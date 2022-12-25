package base;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {
	public static void main(String[] args) {
		Logger logger = Logger.getLogger(Test.class.getName());

		logger.log(Level.INFO, "This is message 1");
		logger.log(Level.WARNING, "This is message 2,warning");
	}

}

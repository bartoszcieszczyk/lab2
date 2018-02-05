package edu.agh.ics.jtplab;

import org.apache.log4j.Logger;

public class SwapNumbers {
	
	static Logger log = Logger.getLogger(SwapNumbers.class);

	public static void main(String[] args) {
		if(args.length != 2) {
			log.error("Usage: <number A> <number B>");
			System.exit(-1);
		}
		try {
			int x = Integer.parseInt(args[0]);
			int y = Integer.parseInt(args[1]);
			log.info("x=" + x + ", y=" + y);
			x = x ^ y;
			y = x ^ y;
			x = x ^ y;
			log.info("x=" + x + ", y=" + y);
		}
		catch (NumberFormatException ex) {
			log.error("Invalid arguments - should be an integer: " + args[0]);
			System.exit(-2);
		}
	}
	
}
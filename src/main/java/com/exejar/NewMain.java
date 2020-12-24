package com.exejar;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author abbas
 */
public class NewMain {

    private static final Logger logger = LogManager.getLogger(NewMain.class);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Wos");
        logger.error("Hello, World!");
    }

}

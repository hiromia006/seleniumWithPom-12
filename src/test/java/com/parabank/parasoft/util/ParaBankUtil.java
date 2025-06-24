package com.parabank.parasoft.util;

public class ParaBankUtil {
    public final static int WAIT_TIME = 30; // Default wait time in seconds
    public final static String LOGIN_TITTLE = "ParaBank | Welcome | Online Banking"; // Base URL for ParaBank application

    public static void waitForPageLoad() {
        try {
            Thread.sleep(2000); // Convert seconds to milliseconds
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restore interrupted status
            throw new RuntimeException("Thread was interrupted while waiting for page load", e);
        }
    }
}

package edu.sjsu;
import java.util.regex.*;

public class NameChecker {
    /**
     * Checks if a given string is a valid name following these rules:
     * - Between 2 to 40 characters
     * - Contains only alphabetic characters, non-consecutive hyphens, or a single quote
     * - Cannot start with a hyphen or single quote
     * 
     * @param input Name to check
     * @return True if input is a valid name, else false
     */
    public static boolean check(String input) {
        // TODO: implement
        int inLength = input.length();
        if(inLength < 2 || inLength > 40) { // check if string length fits
            return false;
        } else { // length of string is valid
            if(input.contains("'") || input.contains("--") || input.charAt(0) == '-' || input.charAt(0) == '\'') {
                return false;
            } else {
                return true;
            }
        }
    }
}

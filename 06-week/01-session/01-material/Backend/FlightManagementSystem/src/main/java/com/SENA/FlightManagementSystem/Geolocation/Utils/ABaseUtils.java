package com.SENA.FlightManagementSystem.Geolocation.Utils;

/**
 * Abstract base class providing common utility methods.
 */
public abstract class ABaseUtils {
    
    /**
     * Validates if a string is not null and not empty.
     * 
     * @param value The string value to validate.
     * @return true if the value is valid, false otherwise.
     */
    public static boolean isValidString(String value) {
        return value != null && !value.trim().isEmpty();
    }

    /**
     * Validates if a string meets the minimum length requirement.
     * 
     * @param value     The string value to validate.
     * @param minLength The minimum length required.
     * @return true if the value meets the requirement, false otherwise.
     */
    public static boolean hasMinLength(String value, int minLength) {
        return isValidString(value) && value.trim().length() >= minLength;
    }

    /**
     * Validates if a string doesn't exceed the maximum length.
     * 
     * @param value     The string value to validate.
     * @param maxLength The maximum length allowed.
     * @return true if the value is within the limit, false otherwise.
     */
    public static boolean hasMaxLength(String value, int maxLength) {
        return value == null || value.trim().length() <= maxLength;
    }

    /**
     * Capitalizes the first letter of each word in a string.
     * 
     * @param value The string value to capitalize.
     * @return The capitalized string.
     */
    public static String capitalizeWords(String value) {
        if (!isValidString(value)) {
            return value;
        }
        
        String[] words = value.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < words.length; i++) {
            if (i > 0) {
                result.append(" ");
            }
            if (words[i].length() > 0) {
                result.append(words[i].substring(0, 1).toUpperCase())
                      .append(words[i].substring(1).toLowerCase());
            }
        }
        
        return result.toString();
    }
}

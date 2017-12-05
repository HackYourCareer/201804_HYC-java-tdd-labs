package com.sap.hybris.tdd.labs.basics.junit;

/**
 * Provides {@code static} utility methods for operating on objects.
 */
public final class ObjectUtils {

    private ObjectUtils() {
        // blocks the possibility of create a new instance
    }

    /**
     * Verifies that a object is not {@code null}.
     * @param object the tested object.
     * @param name the detail message to be used in the thrown exception.
     * @throws IllegalArgumentException if the parameter value is equal to {@code null}.
     * @since 1.4.0
     */
    public static void verifyNotNull(final Object object, final String message) {
        if (object == null) {
            throw new IllegalArgumentException(message != null ? message : "Object must not be null");
        }
    }
}

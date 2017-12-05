package com.sap.hybris.tdd.labs.basics.junit;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public final class ObjectUtilsTest {

    @Rule
    public final ExpectedException expectedException = ExpectedException.none();

    @Test
    public void verifyNotNullWhenValueIsNotNull() {
        ObjectUtils.verifyNotNull("object", null);
        ObjectUtils.verifyNotNull(Boolean.FALSE, "message");
    }

    @Test
    public void verifyNotNullWhenObjectIsNullAndMessageIsNotNull() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Argument cannot be null");

        ObjectUtils.verifyNotNull(null, "Argument cannot be null");
    }

    @Test
    public void verifyNotNullWhenObjectAndMessageAreNull() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Object must not be null");

        ObjectUtils.verifyNotNull(null, null);
    }
}

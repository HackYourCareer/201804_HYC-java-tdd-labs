package com.sap.hybris.tdd.labs.basics.junit;

/**
 * Provides simple mathematical functions only on numbers in specified range.
 */
public class RangedCalculator implements Calculator {

    private final int minNumber;
    private final int maxNumber;

    /**
     * Constructs a new instance in which minimum and maximum allowed values of the arguments.
     * @param minNumber the minimum allowed value.
     * @param maxNumber the maximum allowed value.
     */
    public RangedCalculator(final int minNumber, final int maxNumber) {
        this.minNumber = minNumber;
        this.maxNumber = maxNumber;
    }

    /**
     * {@inheritDoc}
     * @throws IllegalArgumentException when any argument is equal to {@code null}.
     */
    @Override
    public final Integer add(final Integer arg1, final Integer arg2) {
        validateArgument("arg1", arg1);
        return null;
    }

    private void validateArgument(final String name, final Integer value) {
        // TODO 07 add validation if the value is not null and run testAddWhenArgumentIsEqualToNull again (it should
        // pass)


        if (value < minNumber || value > maxNumber) {
            throw new IllegalArgumentException(
                    String.format("%s must be in range <%d, %d>, current value: %d", name, minNumber, maxNumber, value));
        }
    }
}

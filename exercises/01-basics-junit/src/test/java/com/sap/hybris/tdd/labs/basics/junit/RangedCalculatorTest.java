package com.sap.hybris.tdd.labs.basics.junit;

// TODO 00 tests that will be added within exercises will not cover all branches. We want you to focus on JUnit basics.
public final class RangedCalculatorTest {

    // TODO 01 mark this method as test and run it (it should pass).

    public void addWhenBothNumbersArePositive() {
        // given
        final Calculator calculator = new RangedCalculator(-10, 10);

        // when
        final Integer result = calculator.add(3, 5);

        // then
        // TODO 02 add verification that the result is not null (it should fail),
        // fix the RangedCalculator#add method and run the test again (it should pass).


        // TODO 03 add verification that the result is equal to 8 and run test (it should pass),
        // use result.intValue() to get a primitive value (the previous assert prevents NullPointerException from
        // occurring).

    }

    // TODO 04 add test which verifies that the "add" method throws IllegalArgumentException when first argument is
    // lower than the minimum value, run test (it should pass).

    public void addWhenFirstAgrumentIsLowerThanMinimumValue() {
        // given
        final Calculator calculator = new RangedCalculator(-10, 10);

        // when

    }

    // TODO 05 add test which verifies that the "add" method throws IllegalArgumentException when second argument is
    // bigger than the maximum value, run test (it should fail). Fix broken code and run test again (it should pass).

    public void addWhenSecondAgrumentIsBiggerThanMaximumValue() {

    }

    // TODO 06 add test which verifies that the "add" method throws IllegalArgumentException when any argument is equal
    // to null, run test (it should fail). You will fix the test in task 07.

    public void addWhenArgumentIsEqualToNull() {

    }

    // TODO 08 create a setup method which will prepare an instance of the RangedCalculator, use that instance in test
    // methods and finally run tests (all should pass).


    // TODO 09 if you added "throw new IllegalArgumentException" in exercise 07 (RangedCalculator#validateArgument),
    // then remove "if" and "throw" operations and use "ObjectUtils#verifyNotNull(Object, String)" method instead, run
    // addWhenArgumentIsEqualToNull added in previous task (it should pass). Now your code is more concise and tests
    // proved that the logic is still the same.


    // TODO 10 (optional) verify messages of the thrown exceptions in tests:
    // - addWhenFirstAgrumentIsLowerThanMinimumValue
    // - addWhenSecondAgrumentIsBiggerThanMaximumValue
    // - addWhenArgumentIsEqualToNull
    // You should use an instance of the org.junit.rules.ExpectedException to do this.
    // If you don't know how to start, you can see a usage in ObjectUtilsTest.


}

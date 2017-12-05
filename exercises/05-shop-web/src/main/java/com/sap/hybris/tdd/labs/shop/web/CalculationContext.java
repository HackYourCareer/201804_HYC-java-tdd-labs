package com.sap.hybris.tdd.labs.shop.web;

public class CalculationContext {

    private boolean secondForHalf;
    private boolean thirdForFree;

    public boolean isSecondForHalf() {
        return secondForHalf;
    }

    public void setSecondForHalf(final boolean secondForHalf) {
        this.secondForHalf = secondForHalf;
    }

    public boolean isThirdForFree() {
        return thirdForFree;
    }

    public void setThirdForFree(final boolean thirdForFree) {
        this.thirdForFree = thirdForFree;
    }
}

package com.sap.hybris.tdd.labs.basics.mockito.model;

public class UserModel implements Model {

    private final String name;

    public UserModel(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "UserModel{name='" + name + "'}";
    }
}

package com.sap.hybris.tdd.labs.basics.mockito.model;

public class CommentModel implements Model {

    private final String message;

    public CommentModel(final String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "CommentModel{message='" + message + "'}";
    }
}

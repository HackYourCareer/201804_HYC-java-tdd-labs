package com.sap.hybris.tdd.labs.basics.mockito.service;

import java.util.List;

import com.sap.hybris.tdd.labs.basics.mockito.model.CommentModel;
import com.sap.hybris.tdd.labs.basics.mockito.model.Model;

/**
 * Provides functionality to create and read comments.
 */
public interface CommentService {

    /**
     * Returns all comments associated with a model.
     * @param model the model which comments will be read.
     * @return list with comments.
     */
    List<CommentModel> getComments(Model model);

    /**
     * Adds a comment to a model.
     * @param model the model to which the comment will be added.
     * @param comment the comment to add.
     */
    void addComment(Model model, CommentModel comment);

    /**
     * Creates a new comment with message.
     * @param message the new comment message.
     * @return the new comment.
     */
    CommentModel createComment(String message);
}

package com.sap.hybris.tdd.labs.basics.mockito;

import java.util.List;

import com.sap.hybris.tdd.labs.basics.mockito.model.CommentModel;
import com.sap.hybris.tdd.labs.basics.mockito.model.Model;

/**
 * Simplifying operation on comments to models.
 */
public interface CommentFacade {

    /**
     * Adds a new comment to a model.
     * @param model the model to which comment will be added.
     * @param comment the text of the new comment.
     * @return {@code true} if a comment is added, otherwise {@code false}.
     */
    boolean addComment(Model model, String comment);

    /**
     * Returns all comments associated with a model.
     * @param model the model whose comments will be returned.
     * @return list with comments.
     */
    List<CommentModel> getComments(Model model);
}

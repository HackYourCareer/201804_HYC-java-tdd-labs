package com.sap.hybris.tdd.labs.basics.mockito.service;

import com.sap.hybris.tdd.labs.basics.mockito.model.Model;
import com.sap.hybris.tdd.labs.basics.mockito.model.UserModel;

/**
 * Provides functionality to verify if users have rights to read/create/modify other models.
 */
public interface PermissionService {

    /**
     * Tests whether a user has granted permissions to read a model.
     * @param user the user which wants to read the model.
     * @param model the model which the user wants to read.
     * @return {@code true} whether the user can read the model, otherwise {@code false}.
     */
    boolean canUserRead(UserModel user, Model model);

    /**
     * Tests whether a user has granted permissions to create a new model.
     * @param user the user which wants to create the new model.
     * @param modelClass the model class of which the user wants to create a new instance.
     * @return {@code true} whether the user can create the new model, otherwise {@code false}.
     */
    boolean canUserCreate(UserModel user, Class<? extends Model> modelClass);
}

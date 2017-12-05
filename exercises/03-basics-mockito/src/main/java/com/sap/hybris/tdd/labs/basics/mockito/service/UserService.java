package com.sap.hybris.tdd.labs.basics.mockito.service;

import com.sap.hybris.tdd.labs.basics.mockito.model.UserModel;

/**
 * Provides functionality to get information related with users.
 */
public interface UserService {

    /**
     * Returns a currently logged in user.
     * @return the logged in user.
     */
    UserModel getCurrentUser();
}

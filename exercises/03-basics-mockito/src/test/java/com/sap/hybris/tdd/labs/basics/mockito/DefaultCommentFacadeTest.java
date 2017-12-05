package com.sap.hybris.tdd.labs.basics.mockito;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.sap.hybris.tdd.labs.basics.mockito.model.CommentModel;
import com.sap.hybris.tdd.labs.basics.mockito.model.ProductModel;
import com.sap.hybris.tdd.labs.basics.mockito.model.UserModel;
import com.sap.hybris.tdd.labs.basics.mockito.service.CommentService;
import com.sap.hybris.tdd.labs.basics.mockito.service.PermissionService;
import com.sap.hybris.tdd.labs.basics.mockito.service.UserService;

// TODO 00 tests that will be modified within exercises will not cover all branches. We want you to focus on Mockito basics.
public class DefaultCommentFacadeTest {

    private DefaultCommentFacade facade;

    // TODO 01 make those three services as mocks (use annotations and don't forget to register the Mockito runner).
    private UserService userService;
    private PermissionService permissionService;
    private CommentService commentService;

    @Before
    public void setup() {
        facade = new DefaultCommentFacade(userService, permissionService, commentService);
    }

    // TODO 02 the test will verify that a user can add comment to a project.
    @Test
    public void addCommentToProductWhenUserHasGrantedPermissions() {
        // given
        final String commentMessage = "new comment";

        // TODO 02.01 create user and product mocks.
        final UserModel user = null;
        final ProductModel product = null;

        // TODO 02.02 returns mocked user as current user (UserSerivce#getCurrentUser).

        // TODO 02.03 grants the user permissions to create a new comment (PermissionService#canUserCreate).

        // TODO 02.04 returns a new comment with correct message on call commentService#createComment.

        // when
        // TODO 02.05 uncomment the bellow line.
        // final boolean result = facade.addComment(user, commentMessage);

        // then
        // TODO 02.06 verify that the result is true and run the test (should pass).

        // TODO 02.07 verify that the new comment has been added to the model (commentService#addComment) and run the
        // test (should pass).

        // TODO 02.08 (optional) use the ArgumentCaptor to verify that the message of the comment is equal to the
        // commentMessage and run the test (should pass).

    }

    // TODO 03 the test will verify that a user can read only those comments to which he has permissions.
    @Test
    public void getCommentsWhenUserHasGrantedPermissionsToHalfOfThem() {
        // given
        // TODO 03.01 create user and product mocks.
        final UserModel user = null;
        final ProductModel product = null;

        // TODO 03.02 returns mocked user as current user (UserSerivce#getCurrentUser).


        final CommentModel comment1 = new CommentModel("comment 1");
        final CommentModel comment2 = new CommentModel("comment 2");
        final CommentModel comment3 = new CommentModel("comment 3");
        final List<CommentModel> comments = Arrays.asList(comment1, comment2, comment3);
        // TODO 03.03 returns comments list on commentService#getComments(product).

        // TODO 03.04 configure permission service that the user has permissions to read only comment1 and comment3.

        // when
        // TODO 03.05 uncomment the bellow line.
        // final List<CommentModel> result = facade.getComments(product);

        // then
        // TODO 03.06 verify that the result contains only comment1 and comment3 and run test (should pass).

        // TODO 03.07 verify that the PermissionService#canUserRead was called 3 times and run test (should pass).

        // TODO 03.08 verify that the PermissionService#canUserRead was called for every comment and run test (should
        // pass).
    }
}

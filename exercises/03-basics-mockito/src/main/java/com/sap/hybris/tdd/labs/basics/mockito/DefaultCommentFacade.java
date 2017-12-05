package com.sap.hybris.tdd.labs.basics.mockito;

import java.util.List;
import java.util.stream.Collectors;

import com.sap.hybris.tdd.labs.basics.mockito.model.CommentModel;
import com.sap.hybris.tdd.labs.basics.mockito.model.Model;
import com.sap.hybris.tdd.labs.basics.mockito.model.UserModel;
import com.sap.hybris.tdd.labs.basics.mockito.service.CommentService;
import com.sap.hybris.tdd.labs.basics.mockito.service.PermissionService;
import com.sap.hybris.tdd.labs.basics.mockito.service.UserService;

public class DefaultCommentFacade implements CommentFacade {

    private final UserService userService;
    private final PermissionService permissionService;
    private final CommentService commentService;

    public DefaultCommentFacade(final UserService userService, final PermissionService permissionService,
            final CommentService commentService) {
        this.userService = userService;
        this.permissionService = permissionService;
        this.commentService = commentService;
    }

    @Override
    public boolean addComment(final Model model, final String commentMessage) {
        final UserModel currentUser = userService.getCurrentUser();
        if (permissionService.canUserCreate(currentUser, CommentModel.class)) {
            final CommentModel comment = commentService.createComment(commentMessage);
            commentService.addComment(model, comment);
            return true;
        }
        return false;
    }

    @Override
    public List<CommentModel> getComments(final Model model) {
        final UserModel currentUser = userService.getCurrentUser();
        final List<CommentModel> comments = commentService.getComments(model);
        return comments.stream()//
                .filter(comment -> permissionService.canUserRead(currentUser, comment))//
                .collect(Collectors.toList());
    }
}

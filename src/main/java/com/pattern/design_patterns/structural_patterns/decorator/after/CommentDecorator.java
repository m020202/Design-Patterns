package com.pattern.design_patterns.structural_patterns.decorator.after;

public class CommentDecorator implements CommentService {
    private CommentService commentService;

    public CommentDecorator(CommentService commentService) {
        this.commentService = commentService;
    }

    @Override
    public void addComment(String comment) {
        commentService.addComment(comment);
    }
}

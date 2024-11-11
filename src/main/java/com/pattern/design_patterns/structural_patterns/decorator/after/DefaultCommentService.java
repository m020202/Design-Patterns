package com.pattern.design_patterns.structural_patterns.decorator.after;

public class DefaultCommentService implements CommentService {
    @Override
    public void addComment(String comment) {
        System.out.println(comment);
    }
}

package com.pattern.design_patterns.structural_patterns.decorator.before;

public class TrimmingCommentService extends CommentService {
    @Override
    public void addComment(String comment) {
        super.addComment(trim(comment));
    }

    private String trim(String comment) {
        return comment.replace("...", "");
    }

}

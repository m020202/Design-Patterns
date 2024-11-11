package com.pattern.design_patterns.structural_patterns.decorator.after;

public class App {
    private static boolean enabledSpamFilter = true;
    private static boolean enableTrimming = true;
    public static void main(String[] args) {
        CommentService commentService = new DefaultCommentService();

        if (enabledSpamFilter) {
            commentService = new SpamFilteringCommentDecorator(commentService);
        }

        if (enableTrimming) {
            commentService = new TrimmingCommentDecorator(commentService);
        }

        Client client = new Client(commentService);
        client.writeComment("오징어게임");
        client.writeComment("보는게 하는거보다 재밌을 수가 없지...");
        client.writeComment("http://naver.com");
    }
}

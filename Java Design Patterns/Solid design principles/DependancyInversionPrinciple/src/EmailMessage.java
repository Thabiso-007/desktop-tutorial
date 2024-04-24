// Concrete implementation of Message for email
class EmailMessage implements Message {
    private String content;

    public EmailMessage(String content) {
        this.content = content;
    }

    @Override
    public String getContent() {
        return content;
    }
}
// Concrete implementation of Message for SMS
class SMSMessage implements Message {
    private String content;

    public SMSMessage(String content) {
        this.content = content;
    }

    @Override
    public String getContent() {
        return content;
    }
}
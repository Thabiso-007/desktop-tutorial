// High-level module that depends on the Message abstraction
class MessageSender {
    private Message message;

    public MessageSender(Message message) {
        this.message = message;
    }

    public void sendMessage() {
        System.out.println("Sending message: " + message.getContent());
        // Code to send the message...
    }
}
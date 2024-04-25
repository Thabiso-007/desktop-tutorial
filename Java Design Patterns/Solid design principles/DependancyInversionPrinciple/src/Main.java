//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /**
         * The Dependency Inversion Principle (DIP) is another essential
         * principle in object-oriented design, which suggests that high-level
         * modules should not depend on low-level modules but both should depend
         * on abstractions
         */

        // Using EmailMessage
        Message emailMessage = new EmailMessage("Hello, this is an email message.");
        MessageSender emailSender = new MessageSender(emailMessage);
        emailSender.sendMessage();

        // Using SMSMessage
        Message smsMessage = new SMSMessage("Hello, this is an SMS message.");
        MessageSender smsSender = new MessageSender(smsMessage);
        smsSender.sendMessage();
    }
}
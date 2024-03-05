// Driver class
public class MessagingApp {
    public static void main(String[] args) {
        Message message = new TextMessage("Hello! How is it going?", "Sophia");
        message.send(); //Sending text message to Sophia: Hello! How is it going?

        Message emojiMessage = new EmojiMessageDecorator(message, ";p");
        emojiMessage.send(); //Sending message with emoji: Hello! How is it going? ;p

        Message boldMessage = new BoldMessageDecorator(message);
        boldMessage.send(); //Sending message with bold text: <b>Hello! How is it going?</b>
    }
}
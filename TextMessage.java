// Concrete component
class TextMessage implements Message{
    private String text;
    private String recipient;

    public TextMessage(String text, String recipient){
        this.text = text;
        this.recipient = recipient;
    }

    @Override
    public void send() {
        System.out.println("Sending text message to " + recipient + ": " + text);
    }

    @Override
    public String toString() {
        return text;
    }
}


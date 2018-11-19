public class MessageList {
    private String number;
    private String message;

    public MessageList(String number, String message) {
        this.number = number;
        this.message = message;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "MessageList{" +
                "number='" + number + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}

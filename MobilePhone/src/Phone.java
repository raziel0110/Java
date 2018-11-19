public interface Phone {

    void addContact(Contact contact);
    void deleteContact(int id);
    void listContact();

    void call(String phoneNumber);
    void viewHistory();

    void sendMessage(String number,String text);
    void listMessages(String number);

}

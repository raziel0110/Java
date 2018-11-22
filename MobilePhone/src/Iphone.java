public abstract class Iphone implements Phone {
    private int batteryLife = 10;
    private int i;
    private int k;
    private int m;
    private ListOfContacts[] contacts = null;
    private HistoryList[] calls = null;
    private MessageList[] messages = null;

    public Iphone() {
        this.i = 0;
        this.k = 0;
        this.m = 0;
        this.contacts = new ListOfContacts[3];
        this.calls = new HistoryList[10];
        this.messages = new MessageList[10];
    }



    @Override
    public void addContact(Contact contact) {
        ListOfContacts listOfContact = new ListOfContacts(contact);
        contacts[i] = listOfContact;
        i++;
    }

    @Override
    public void deleteContact(int id) {
       for( int j = 0; j < contacts.length; j++){
           if(contacts[j] !=  null && contacts[j].getContact().getId() == id){
               contacts[j] = null;
           }
       }

    }

    @Override
    public void listContact() {
        System.out.println("Contacts:");
        System.out.println("-----------------------------------------------------------");
        for (ListOfContacts contact: contacts) {
            if(contact != null){
                System.out.println(contact.getContact().toString());
            }
        }

    }

    @Override
    public void call(String phoneNumber){
        HistoryList historyList = new HistoryList(phoneNumber);
        calls[k] = historyList;
        k++;
        System.out.println("Ati apelat: "+phoneNumber);
    }

    @Override
    public void viewHistory(){
        System.out.println("calls history:");
        System.out.println("===============================");
        for (HistoryList call:calls) {
            if( call != null){
                System.out.println(call.getNumber().toString());
            }
        }
    }

    @Override
    public void sendMessage(String number, String text){
        if(text.length() < 500) {
            MessageList messageList = new MessageList(number, text);
            messages[m] = messageList;
            m++;
            System.out.println("Ati trimis mesaj la numarul: " + number);
        } else {
            System.out.println("Your message is greater than 500 chars!");
        }
    }

    @Override
    public void listMessages(String number){
        System.out.println("List all messages from this "+ number +" number");
        System.out.println("====================================================");
        for (MessageList message:messages) {
            if(message != null && message.getNumber() == number) {
                System.out.println(message.getMessage().toString());
                }
            }
        }

    public int getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    public void getBatteryLifeAfterSendMessage(){

          if( batteryLife > 1){
              batteryLife -= 1;
              System.out.println("Your battery is about: "+batteryLife+" hours time left");
          } else {
              System.out.println("Low battery!");
          }

    }

    public void getBatteryLifeAfterCall(){
        if( batteryLife > 2){
            batteryLife -= 2;
            System.out.println("Your battery is about: "+batteryLife+" hours time left");
        } else {
            System.out.println("Low battery!");
        }
    }
}

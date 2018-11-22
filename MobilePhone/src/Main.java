public class Main {

    public static void main(String[] args) {

        Phone iphone = new Iphone7();

        Contact cont1 = new Contact(1, "Alban", "Gabriel", "0756028001");
        Contact cont2 = new Contact(2, "Lupan", "Nelu", "0740040913");
        Contact cont3 = new Contact(3,"John","Doe","0744236809");

        iphone.addContact(cont1);
        iphone.addContact(cont2);
        iphone.addContact(cont3);

       iphone.deleteContact(1);

        iphone.listContact();

        iphone.call("0756028001");
        ((Iphone7) iphone).getBatteryLifeAfterCall();
        iphone.call("0145647247");
        ((Iphone7) iphone).getBatteryLifeAfterCall();
        iphone.call("0753068270");
        ((Iphone7) iphone).getBatteryLifeAfterCall();
        iphone.viewHistory();

        iphone.sendMessage("0753068270","Salut!");
        ((Iphone7) iphone).getBatteryLifeAfterSendMessage();
        iphone.sendMessage("0753068270","Iti iese tema?");
        ((Iphone7) iphone).getBatteryLifeAfterSendMessage();
        iphone.sendMessage("0756028001","hdakdjlasjdadas");

        iphone.listMessages("0756028001");
    }

}

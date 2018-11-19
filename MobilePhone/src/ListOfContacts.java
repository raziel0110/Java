public class ListOfContacts {
     private Contact contact;

    public ListOfContacts(Contact contact) {
        this.contact = contact;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "ListOfContacts{" +
                "contact=" + contact +
                '}';
    }
}

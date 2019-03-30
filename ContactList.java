import java.util.*;

public class ContactList {
    Map<String, ContactBase> addressBook;

    public ContactList(){
        addressBook = new HashMap<>();
    }
    /*
     * You can use the base class in stead of "Object"!
     */
    public void add(ContactBase contact){
        addressBook.put(contact.getFirst(), contact);
    }
    public boolean delete(String key){
        if (addressBook.get(key)!=null){
            addressBook.remove(key);
            return true;
        }
        return false;
    }
    public ContactBase search(String key){
        return addressBook.get(key);
    }
    public String toString(){
        String result = "";
        for (Map.Entry<String, ContactBase> entry : addressBook.entrySet()) {
            result += entry.getValue().toString() + "\n";
        }
        return result;
    }
}

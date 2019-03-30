public class Driver {
    public static void main(String[] args) {
        ContactList addressBook1 = new ContactList();
        //Making a personal account
        Personal p1 = new Personal("Shinya", "Aoi", "saoi@uw.edu", "206-551-1104","05/09/1994");
        addressBook1.add(p1);
        System.out.println("You created a new address:");
        System.out.println(p1);
        System.out.println();
        //System.out.println(addressBook1.search(p1.getFirst()));


        //making a business account
        Business b1 = new Business("Kenji", "Saito", "keiji@gmail.com",
                "208-559-3782", "Amazon", "Software Engineer II");
        addressBook1.add(b1);
        System.out.println("You created a new ");
        System.out.println(b1);
        System.out.println();

        //addressBook1.delete(p1.getFirst());
        System.out.println("Searching for Kim...");
        if (addressBook1.search("Kim")==null){
            System.out.println("The address does not exist!");
        }
        else{
            System.out.println("Your searching result:");
            System.out.println(addressBook1.search("Kim"));
        }
        System.out.println();
        System.out.println("Searching for Shinya...");
        if(addressBook1.search("Shinya")==null){

        }
        else {
            System.out.println(addressBook1.search("Shinya"));
        }
        System.out.println();

        System.out.println("Your current address book is:");
        System.out.println("Your address book is: \n" + addressBook1.toString());
        System.out.println();

        System.out.println("Deleting Shinya from the address book...");
        if (addressBook1.delete("Shinya")){
            System.out.println("Account called Shinya is deleted!");
            System.out.println("Your current address book is:");
            System.out.println(addressBook1.toString());
        }
    }
}

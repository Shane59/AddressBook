public class ContactBase {
    private String first;
    private String last;
    private String email;
    private String phone;

    public ContactBase(String first, String last, String email, String phone){
        this.first = first;
        this.last = last;
        this.email = email;
        this.phone = phone;
    }

    public ContactBase() {
    }

    protected String getFirst(){
        return this.first;
    }
    protected String getLast(){
        return this.last;
    }
    protected String getEmail(){
        return this.email;
    }
    protected String getPhone(){
        return this.phone;
    }
    protected void setFirst(String first){
        this.first = first;
    }
    protected void setLast(String last){
        this.last = last;
    }
    protected void setEmail(String email){
        this.email = email;
    }
    protected void setPhone(String phone){
        this.phone = phone;
    }
}

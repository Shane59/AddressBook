public class Personal extends ContactBase {
    private String birthday;

    public Personal(String first, String last, String email, String phone, String birthday) {
        super(first, last, email, phone);
        this.birthday = birthday;
    }
    protected String getFirst(){
        return super.getFirst();
    }
    protected String getLast(){
        return super.getLast();
    }
    protected String getEmail(){
        return super.getEmail();
    }
    protected String getPhone(){
        return super.getPhone();
    }
    protected String getBirthday(){
        return this.birthday;
    }
    protected void setFirst(String first){
        super.setFirst(first);
    }
    protected void setLast(String last){
        super.setLast(last);
    }
    protected void setEmail(String email){
        super.setEmail(email);
    }
    protected void setPhone(String phone){
        super.setPhone(phone);
    }
    protected void setBirthday(String birthday){
        this.birthday = birthday;
    }
    public String toString(){
        return getLast() + " " +getFirst() + " Email: " + getEmail() + " Phone: " + getPhone() + " Birthday: " + getBirthday();
    }
}

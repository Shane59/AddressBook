public class Business extends ContactBase {
    private String organization;
    private String jobTitle;

    public Business(String first, String last, String email, String phone, String organization, String jobTitle) {
        super(first, last, email, phone);
        this.organization = organization;
        this.jobTitle = jobTitle;
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
    protected String getOrganization(){
        return this.organization;
    }
    protected String getJobTitle(){
        return this.jobTitle;
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
    protected void setOrganization(String organization){
        this.organization = organization;
    }
    protected void setJobTitle(String jobTitle){
        this.jobTitle = jobTitle;
    }
    public String toString(){
        return getLast() + " " + getFirst() + " Email: "+ getEmail() + " Phone: " +
                " Organization: " + " Job Title: "+ getJobTitle();
    }
}

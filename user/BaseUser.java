package user;

public class BaseUser {
    private String firstName;
    private String lastName;

    BaseUser(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public void setFirstName (String firstName){
        this.firstName = firstName;
    }

}

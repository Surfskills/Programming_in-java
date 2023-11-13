package user;

public class AdminUser extends BaseUser {
    private String staffid;

   AdminUser(String firstName, String lastName, String staffid){
    super(firstName, lastName);
    this.staffid = staffid;
   }

    
}
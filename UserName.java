public class UserName {
   interface UserNameService {
      String UserName(String firstname, String lastname);
   }

 public static void main(String[] args) {
      
UserNameService UserNameService=(String firstname, String lastname) -> 
{ String UserName="Hello " + firstname + " " + lastname; return UserName; };
System.out.println(UserNameService.UserName(args[0], args[1]));
        
    }
}
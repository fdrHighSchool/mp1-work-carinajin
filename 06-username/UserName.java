import java.util.Scanner;

public class UserName {
  public static void main(String[] args) {
    // create Scanner object
    Scanner s = new Scanner(System.in);
    
    // get String input from user
    System.out.print("Are you a student or teacher? ");
    String role = s.nextLine();
    System.out.print("Enter your first name: ");
    String firstName = s.nextLine();
    System.out.print("Enter your last name: ");
    String lastName = s.nextLine();
    System.out.print("Enter your favorite number: ");
    String favNum = s.nextLine();
    if (role.equals("student")) {
        System.out.print("");
    }
    
    // test output
    System.out.println("Hello " + initialize(firstName) + "." + initialize(lastName) + ". " + favNum);

    s.close();
  } // end main method

  /*
   * Name: initialize
   * Purpose: send back the first character (inital) of a name
   * Input: a name (String)
   * Return: a single character (String)
   */
  public static String initialize(String n) {
    return n.substring(0, 1);
  } // end initialize method
  public static String generatePassword(int length) {
      String password;
      return password;
  }

} // end class

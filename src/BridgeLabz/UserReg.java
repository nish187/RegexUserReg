package BridgeLabz;


    import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

    public class UserReg {
        public static void main(String[] args) {
            UserReg userRegistration = new UserReg();
            userRegistration.validFirstName();
        }
        public void validFirstName() {
            Pattern pattern = Pattern.compile("^[A-Z]+[a-zA-Z]{2,}[0-9]*$");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter user firstname");
            String firstName = scanner.next();

            Matcher matcher = pattern.matcher(firstName);
            if (matcher.matches()) {
                System.out.println("First name is valid");
            } else {
                System.out.println("First name is Invalid");
            }
        }
}

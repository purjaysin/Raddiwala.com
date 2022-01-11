import java.util.*;

class CrewLogChamber {
    public static void main(String args[]) {
        CrewLogChamber chamberDoor = new CrewLogChamber();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter chamber password: ");
        String input = scanner.next();
	if (chamberDoor.checkPassword(input)) {
	    System.out.println("Access granted.");
	} else {
	    System.out.println("Access denied!");
        }
    }

    public boolean checkPassword(String password) {
	return password.length() == 21 &&
               password.charAt(0)  == 'p' &&
               password.charAt(14) == '1' &&
               password.charAt(4)  == '3' &&
               password.charAt(2)  == 'a' &&
               password.charAt(7) == 'n' &&
               password.charAt(19)  == '2' &&
               password.charAt(5) == 't' &&
               password.charAt(10)  == 'e' &&
               password.charAt(1)  == '1' &&
               password.charAt(8) == 'i' &&
               password.charAt(17)  == '4' &&
               password.charAt(9)  == '9' &&
               password.charAt(20) == '0' &&
               password.charAt(3) == 'n' &&
               password.charAt(12)  == '1' &&
               password.charAt(18) == '3' &&
               password.charAt(6) == '_' &&
               password.charAt(11) == '_' &&
               password.charAt(16)  == '1' &&
               password.charAt(13)  == '6' &&
               password.charAt(15) == '1';
    }
}
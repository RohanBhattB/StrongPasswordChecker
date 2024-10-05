import java.io.*;
import java.util.*;

public class main {

    // method to check whether the password is Strong
    public static boolean check_pass(String pass) throws IOException {
        boolean StrongPass = true;

        // if password has fewer than 7 characters
        if (pass.length() < 7) {
            System.out.println("Your Password must contain at least 7 characters");
            StrongPass = false;
        }

        // if password has at least one number in it
        if (!containnumber(pass)) {
            System.out.println("Your password must contain at least one number");
            StrongPass = false;
        }

        // if password has at least one special character
        if (!containsc(pass)) {
            System.out.println("Your password must contain at least one special character");
            StrongPass = false;
        }

        // check if password is in the default password file
        if (isincommonpass(pass, "esample.txt")) {
            System.out.println("Your password is too common");
            StrongPass = false;
        }

        if (StrongPass) {
            System.out.println("Your Password Looks Great!!");
        }

        return StrongPass;
    }

    public static boolean containnumber(String pass) {
        for (char ch : pass.toCharArray()) {
            if (ch >= '0' && ch <= '9') {
                return true;
            }
        }
        return false;
    }

    public static boolean containsc(String pass) {
        String SpecialCharacters = "!@#$%^&*(),.?\\\":{}|<>";
        for (char ch : pass.toCharArray()) {
            if (SpecialCharacters.indexOf(ch) != -1)
                return true;
        }
        return false;
    }

    public static boolean isincommonpass(String pass, String filename) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = bf.readLine()) != null) {
            if (line.trim().equals(pass)) {
                bf.close();
                return true; // if it's in list
            }
        }
        bf.close();
        return false;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Password: ");
        String pass = sc.nextLine();

        try {
            if (check_pass(pass)) {
                System.out.println("Password is Strong");
            } else {
                System.err.println("Password isn't Suitable");
            }
        } catch (Exception e) {
            System.err.println("Error in reading the file");
        }
        sc.close();
    }
}

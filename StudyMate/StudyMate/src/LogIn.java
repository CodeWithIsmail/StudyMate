import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        boolean check = false;
        do {
            Scanner scn = new Scanner(System.in);
            System.out.println("Enter email:");
            String mail = scn.nextLine();
            System.out.println("Enter Password:");
            String pass = scn.nextLine();

            String file_name = "User.txt";

            try {
                FileReader fileReader = new FileReader(file_name);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    String[] info = line.split(",");
                    // 3 = mail 4 = pass
                    if (info[3].equals(mail) && info[4].equals(pass)) {
                        check = true;
                        break;
                    }
                }
                bufferedReader.close();
                fileReader.close();
            } catch (IOException exception) {
                exception.printStackTrace();
            }

            if (!check) {
                System.out.println("Email or Password mismatch! Try again.");
            } else {
                System.out.println("Log In successfull.");
            }
        } while (!check);
    }
}

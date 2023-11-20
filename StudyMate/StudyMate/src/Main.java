import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        String fileName = "currentuser.txt";
        String user_name = "";

        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                user_name = line;
            }
            bufferedReader.close();
            fileReader.close();
        } catch (Exception ex) {
            //   JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        if (user_name.equals(""))
            new LogInPage().login();
        else {
            new HomePage(user_name).homepage();
        }
    }
}
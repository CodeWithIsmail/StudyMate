import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class HomePage {
    Scanner scn = new Scanner(System.in);

    public void show_user_info(String user_name) {

        String file_name = "User.txt";
        String[] user_info = new String[0];

        try {
            FileReader fileReader = new FileReader(file_name);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] info = line.split(",");
                if (info[2].equals(user_name)) {
                    user_info = info;
                    break;
                }
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }

//        for(String x:user_info) System.out.println(x);
        System.out.println("Welcome: " + user_name);
        System.out.println();
        System.out.println("Personal Info:");
        System.out.println("Username: " + user_info[2]);
        System.out.println("Name: " + user_info[0] + " " + user_info[1]);
        System.out.println("Email: " + user_info[3]);
        System.out.println("\n\n");
        System.out.println("1. View Enrolled course");
        System.out.println("2. Enroll new course");
        System.out.println("3. Upcoming Events");
        System.out.println("4. Due Classwork and Assignments");
        System.out.println("5. Daily To Do List");

        System.out.println("\nEnter option:");
        int option = scn.nextInt();
        if (option == 1) {
            HomePage homePage = new HomePage();
            homePage.show_course_info(user_name);
        } else if (option == 2) {

        } else if (option == 3) {

        } else if (option == 4) {

        }

    }

    public void show_course_info(String username) {
        String file_name = "student_info.txt";
        String[] course_info = new String[0];

        try {
            FileReader fileReader = new FileReader(file_name);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line="";
//            System.out.println(username);
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                System.out.println(username);

                if (line .equals(username)) {
                    line = bufferedReader.readLine();

                   String info[] = line.split(",");
                   course_info=info;
                    break;
                }
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        System.out.println("\nEnrolled Courses");
//        System.out.println(course_info.length);
        for (String course : course_info) {
            System.out.println(course);
        }
    }
}

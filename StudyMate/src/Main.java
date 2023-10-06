public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("ismail", "hossain", "CodeWithIsmail", "ismail@gmail.com", "123");
        System.out.println(student1.toString());
        Course NE = new Course("Numerical Analysis", "MATH 304","a",3,1,2);
        System.out.println(NE.toString());
        Book java=new Book("java","java.com");
        System.out.println(java.toString());
    }
}
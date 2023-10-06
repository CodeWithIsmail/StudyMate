public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("ismail", "hossain", "CodeWithIsmail", "ismail@gmail.com", "123");
        System.out.println(student1.toString());
        Course NE = new Course("Numerical Analysis", "MATH 304", "a", 3, 1, 2);
        System.out.println(NE.toString());
        Book java = new Book("java", "java.com");
        System.out.println(java.toString());
        Result result = new Result("se 306", 12.8, 15.5, 40, 3.0, "A-");
        System.out.println(result.toString());
        Event event = new Event("networking assignment","10 pm","11.30 pm","9 oct 23");
        System.out.println(event.toString());
    }
}
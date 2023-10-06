public class Course {
    private String course_name;
    private String course_code;
    private String course_teacher;
    private int credit;
    private int lab_credit;
    private int theory_credit;

    @Override
    public String toString() {
        return "Course{" +
                "course_name='" + course_name + '\'' +
                ", course_code='" + course_code + '\'' +
                ", course_teacher='" + course_teacher + '\'' +
                ", credit=" + credit +
                ", lab_credit=" + lab_credit +
                ", theory_credit=" + theory_credit +
                '}';
    }

    public Course(String course_name, String course_code, String course_teacher, int credit, int lab_credit, int theory_credit) {
        this.course_name = course_name;
        this.course_code = course_code;
        this.course_teacher = course_teacher;
        this.credit = credit;
        this.lab_credit = lab_credit;
        this.theory_credit = theory_credit;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getCourse_code() {
        return course_code;
    }

    public void setCourse_code(String course_code) {
        this.course_code = course_code;
    }

    public String getCourse_teacher() {
        return course_teacher;
    }

    public void setCourse_teacher(String course_teacher) {
        this.course_teacher = course_teacher;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getLab_credit() {
        return lab_credit;
    }

    public void setLab_credit(int lab_credit) {
        this.lab_credit = lab_credit;
    }

    public int getTheory_credit() {
        return theory_credit;
    }

    public void setTheory_credit(int theory_credit) {
        this.theory_credit = theory_credit;
    }
}

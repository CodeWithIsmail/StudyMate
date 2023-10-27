import java.util.PrimitiveIterator;

public class Result {
    private String course_code;
    private double mid;
    private double lab;
    private double fin;
    private double gradePoint;
    private String grade;


    public Result(String course_code, double mid, double lab, double fin, double gradePoint, String grade) {
        this.course_code = course_code;
        this.mid = mid;
        this.lab = lab;
        this.fin = fin;
        this.gradePoint = gradePoint;
        this.grade = grade;
    }

    public String getCourse_code() {
        return course_code;
    }

    public void setCourse_code(String course_code) {
        this.course_code = course_code;
    }

    public double getMid() {
        return mid;
    }

    public void setMid(double mid) {
        this.mid = mid;
    }

    public double getLab() {
        return lab;
    }

    public void setLab(double lab) {
        this.lab = lab;
    }

    public double getFin() {
        return fin;
    }

    public void setFin(double fin) {
        this.fin = fin;
    }

    public double getGradePoint() {
        return gradePoint;
    }

    public void setGradePoint(double gradePoint) {
        this.gradePoint = gradePoint;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Result{" +
                "course_code='" + course_code + '\'' +
                ", mid=" + mid +
                ", lab=" + lab +
                ", fin=" + fin +
                ", gradePoint=" + gradePoint +
                ", grade='" + grade + '\'' +
                '}';
    }
}


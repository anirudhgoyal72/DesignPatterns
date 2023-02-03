package PrototypeAndRegistry;

public class Student implements Prototype<Student>{
    private int age;
    private int yoe;

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", yoe=" + yoe +
                ", gradYear=" + gradYear +
                ", name='" + name + '\'' +
                ", bacthName='" + bacthName + '\'' +
                ", averagePsp=" + averagePsp +
                ", yearEnrolled=" + yearEnrolled +
                '}';
    }

    private int gradYear;

    public Student(Student student) {
        this.bacthName = student.bacthName;
        this.averagePsp = student.averagePsp;
        this.yearEnrolled = student.yearEnrolled;
    }


    public Student()
    {

    }
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYoe() {
        return yoe;
    }

    @Override
    public Student clone() {
        return new Student(this);
    }

    public void setYoe(int yoe) {
        this.yoe = yoe;
    }

    public int getGradYear() {
        return gradYear;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBacthName() {
        return bacthName;
    }

    public void setBacthName(String bacthName) {
        this.bacthName = bacthName;
    }

    public int getAveragePsp() {
        return averagePsp;
    }

    public void setAveragePsp(int averagePsp) {
        this.averagePsp = averagePsp;
    }

    public int getYearEnrolled() {
        return yearEnrolled;
    }

    public void setYearEnrolled(int yearEnrolled) {
        this.yearEnrolled = yearEnrolled;
    }

    private String bacthName;
    private int averagePsp;
    private int yearEnrolled;
}

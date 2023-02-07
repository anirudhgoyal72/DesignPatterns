package PrototypeAndRegistry;


public class Client {
    public static void main(String[] args) {
        Registry registry=new Registry();
        Student student=new Student();
        student.setBacthName("may");student.setAveragePsp(80);student.setYearEnrolled(2021);
        registry.setMap(student);

        Student student1=registry.getStudent(student).clone();
        student1.setYoe(2);student1.setAge(23);student1.setName("Anirudh");student1.setGradYear(2022);
        System.out.println(student1);




    }


}

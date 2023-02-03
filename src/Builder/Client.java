package Builder;

public class Client{
    public static void main(String[] args) {
        Student student= Student.builder()
                .setBatchName("jk")
                .setGradYear(2022)//returning same object while chaining also
                .setId(1)
                .setName("Anirudh")
                .setPsp(81)
                .setYoe(1)
                .build();


    }
}

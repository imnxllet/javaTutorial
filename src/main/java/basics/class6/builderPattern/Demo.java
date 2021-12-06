package basics.class6.builderPattern;

import basics.class6.builderPattern.data.Student;

public class Demo {

    public static void main(String[] args) {
        //User user = new User("Chris", "Lu", 12, "6479872423", "China, GuangZhou");
        //User user1 = new User("MC", "Jin", null, null, null);

        //User user = new User();
        //user.setFirstName();

        Student student = Student.builder().firstName("Chris").lastName("Lu").build();
        Student student1 = Student.builder().firstName("MC").lastName("Jin").build();
    }
}

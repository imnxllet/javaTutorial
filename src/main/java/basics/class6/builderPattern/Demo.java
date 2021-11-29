package basics.class6.builderPattern;

import basics.class6.builderPattern.data.User;

public class Demo {

    public static void main(String[] args) {
        //User user = new User("Chris", "Lu", 12, "6479872423", "China, GuangZhou");
        //User user1 = new User("MC", "Jin", null, null, null);

        //User user = new User();
        //user.setFirstName();

        User user = new User.UserBuilder().firstName("Chris").lastName("Lu").age(12).phone("6479872423").address("China, GuangZhou").build();
        User user1 = new User.UserBuilder().firstName("MC").lastName("Jin").build();
    }
}

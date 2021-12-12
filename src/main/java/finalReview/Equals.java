package finalReview;

public class Equals {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();

        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));

        System.out.println("------------------------");

        String a = "a";
        String b = "a";
        String c = new String("a");

        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println(b == c);

        System.out.println("------------------------");


        Integer i = new Integer(1);
        Integer j = 1;

        System.out.println(i == j);
        System.out.println(i.equals(j));
    }

    static class Person {
        private String id = "Chris";

        public Person() {}

        @Override
        public boolean equals(Object obj) {
            return this.id.equals(((Person) obj).id);
        }
    }
}

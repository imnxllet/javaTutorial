package basics.designPatterns.builderPattern.data;

public class Student {
    private String username;
    private String firstName;
    private String lastName;

    public Student(String username, String firstName, String lastName) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static StudentBuilder builder() {
        return new StudentBuilder();
    }

    public static class StudentBuilder {
        private String username;

        private String firstName;

        private String lastName;

        public StudentBuilder username(final String username) {
            this.username = username;
            return this;
        }

        public StudentBuilder firstName(final String firstName) {
            this.firstName = firstName;
            return this;
        }

        public StudentBuilder lastName(final String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Student build() {
            return new Student(username, firstName, lastName);
        }
    }
}
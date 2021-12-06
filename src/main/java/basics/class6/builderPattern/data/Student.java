package basics.class6.builderPattern.data;

public class Student {
    private String username;
    private String password;
    private String firstName;
    private String lastName;

    public Student() {

    }

    public Student(String username, String firstName, String lastName) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static StudentBuilder builder() {
        return new StudentBuilder();
    }

    public static class StudentBuilder {

        private String username;

        private String password;

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
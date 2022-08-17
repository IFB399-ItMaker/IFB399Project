public enum TeamStatus{ //Whether the student is joining or forming a team
    JOIN, FORM
}

public class Student {
    private int id;
    private String surname;
    private String firstName;
    private String email;
    private String password;

    private TeamStatus status;
    private boolean host;
}
public enum TeamStatus{ //Whether the student is joining or forming a team
    JOIN, FORM
}

public class Student {
    private int id;
    private String surname;
    private String firstName;
    private String email;
    private String password;

    public TeamStatus status;
    private Membership membership;

    /* Student forms a team. Creates new membership with constructor that automatically forms new team
    and makes the Student the host.*/
    public void FormTeam(){
        status = TeamStatus.FORM;
        membership = new Membership();
    }
}
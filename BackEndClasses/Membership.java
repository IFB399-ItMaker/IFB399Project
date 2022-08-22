public class Membership{
    private int teamID;
    private boolean host;

    /* Constructor for Membership in the case that a Student is forming a team. Create new Team and
    student is the host.*/
    public Membership() { //Create new Team and student is the host
        //1. Create new team in the database.
        //2. Get unique teamID from database (unique primary key).
        //3. this.teamID = database teamID.
        host = true;

        throw new NotImplementedException();
    }

    /* Constructor for Membership in the case that Student has joined an existing team.*/
    public Membership(int teamID){
        this.teamID = teamID;
        this.host = false;
    }
}
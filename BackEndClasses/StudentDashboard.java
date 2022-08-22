public static class StudentDashboard extends Dashboard {
    /* Edits the details on the student's profile in the database and referenced classes.*/
    public void EditDetails(){
        throw new NotImplementedException();
    }

    /* Sets the TeamStatus (enum in Student class) of student. Doesn't check elligibility.*/
    public void SetStatus(int status){
        switch (status){
            case 0:
                student.status = TeamStatus.JOIN;
                break;
            case 1:
                student.FormTeam();
                break;
        }
    }
}
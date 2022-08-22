public static class Dashboard {
    //The student logged into the application.
    private Student student;

    /* Opens SearchPage.html. Needs to be overwritten by implementing classes. SearchPage.html results will
    be dependent on student.status, and if status == FORM, is dependent on student.membership.host (must
    be true).*/
    public void Search(){
        throw new NotImplementedException();
    }

    /* Opens other kind of Dashboard. Needs to be overwritten by implementing classes. StudentDashboard
    goes to TeamDashboard, and TeamDashboard goes to StudentDashboard.*/
    public void ToggleDashboard(){
        throw new NotImplementedException();
    }

    /* Opens Message.html. Needs to be overwritten by implementing classes. Message.html results will
    be dependent on student.status, and if status == FORM, is dependent on student.membership.host (must
    be true).*/
    public void ViewContact(){
        throw new NotImplementedException();
    }
}
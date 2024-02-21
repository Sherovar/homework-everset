package src.library.users;

public class Librarian extends User {
    private int workExperience;

    public Librarian(String login, String password, String firstName, String lastName, int workExperience) {
        super(login, password, firstName, lastName, "librarian");
        this.workExperience = workExperience;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }
}

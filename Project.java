package KLEF.Hibernate_CRUD;
public class Project {
    private int id;
    private String projectName;
    private int duration;
    private int budget;
    private String teamLead;

    // Default constructor
    public Project() {
    }

    // Parameterized constructor
    public Project(String projectName, int duration, int budget, String teamLead) {
        this.projectName = projectName;
        this.duration = duration;
        this.budget = budget;
        this.teamLead = teamLead;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public String getTeamLead() {
        return teamLead;
    }

    public void setTeamLead(String teamLead) {
        this.teamLead = teamLead;
    }
}

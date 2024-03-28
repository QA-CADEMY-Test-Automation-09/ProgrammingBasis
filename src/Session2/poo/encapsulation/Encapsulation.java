package Session2.poo.encapsulation;

public class Encapsulation {
    //Declaring the variables as private
    private String slackName;
    private String slackProfile;
    private int slackAge;

    //declaring 'public' Setter and Getter Methods
    public void setName(String slackName) {
        this.slackName = slackName;
    }

    public String getName() {
        return slackName;
    }

    public void setProfile(String slackProfile) {
        this.slackProfile = slackProfile;
    }

    public String getProfile() {
        return slackProfile;
    }

    public void setAge(int slackAge) {
        this.slackAge = slackAge;
    }

    public int getAge() {
        return slackAge;
    }
}

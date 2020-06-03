package builderpatters.example1;

public class Robot implements RobotPlan{

    private String robotHead;
    private String robotTorso;
    private String robotArms;
    private String robotLegs;


    @Override
    public void setRobotHead(String head) {
        this.robotHead = head;

    }

    @Override
    public void setRobotTorso(String torso) {
        this.robotTorso=torso;
    }

    @Override
    public void setRobotArms(String arms) {
        this.robotArms = arms;
    }

    @Override
    public void setRobotLegs(String legs) {
        this.robotLegs = legs;
    }

    public String getRobotHead() {
        return robotHead;
    }

    public String getRobotTorso() {
        return robotTorso;
    }

    public String getRobotArms() {
        return robotArms;
    }

    public String getRobotLegs() {
        return robotLegs;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "robotHead='" + robotHead + '\'' +
                ", robotTorso='" + robotTorso + '\'' +
                ", robotArms='" + robotArms + '\'' +
                ", robotLegs='" + robotLegs + '\'' +
                '}';
    }
}
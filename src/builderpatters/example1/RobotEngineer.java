package builderpatters.example1;

public class RobotEngineer {
    private RobotBuilder robotBuilder;

    //Acts as a factory for generating robots
    public RobotEngineer(RobotBuilder robotBuilder) {
        this.robotBuilder = robotBuilder;
    }

    public Robot getRobot(){
        return this.robotBuilder.getRobot();
    }

    public void makeRobot(){
        this.robotBuilder.buildRobotHead();
        this.robotBuilder.buildRobotArms();
        this.robotBuilder.buildRobotLegs();
        this.robotBuilder.buildRobotTorso();
    }
}

package builderpatters.example1;


/*
concrete builder class, brings all objects together..
 */

public class RobotBuilderProtoV1 implements RobotBuilder{

    private Robot robot;

    public RobotBuilderProtoV1(){
        this.robot = new Robot();
    }

    @Override
    public void buildRobotHead() {
        robot.setRobotHead("Big brown head");

    }

    @Override
    public void buildRobotTorso() {
        robot.setRobotTorso("Huge torso");
    }

    @Override
    public void buildRobotArms() {
        robot.setRobotArms("Plastic arms");
    }

    @Override
    public void buildRobotLegs() {
        robot.setRobotLegs("aluminium legs");

    }

    @Override
    public Robot getRobot() {
        return this.robot;
    }
}

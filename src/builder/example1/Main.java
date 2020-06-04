package builder.example1;

public class Main {
    public static void main(String[] args) {

        //create a new robot factory from the first prototype
        // the prototype implements the robot plan
        RobotBuilder robotBuilder = new RobotBuilderProtoV1();

        // create a new engineer
        //and task the engineer to used the created prototype
        RobotEngineer engineer = new RobotEngineer(robotBuilder);

        //task engineer to create the robot
        engineer.makeRobot();
        //get the robot created
        Robot firstProto = engineer.getRobot();
        System.out.println(firstProto);

    }
}

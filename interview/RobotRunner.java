package com.robot.details;

public class RobotRunner {

    public static void main(String[] args) {

        Robot robot1 = new Robot();
        robot1.setRobotName("Robo");
        robot1.setCountry("Japan");
        robot1.setPowerLevel(90);
        robot1.setHeight(6.5);

        Robot robot2 = new Robot();
        robot2.setRobotName("Titan");
        robot2.setCountry("USA");
        robot2.setPowerLevel(85);
        robot2.setHeight(7.0);

        Robot robot3 = new Robot();
        robot3.setRobotName("Steel");
        robot3.setCountry("Germany");
        robot3.setPowerLevel(95);
        robot3.setHeight(8.0);

        System.out.println(robot1);
        System.out.println(robot2);
        System.out.println(robot3);
    }
}

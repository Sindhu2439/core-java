package com.robot.details;

public class Robot {

    String robotName;
    String country;
    int powerLevel;
    double height;

    public String getRobotName() {
        return robotName;
    }

    public void setRobotName(String robotName) {
        this.robotName = robotName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public void setPowerLevel(int powerLevel) {
        this.powerLevel = powerLevel;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "robotName='" + robotName + '\'' +
                ", country='" + country + '\'' +
                ", powerLevel=" + powerLevel +
                ", height=" + height +
                '}';
    }
}
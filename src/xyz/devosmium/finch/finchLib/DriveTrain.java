package xyz.devosmium.finch.finchLib;

import edu.cmu.ri.createlab.terk.robot.finch.Finch;

public class DriveTrain {

    /**
     *
     * @param finch The Finch object
     * @param direction The direction to drive in
     * @param duration How long to drive for
     * @author Owen Salter
     */

    public static void drive(Finch finch, EnumDirection direction, int duration) {
        if (direction == EnumDirection.FORWARD) {
            finch.setWheelVelocities(255,255,duration);
        } else if (direction == EnumDirection.BACKWARD) {
            finch.setWheelVelocities(-255,-255,duration);
        } else {
            finch.setWheelVelocities(0,0,0);
            finch.saySomething("Incorrect Parameters Provided");
            System.err.println("Incorrect Parameters provided to DriveTrain.drive() method!");
            finch.sleep(1000);
        }
    }

    //TODO 2/13/2018 Add Accelerometer PID Controller
    public static void driveWithPID(Finch finch, int distance, int duration) {

    }

    /**
     *
     * @param finch The Finch object
     * @param direction The direction to drive in
     * @author Owen Salter
     */
    public static void turn(Finch finch, EnumDirection direction) {
        int duration = 1000;
        if (direction == EnumDirection.LEFT) {
            finch.setWheelVelocities(255,0, duration);
        } else if (direction == EnumDirection.RIGHT) {
            finch.setWheelVelocities(0,255,duration);
        } else {
            stop(finch);
            finch.saySomething("Incorrect Parameters Provided");
            finch.sleep(2000);
            System.err.println("Incorrect Parameters provided to DriveTrain.turn()");
        }

    }

    /**
     * @param finch The Finch object
     * @author Owen Salter
     */
    public static void stop(Finch finch) {
        finch.stopWheels();
    }

}

package org.usfirst.frc.team2449.robot.commands.AutonCommands;

import org.usfirst.frc.team2449.robot.Robot;
import org.usfirst.frc.team2449.robot.commands.DriveCommands.GyroTurn;
import org.usfirst.frc.team2449.robot.commands.DriveCommands.StraightDrive;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutonScaleLTR extends CommandGroup {

    public AutonScaleLTR() {
    	requires(Robot.robotSensors);
    	requires(Robot.robotDriveTrain);
    	addSequential(new StraightDrive(17.5));
    	//addParallel(new RaiseArm());
    	addSequential(new GyroTurn(-90));
    	addSequential(new StraightDrive(16.5));
    	addSequential(new GyroTurn(90));
    	//addSequential(new StraightDrive(4)); //Need to figure out Distance
    	//addSequential(new EjectCube());
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    }
}

package org.usfirst.frc.team2449.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Vision extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	public void startVisionServer() {
	//start the Vision Server	
	}
	
	public void getVisionTarget() {
	//get the location of the vision target
	//NEEDS TO RETURN A VALUE AT SOME POINT
	}
	
	public void getTargetColor(Object visiontargetlocation) {
	//get the color of the switch lights surrounding the vision target	
	}
	
	public void getTeamColor() {
	//get current team Color, Red or Blue
	//NEEDS TO RETURN A VALUE SOMEHOW
	}
	
	

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}


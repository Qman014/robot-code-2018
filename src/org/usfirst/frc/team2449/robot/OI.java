/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2449.robot;

import org.usfirst.frc.team2449.robot.commands.ManualArm;
import org.usfirst.frc.team2449.robot.commands.ManualEject;
import org.usfirst.frc.team2449.robot.commands.ManualIntake;
import org.usfirst.frc.team2449.robot.commands.DriveCommands.CancelDrive;
import org.usfirst.frc.team2449.robot.commands.DriveCommands.CubeDrive;
import org.usfirst.frc.team2449.robot.commands.DriveCommands.GyroTurn;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
	
	//The following block is control code for a Logitech Gamepad
	public Joystick driverJoystick = new Joystick(0);
	public Button armUpButton = new JoystickButton(driverJoystick,5);
	public Button armDownButton = new JoystickButton(driverJoystick,7);
	public Button manualIntakeButton = new JoystickButton(driverJoystick,8);
	public Button intakeReverseButton = new JoystickButton(driverJoystick,6);
	public Button ejectButton = new JoystickButton(driverJoystick,2);
	public Button cubeDriveButton = new JoystickButton(driverJoystick,1);
	public Button cancelButton  =new JoystickButton(driverJoystick,3);
	public Button testButton = new JoystickButton(driverJoystick,9);
	
	public OI() {
		armUpButton.whileHeld(new ManualArm(RobotMap.armUpPower));
		armDownButton.whileHeld(new ManualArm(-RobotMap.armDownPower));
		intakeReverseButton.whileHeld(new ManualEject());
		manualIntakeButton.whileHeld(new ManualIntake());
		cubeDriveButton.whenPressed(new CubeDrive());
		cancelButton.whenPressed(new CancelDrive());
		testButton.whenPressed(new GyroTurn(90));
	}
}

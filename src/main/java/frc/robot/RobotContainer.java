// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.PrintCommand;
import frc.robot.drive.DefaultDrive;
import frc.robot.drive.DriveSubsystem;
import frc.robot.util.MathUtils;

public class RobotContainer {

  public RobotContainer() {
    configureBindings();
  }

  private void configureBindings() {
    Joystick driverController = new Joystick(Constants.Controller.DRIVER_CONTROLLER);

    DriveSubsystem drive = new DriveSubsystem();

    drive.setDefaultCommand(
        new DefaultDrive(drive,
            () -> getJoystickInput(driverController, Constants.Controller.LEFT_Y_AXIS),
            () -> getJoystickInput(driverController, Constants.Controller.LEFT_X_AXIS),
            () -> getJoystickInput(driverController, Constants.Controller.RIGHT_X_AXIS)
        )
    );

  }

  private double getJoystickInput(Joystick stick, int axe) {
    return -MathUtils.getDeadzoneAdjustedInput(stick.getRawAxis(axe));
  }

  public Command getAutonomousCommand() {
    return new PrintCommand("No autonomous command available yet.");
    //TODO: Created autonomous command generator
  }

}

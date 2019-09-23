/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.commands.DriveWithJoystick;

/**
 * @author Christian
 */
public class DriveTrain extends Subsystem
{
  public DifferentialDrive robotDrive;

  private static final int TalonSRX01ID = 1;
  private static final int TalonSRX02ID = 2;
  private static final int TalonSRX03ID = 3;
  private static final int TalonSRX04ID = 4;

  @Override
  public void initDefaultCommand()
  {
    setDefaultCommand(new DriveWithJoystick());
  }

  public DriveTrain()
  {
    final WPI_TalonSRX leftFront = new WPI_TalonSRX(TalonSRX01ID);
    final WPI_TalonSRX leftFollower = new WPI_TalonSRX(TalonSRX01ID);
    final WPI_TalonSRX rightFront = new WPI_TalonSRX(TalonSRX01ID);
    final WPI_TalonSRX rightFollower = new WPI_TalonSRX(TalonSRX01ID);

    final SpeedControllerGroup rightSide = new SpeedControllerGroup(leftFront, leftFollower);
    final SpeedControllerGroup leftSide = new SpeedControllerGroup(rightFront, rightFollower);

    robotDrive = new DifferentialDrive(rightSide, leftSide);

    leftFront.configOpenloopRamp(0.3);
    rightFront.configOpenloopRamp(0.3);
  }

  public void setDriveSpeeds(double leftSpeed, double rightSpeed)
  {
    robotDrive.tankDrive(leftSpeed, rightSpeed);
  }

  public void stop()
  {
    robotDrive.stopMotor();
  }
}

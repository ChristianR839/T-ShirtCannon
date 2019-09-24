/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

/*
 * @Authors
 * Christian
 * Jackson
 * FRC 839
 */

public class Pneumatics extends Subsystem
{
  private DoubleSolenoid barrelSolenoid;
  private DoubleSolenoid valveSolenoid;
  Compressor compressor = new Compressor(11);

  public Pneumatics()
  {
    compressor.setClosedLoopControl(true);
    barrelSolenoid = new DoubleSolenoid(11, 0, 1);
    valveSolenoid = new DoubleSolenoid(11, 2, 3);
  }

  @Override
  public void initDefaultCommand()
  {
    
  }

  public void barrelFill()
	{
    barrelSolenoid.set(Value.kForward);
    System.out.println("Barrel Fill");
  }

  public void barrelStop()
	{
   barrelSolenoid.set(Value.kReverse);
   System.out.println("Barrel Stop");
  }

  public void valveOpen()
  {
    valveSolenoid.set(Value.kForward);
    System.out.println("Valve Open");
  }

  public void valveClose()
  {
    valveSolenoid.set(Value.kReverse);
    System.out.println("Valve Close");
  }
}
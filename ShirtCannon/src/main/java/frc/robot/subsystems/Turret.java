package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.commands.TurretAnalogCommand;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
//import frc.robot.commands.TurretAnalogCommand;

public class Turret extends Subsystem
{
  private static final int turretMotorID = 5;
  public final WPI_TalonSRX turretMotor;

  public Turret()
  {
    turretMotor = new WPI_TalonSRX(turretMotorID);
  }

  @Override
  public void initDefaultCommand()
  {
    setDefaultCommand(new TurretAnalogCommand());
  }

  public void moveTurretAnalog(double turretAnalogSpeed)
  {
    turretMotor.set(turretAnalogSpeed);
  }

  public void stop()
  {
    turretMotor.set(0);
  }
}
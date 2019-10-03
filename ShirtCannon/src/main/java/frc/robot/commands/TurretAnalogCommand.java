package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class TurretAnalogCommand extends Command
{
  public TurretAnalogCommand()
  {
    requires(Robot.turret);
  }

  @Override
  protected void initialize()
  {

  }

  @Override
  protected void execute()
  {
    Robot.turret.moveTurretAnalog(Robot.oi.getTurretAnalogSpeed());
  }

  @Override
  protected boolean isFinished()
  {
    return this.isTimedOut();
  }

  @Override
  protected void end()
  {

  }

  @Override
  protected void interrupted()
  {
    Robot.turret.stop();
  }
}

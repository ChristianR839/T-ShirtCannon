package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class BarrelFillCommand extends Command
{
  public BarrelFillCommand()
  {
    requires(Robot.pneumatics);
  }

  @Override
  protected void initialize()
  {
    Robot.pneumatics.barrelFill();
  }

  @Override
  protected void execute()
  {

  }

  @Override
  protected boolean isFinished()
  {
    return false;
  }

  @Override
  protected void end()
  {

  }
}
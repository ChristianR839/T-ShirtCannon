package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class ValveOpenCommand extends Command
{
  public ValveOpenCommand()
  {
   requires (Robot.pneumatics);
  }

  @Override
  protected void initialize()
  {
    Robot.pneumatics.valveOpen();
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

  @Override
  protected void interrupted()
  {

  }
}
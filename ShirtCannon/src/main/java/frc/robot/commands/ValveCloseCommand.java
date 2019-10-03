package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class ValveCloseCommand extends Command
{
  public ValveCloseCommand()
  {
    requires(Robot.pneumatics);
  }

  @Override
  protected void initialize() 
  {
    Robot.pneumatics.valveClose();
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
package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class DriveWithJoystick extends Command
{
    public DriveWithJoystick() 
    {
        requires(Robot.drivetrain);
    }

    protected void initialize()
    {

    }

    protected void execute()
    {
        Robot.drivetrain.setDriveSpeeds(Robot.oi.getRightSpeed(), Robot.oi.getLeftSpeed());
    }

    protected boolean isFinished()
    {
        return false;
    }

    protected void end()
    {
        Robot.drivetrain.stop();
    }

    protected void interrupted() 
    {
        end();
    }
}
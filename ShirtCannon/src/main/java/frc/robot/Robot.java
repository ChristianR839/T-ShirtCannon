package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.subsystems.DriveTrain;
import frc.robot.subsystems.Pneumatics;
import frc.robot.subsystems.Turret;

public class Robot extends TimedRobot
{
  public static DriveTrain drivetrain;
  public static Pneumatics pneumatics;
  public static Turret turret;
  public static OI oi;

  Command m_autonomousCommand;
  SendableChooser<Command> m_chooser = new SendableChooser<>();

  @Override
  public void robotInit()
  {
    drivetrain = new DriveTrain();
    pneumatics = new Pneumatics();
    turret = new Turret();
    oi = new OI();
    // chooser.addOption("My Auto", new MyAutoCommand());
    SmartDashboard.putData("Auto mode", m_chooser);
  }

  @Override
  public void robotPeriodic()
  {

  }

  @Override
  public void disabledInit()
  {

  }

  @Override
  public void disabledPeriodic()
  {
    Scheduler.getInstance().run();
  }

  @Override
  public void autonomousInit()
  {
    m_autonomousCommand = m_chooser.getSelected();

    if (m_autonomousCommand != null)
    {
      m_autonomousCommand.start();
    }
  }

  @Override
  public void autonomousPeriodic()
  {
    Scheduler.getInstance().run();
  }

  @Override
  public void teleopInit()
  {
    if (m_autonomousCommand != null) {
      m_autonomousCommand.cancel();
    }
  }

  @Override
  public void teleopPeriodic()
  {
    Scheduler.getInstance().run();
  }

  @Override
  public void testPeriodic()
  {

  }
}

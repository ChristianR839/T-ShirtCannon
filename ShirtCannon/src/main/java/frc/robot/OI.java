package frc.robot;

import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.UniversalJoystick;

public class OI
{
  public UniversalJoystick joystick = new UniversalJoystick(0);

  public Button barrelFillButton;
  public Button barrelStopButton;
  public Button valveOpenButton;
  public Button valveCloseButton;

  public OI()
  {
    barrelFillButton = new JoystickButton(joystick, UniversalJoystick.kBtnX);
    barrelStopButton = new JoystickButton(joystick, UniversalJoystick.kBtnY);
    valveOpenButton = new JoystickButton(joystick, UniversalJoystick.kBtnA);
    valveCloseButton = new JoystickButton(joystick, UniversalJoystick.kBtnB);
  }

  public double getRightSpeed()
  {
    return joystick.rightAxisY();
  }

  public double getLeftSpeed()
  {
    return joystick.leftAxisY();
  }

  public double getTurretAnalogSpeed()
  {
    return joystick.triggers();
  }

  double deadBand(double axisVal) {
		if (axisVal < -0.200)
			return axisVal;
		if (axisVal > +0.200)
			return axisVal;
		return 0;
  }

// Triggers: Left (+), Right (-)

}
package frc.robot;

import frc.robot.Constants.OIConstants;
import frc.robot.subsystems.SmartDashboardSubsystem;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.XboxController.Button;
import edu.wpi.first.wpilibj.Joystick;



public class Calculations {


        static double xValue = 0;
        static double yValue = 0;
        static  double Rot = 0;

        public static void joystickCalculation(){
        switch(SmartDashboardSubsystem.driveMethod){
            case(SmartDashboardSubsystem.joystick):{
                Joystick m_driverController = new Joystick(OIConstants.kDriverControllerPort);
                    xValue = m_driverController.getX();
                    yValue = -m_driverController.getY();
                    Rot =  m_driverController.getZ();
            }
            break;
            case(SmartDashboardSubsystem.xBox):{
                XboxController m_driverController = new XboxController(OIConstants.kDriverControllerPort);
                    xValue = m_driverController.getLeftX();
                    yValue = m_driverController.getLeftY();
                    Rot = m_driverController.getRightX();
            }
            break;
        }
    }
}

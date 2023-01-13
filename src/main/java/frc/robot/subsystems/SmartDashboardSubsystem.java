package frc.robot.subsystems;

//Smart Dashboard Imports
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
//Other Classes
import frc.robot.Constants;
import frc.robot.Constants.DriveConstants;

//Smart Dashboard imports
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


public class SmartDashboardSubsystem extends SubsystemBase {
    
    //value retrieved from chooser
    static public String driveMethod;

    //chooser for controller possible values
    static final public String joystick = "joystick";
    static final public String xBox = "xbox";
    private final SendableChooser<String> controller = new SendableChooser<>();



    public SmartDashboardSubsystem(){
        controller.addOption("Joystick", joystick);
        controller.addOption("XBOX Controller", xBox);
        SmartDashboard.putData("Contoller Types", controller);

    }

    public void active(){

        SmartDashboard.updateValues();

        driveMethod = controller.getSelected();
    }

}

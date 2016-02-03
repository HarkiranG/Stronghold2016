package org.usfirst.frc.team1360.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap
{
    /**
     * LeftMotor Front on the Drive Subsystem
     * CAN: No
     */
    public static final int DRIVESUBSYSTEM_LEFT_1 =             0;
    /**
     * LeftMotor Back on the Drive Subsystem
     * CAN: No
     */
    public static final int DRIVESUBSYSTEM_LEFT_2 =             1;
    /**
    * RightMotor Front on the Drive Subsystem
    * CAN: No
     */
    public static final int DRIVESUBSYSTEM_RIGHT_1 =            2;
    /**
    * RightMotor Back on the Drive Subsystem
    * CAN: No
    */
    public static final int DRIVESUBSYSTEM_RIGHT_2 =            3;
   
     /**
     * IntakeMotor on the Intake Subsystem
     */
    public static final int INTAKESUBSYSTEM_INTAKE_1 =          4;
   
     /**
     * ShooterMotor on the Shooter subsystem (same port as IntakeMotor)
     */
    public static final int SHOOTERSUBSYSTEM_SHOOTER_1 = INTAKESUBSYSTEM_INTAKE_1;
  
     /** 
     * TiltMotor in the Shooter subsystem
     */
    public static final int SHOOTERSUBSYSTEM_TILTER =           5;
  
    // Solenoids

     /**
     * Left SolenoidMotor Back on the Drive Subsystem
     */
    public static final int DRIVESUBSYSTEM_LEFT_SOLENOID_1 =    0;
   
     /**
     * Left SolenoidMotor Middle on the Drive Subsystem
     */
    public static final int DRIVESUBYSTEM_LEFT_SOLENOID_2 =     1;
   
     /**
     * Right SolenoidMotor Back on the Drive Subsystem
     */
    public static final int DRIVESUBSYSTEM_RIGHT_SOLENOID_1 =   2;
   
    /**
     * Right SolenoidMotor Middle on the Dive Subsystem
     */
    public static final int DRIVESUBSYSTEM_RIGHT_SOLENOID_2 =   3;
    
      /**
     * ShooterSolenoid on the Shooter Subsystem
     */
    public static final int SHOOTERSUBSYSTEM_SHOOTER_SOLENOID = 4;
  
     /**
     * Driver Controller
     */
    public static final int JOYSTICK_DRIVER =                   0;
   
     /**
     * Operator Controller
     */
    public static final int JOYSTICK_OPERATOR =                 1;
   
}

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Logitech extends Joystick {

	public Logitech(int port) {
		super(port);
		// TODO Auto-generated constructor stub
	}
	
	public boolean getButtonX() {
		return this.getRawButton(1);
	}
	
	public boolean getButtonA() {
		return this.getRawButton(2);
	}
	
	public boolean getButtonB() {
		return this.getRawButton(3);
	}
	
	public boolean getButtonY() {
		return this.getRawButton(4);
	}
	
	public boolean getButtonLB() {
		return this.getRawButton(5);
	}
	
	public boolean getButtonRB() {
		return this.getRawButton(6);
	}
	
	public boolean getButtonLT() {
		return this.getRawButton(7);
	}
	
	public boolean getButtonRT() {
		return this.getRawButton(8);
	}
	
	public boolean getButtonBack() {
		return this.getRawButton(9);
	}
	
	public boolean getButtonStart() {
		return this.getRawButton(10);
	}
	
	public boolean getButtonLeftStick() {
		return this.getRawButton(11);
	}
	
	public boolean getButtonRightStick() {
		return this.getRawButton(12);
	}
	
	public int getDPad() {
		return this.getPOV(0);
	}
	
	public boolean getDPadNorth() {
		if(getDPad() == 0) return true;
		else			   return false;
	}
	
	public boolean getDPadNorthEast() {
		if(getDPad() == 45) return true;
		else			   return false;
	}
	
	public boolean getDPadEast() {
		if(getDPad() == 90) return true;
		else			   return false;
	}
	
	public boolean getDPadSouthEast() {
		if(getDPad() == 135) return true;
		else			   return false;
	}
	
	public boolean getDPadSouth() {
		if(getDPad() == 180) return true;
		else			   return false;
	}
	
	public boolean getDPadSouthWest() {
		if(getDPad() == 225) return true;
		else			   return false;
	}
	
	public boolean getDPadWest() {
		if(getDPad() == 270) return true;
		else			   return false;
	}
	
	public boolean getDPadNorthWest() {
		if(getDPad() == 315) return true;
		else			   return false;
	}
	
	public double getLeftX() {
		return this.getRawAxis(0);
	}
	
	public double getLeftY() {
		return this.getRawAxis(1);
	}
	
	public double getRightX() {
		return this.getRawAxis(2);
	}
	
	public double getRightY() {
		return this.getRawAxis(3);
	}
	
	public void printAll() {
		SmartDashboard.putBoolean("A: ", getButtonA());
		SmartDashboard.putBoolean("B: ", getButtonB());
		SmartDashboard.putBoolean("X: ", getButtonX());
		SmartDashboard.putBoolean("Y: ", getButtonY());
		SmartDashboard.putBoolean("LB: ", getButtonLB());
		SmartDashboard.putBoolean("RB: ", getButtonRB());
		SmartDashboard.putBoolean("LT: ", getButtonLT());
		SmartDashboard.putBoolean("RT: ", getButtonRT());
		SmartDashboard.putBoolean("Back: ", getButtonBack());
		SmartDashboard.putBoolean("Start: ", getButtonStart());
		SmartDashboard.putBoolean("LeftStick: ", getButtonLeftStick());
		SmartDashboard.putBoolean("RightStick: ", getButtonRightStick());
		SmartDashboard.putNumber("DPad: ", getDPad());
		//SmartDashboard.putBoolean("DPad North: ", getDPadNorth());
		//SmartDashboard.putBoolean("DPad NorthEast: ", getDPadNorthEast());
		//SmartDashboard.putBoolean("DPad East: ", getDPadEast());
		//SmartDashboard.putBoolean("DPad SouthEast: ", getDPadSouthEast());
		//SmartDashboard.putBoolean("DPad South: ", getDPadSouth());
		//SmartDashboard.putBoolean("DPad SouthWest: ", getDPadSouthWest());
		//SmartDashboard.putBoolean("DPad West: ", getDPadWest());
		//SmartDashboard.putBoolean("DPad NorthWest: ", getDPadNorthWest());
		SmartDashboard.putNumber("LeftX: ", getLeftX());
		SmartDashboard.putNumber("LeftY: ", getLeftY());
		SmartDashboard.putNumber("RightX: ", getRightX());
		SmartDashboard.putNumber("RightY: ", getRightY());
	}
	
	public void movementFunction() {
		 
	}
}

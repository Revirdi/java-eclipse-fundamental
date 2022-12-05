package belajarOOP;

import java.util.Objects;

public class Car {
	
	private String doors;
	private String engine;
	private String driver;
	private Integer speed;
	
	public Car() {
		doors = "opened";
		engine = "off";
		driver = "absent";
		speed = 0;
	}
	
	public Car(String doors, String engine, String driver, Integer speed) {

		this.doors = doors;
		this.engine = engine;
		this.driver = driver;
		this.speed = speed;
	}
	
	public String getDoors() {
		return doors;
	}
	
	public void setDoors(String doors) {
		this.doors = doors;
	}
	
	public String getEngine() {
		return engine;
	}
	
	public void setEngine(String engine) {
		this.engine = engine;
	}
	
	public String getDriver() {
		return driver;
	}
	
	public void setDriver(String driver) {
		this.driver = driver;
	}
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(Integer speed) {
		this.speed = speed;
	}
	
	public String run() {
		if(doors.equals("closed") && engine.equals("on") && driver.equals("seated") && speed > 0) {
			return "running";
		}
		return "not running";
	}

	@Override
	public int hashCode() {
		return Objects.hash(doors, driver, engine, speed);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(doors, other.doors) && Objects.equals(driver, other.driver)
				&& Objects.equals(engine, other.engine) && Objects.equals(speed, other.speed);
	}
	
	
	
}

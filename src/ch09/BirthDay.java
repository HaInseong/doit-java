package ch09;

public class BirthDay {
	private int birthDay;
	private int year;
	private int moth;
	private boolean isValid = true;
	
	public int getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(int birthDay) {
		this.birthDay = birthDay;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		if(year < 0) {
			isValid = false;
		}
		this.year = year;
	}
	public int getMoth() {
		return moth;
	}
	public void setMoth(int moth) {
		if(moth < 1 || moth > 12) {
			isValid = false;
		}
		this.moth = moth;
	}
	public boolean isValid() {
		
		return isValid;
	}
	
	public void printThis() {
		System.out.println(this);
	}
	
}

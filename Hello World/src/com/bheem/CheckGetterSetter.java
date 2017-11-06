package com.bheem;

public class CheckGetterSetter {
	private boolean present;
	private int number;
	private String name;
	private long longNumber;
	
	public CheckGetterSetter(boolean present, int number) {
		this.present = present;
		this.number = number;
	}
	public boolean isPresent() {
		return present;
	}
	public void setPresent(boolean present) {
		this.present = present;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getLongNumber() {
		return longNumber;
	}
	public void setLongNumber(long longNumber) {
		this.longNumber = longNumber;
	}
	
	
	@Override
	public String toString() {
		return "CheckGetterSetter [present=" + present + ", number=" + number + ", name=" + name + ", longNumber="
				+ longNumber + "]";
	}
	public static void main(String[] args) {
		CheckGetterSetter ch = new CheckGetterSetter(false, 9);
		System.out.println(ch);
	}
	

}

package com.codingdojo.phone;

public class Galaxy extends Phone implements Ringable {

	public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
	}
//	@Override
	public void ring() {
		System.out.println( "Galaxy S9 says Ring Ring Ring!");
	}
	
	@Override
	public void unlock() {
		System.out.println( "Unlocking via finger print");
	}
	@Override
	public void displayInfo() {
		System.out.println( "Galaxy S9 from Verizon");
	}

}

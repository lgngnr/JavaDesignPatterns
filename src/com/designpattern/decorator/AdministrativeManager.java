package com.designpattern.decorator;

public class AdministrativeManager extends ResponsibleWorker {

	public AdministrativeManager(Employee employee) {
		super(employee);
	}
	
	public void whoIs() {
		sayIamBoss();
		super.whoIs();
	}
	
	private void sayIamBoss() {
		System.out.println("I am a boss. ");
	}

}

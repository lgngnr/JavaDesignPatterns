package com.designpattern.decorator;

public class ProjectManager extends ResponsibleWorker{
	
	private String project;

	public ProjectManager(Employee employee, String project) {
		super(employee);
		this.project = project;
	}
	
	public void whoIs() {
		super.whoIs();
		System.out.println("I am the Manager of the Project: " + project);
	}

}

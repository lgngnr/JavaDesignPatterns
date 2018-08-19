package com.designpattern.builder;

public class BuilderExample {
	public static void main( String[] arg) {
		String swIngCOurseModel = (String)
				ERHardCodedDirector.getModel( new OrientedERBuilder());
		
		System.out.println(swIngCOurseModel);
		ERModel dbCourseModel = (ERModel)
				ERHardCodedDirector.getModel( new NotOrientedERBuilder());
		
		dbCourseModel.showStructure();
	}
}

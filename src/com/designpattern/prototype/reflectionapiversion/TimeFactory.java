package com.designpattern.prototype.reflectionapiversion;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TimeFactory {

	public static Time getNewTimeObject( Time objectTime ) throws TimeFactoryException {
		try {
			Class timeClass = objectTime.getClass();
			Constructor timeClassConstr = timeClass.getConstructor( new Class[] {});
			return (Time) timeClassConstr.newInstance( new Object[] {});
		}catch(NoSuchMethodException e){
			throw new TimeFactoryException( e );
		}catch(IllegalAccessException e){
			throw new TimeFactoryException( e );
		}catch(InvocationTargetException e){
			throw new TimeFactoryException( e );
		}catch(InstantiationException e){
			throw new TimeFactoryException( e );
		}
	}
	
	public static Time getNewTimeObject( String timeClassName) throws TimeFactoryException {
		try {
			Class timeClass = Class.forName(timeClassName);
			Constructor timeClassConstr = timeClass.getConstructor( new Class[] {});
			return (Time) timeClassConstr.newInstance( new Object[] {});
		}catch (ClassNotFoundException e) {
			throw new TimeFactoryException( e );
		}catch (NoSuchMethodException e) {
			throw new TimeFactoryException( e );
		}catch (IllegalAccessException e) {
			throw new TimeFactoryException( e );
		}catch (InvocationTargetException e) {
			throw new TimeFactoryException( e );
		}catch (InstantiationException e) {
			throw new TimeFactoryException( e );
		}
	}
}

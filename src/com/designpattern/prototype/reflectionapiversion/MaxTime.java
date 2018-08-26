package com.designpattern.prototype.reflectionapiversion;

// Classe contenente il limite orario 23:59:59

public class MaxTime implements Time{

	@Override
	public void setTime(int hr, int min, int sec) {
		// Does Nothing
		
	}

	@Override
	public int getHours() {
		return 23;
	}

	@Override
	public int getMinutes() {
		return 59;
	}

	@Override
	public int getSeconds() {
		return 59;
	}

}

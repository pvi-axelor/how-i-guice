package learn.guc.impl;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class Juice {
	
	@Inject @Named("newFruit1")
	private String fruit;
	
	public String getFruit() {
		return this.fruit;
	}
	
	@Named("NoMoreAppleJuice")
	public void getMeSomeJuice() {
		System.out.println(fruit + " juice!");
	}
	
}

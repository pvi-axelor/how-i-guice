package learn.guc.main;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

import learn.guc.impl.Juice;
import learn.guc.module.FruitModule;
import learn.guc.module.RickRollModule;
import learn.guc.module.TheOfficeModule;
import learn.guc.module.WorkPlaceModule;
import learn.guc.service.RickRoll;
import learn.guc.service.TheOffice;

public class Main {
    public static void main(String[] args) {
	

//  	used @Provider, and worked with multiple dependent classes
//   	
//    	Injector injector = Guice.createInjector(new TheOfficeModule(), new WorkPlaceModule());
//    	TheOffice theOffice = injector.getInstance(TheOffice.class);
//    	
//    	System.out.println(theOffice.hasStaff());
//    	System.out.println(theOffice.getNumberOfStaff());
//    	System.out.println(theOffice.getNumberOfManagers());
    	
//  method interceptor
    	
    	Injector injector = Guice.createInjector(new FruitModule());
    	Juice juice = injector.getInstance(Juice.class);
    	juice.getMeSomeJuice();
//    	
    	
    	
    	
	}
}

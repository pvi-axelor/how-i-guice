package learn.guc.my;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class MyDataImplementation implements MyDataInterface {

	private String myName;
	private int myAge;
	private String myGender;

	@Inject
	public MyDataImplementation(@Named("MyName") String myName, @Named("MyAge") int myAge,
			@Named("MyGender") String myGender) {
		super();
		this.myName = myName;
		this.myAge = myAge;
		this.myGender = myGender;
	}

	@Override
	public void printMyData() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return String.format("MyDataImplementation [myName=%s, myAge=%s, myGender=%s]", myName, myAge, myGender);
	}

}
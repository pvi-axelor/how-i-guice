package learn.guc.randomdate;

import com.google.inject.Inject;

public class RandomDateImplementation implements RandomDateInterface {

	private int day;
	private int month;
	private int year;
	
	@Inject
	public RandomDateImplementation(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public void getARandomDate() {
	System.out.println(String.format("Current Random date is: %d/%d/%d.", day, month, year));
	}
	

}

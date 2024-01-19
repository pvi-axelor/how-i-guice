package learn.guc.main;

interface SpellCheckerInterface {
	public void checkSpelling();
}
 
class SpellCheckerImplementation implements SpellCheckerInterface {

	@Override
	public void checkSpelling() {
		System.out.println("Inside spellchecking!");
	}
}

class WordCheckerImplementation extends SpellCheckerImplementation {
	
	@Override
	public void checkSpelling() {
		System.out.println("Inside word checker implementation !");
	}
}
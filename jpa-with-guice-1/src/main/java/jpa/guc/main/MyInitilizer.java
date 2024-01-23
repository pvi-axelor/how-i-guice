package jpa.guc.main;

import com.google.inject.Inject;
import com.google.inject.persist.PersistService;

public class MyInitilizer {

	private PersistService service;
	
	@Inject
	MyInitilizer(PersistService service) {
		service.start();
		this.service = service;
	}
	
	@Inject
	@Override
	public void finalize () {
		this.service.stop();
	}
}

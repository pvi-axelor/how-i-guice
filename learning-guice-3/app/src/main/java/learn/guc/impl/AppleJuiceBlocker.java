package learn.guc.impl;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class AppleJuiceBlocker implements MethodInterceptor {
	
	private Juice juice;
	
	@Inject
	public void getTheFruit(@Named("newJuiceInstance") Juice juice) {
		this.juice = juice;
	}
	
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		
		if (this.juice.getFruit().equals("Apple")) // causing NPE
			throw new Exception("No more apple juice!");
		return invocation.proceed();
	}

}

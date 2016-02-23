package test;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class IndexBean {
    
    @Inject
    private TestClass testClass;

	public String getHello() {
		return testClass.hello();
	}
	
}

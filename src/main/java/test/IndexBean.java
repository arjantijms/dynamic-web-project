package test;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class IndexBean {

	public String getHello() {
		return "Hello";
	}
	
}
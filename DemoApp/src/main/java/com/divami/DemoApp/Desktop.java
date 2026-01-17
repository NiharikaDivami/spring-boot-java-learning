package com.divami.DemoApp;
import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer{

	public void compile() {
		System.out.println("In Desktop. Compiling with 404 bugs but faster");
	}

}

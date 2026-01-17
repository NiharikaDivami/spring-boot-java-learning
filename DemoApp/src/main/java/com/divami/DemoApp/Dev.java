package com.divami.DemoApp;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class Dev {

	@Autowired    //field injection
	@Qualifier("desktop")
	private Computer comp;

	
//	public Dev(Laptop laptop) {
//		this.laptop=laptop;
//	}
//	
//	@Autowired
//	public void setLaptop(Laptop laptop) {
//		this.laptop = laptop;
//	}
//	
	
	public String build() {
		
		comp.compile();
		System.out.print("In the greet class. after calling the compile method");
		
		return "Hello Niharika";
	}

}

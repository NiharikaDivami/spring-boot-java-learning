package com.divami.SpringWithoutBoot;


import org.springframework.stereotype.Component;

@Component
public class Desktop {
	
	
	public Desktop() {
		System.out.println("Laptop Constructor");
	}


	public void compile() {
		System.out.println("Hello im in Laptop");
		
	}

}

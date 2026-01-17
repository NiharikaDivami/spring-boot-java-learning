package com.divami.SpringWithoutBoot;


import org.springframework.stereotype.Component;

@Component
public class Dev {
    
	
	private Laptop laptop;
//	private int age;
	
	public Dev() {
		System.out.println("in Dev constructor");
	}
	
//	public Dev(int age) {
//		this.age = age;
//	}
//	 
//
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}


   
	public Dev(Laptop laptop) {
     	this.laptop = laptop;
     	System.out.print("in laptop constructor");
	}
	
	public void build() {
		
		laptop.compile();
		System.out.println("Hello im in dev");
		
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

}

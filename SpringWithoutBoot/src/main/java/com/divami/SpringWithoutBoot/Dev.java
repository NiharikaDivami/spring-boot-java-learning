package com.divami.SpringWithoutBoot;

import org.springframework.stereotype.Component;

@Component
// Dev is also a Spring-managed bean
public class Dev {

    // Reference variable of interface type
    // This allows loose coupling
    // At runtime, Spring can inject Laptop or Desktop
    private Computer com;

    // Example primitive field (currently not used)
    // private int age;

    // Default constructor
    // Spring uses this constructor if no constructor injection is defined
    public Dev() {
        System.out.println("in Dev constructor");
    }

    // Example constructor for constructor injection
    // Currently not used in your configuration
    // public Dev(int age) {
    //     this.age = age;
    // }

    // Getter for age
    // public int getAge() {
    //     return age;
    // }

    // Setter for age
    // This would be used for setter injection
    // public void setAge(int age) {
    //     this.age = age;
    // }

    // Constructor injection using interface type
    // Spring can inject Laptop or Desktop here
    // Currently not active because XML is not using constructor-arg
    public Dev(Computer com) {
        this.com = com;
        System.out.print("in laptop constructor");
    }

    // Business method
    // Uses the injected dependency
    public void build() {

        // Calls compile() of the injected Computer implementation
        com.compile();

        System.out.println("Hello im in dev");
    }

    // Getter method
    // Naming does not follow standard JavaBean convention
    // But it works because Spring is not using it here
    public Computer getcom() {
        return com;
    }

    // Setter method
    // Spring uses this method for setter-based dependency injection
    public void setcom(Computer com) {
        this.com = com;
    }

}

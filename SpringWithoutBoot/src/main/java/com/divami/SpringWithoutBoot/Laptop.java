package com.divami.SpringWithoutBoot;

import org.springframework.stereotype.Component;

@Component
// Another implementation of Computer interface
// Spring will also manage this as a bean
public class Laptop implements Computer {

    // Constructor
    // Executes when Spring creates Laptop object
    public Laptop() {
        System.out.println("Laptop Constructor");
    }

    // Implementation of compile() method
    public void compile() {
        System.out.println("Hello im in Laptop");
    }

}

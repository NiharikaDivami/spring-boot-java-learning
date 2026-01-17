package com.divami.SpringWithoutBoot;

import org.springframework.stereotype.Component;

@Component
// @Component tells Spring that this class is a Spring-managed bean
// Spring will automatically create an object of Desktop
public class Desktop implements Computer {

    // Constructor
    // This runs when Spring creates Desktop object
    public Desktop() {
        System.out.println("Desktop Constructor");
    }

    // Implementation of compile() from Computer interface
    public void compile() {
        System.out.println("Hello im in Desktop compiling ");
    }

}

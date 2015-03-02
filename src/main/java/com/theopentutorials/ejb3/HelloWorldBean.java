package com.theopentutorials.ejb3;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class HelloWorldBean
 */
@Stateless
@LocalBean
public class HelloWorldBean implements HelloWorldBeanRemote {

    
    public HelloWorldBean() {
        // TODO Auto-generated constructor stub
    }
 
    public String sayHello() {
    return "Hello World !!!";
    }

}

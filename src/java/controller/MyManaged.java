/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named(value = "myManaged")
@SessionScoped
public class MyManaged implements Serializable {
    
    private String name;
    private int val2014_1, val2014_2, val2014_3;
    
    @PostConstruct
    public void init() {
        val2014_1 = 100;
        val2014_2 = 400;
        val2014_3 = 750;
    }

    public int getVal2014_1() {
        return val2014_1;
    }

    public int getVal2014_2() {
        return val2014_2;
    }

    public int getVal2014_3() {
        return val2014_3;
    }
    
    public String getName() {
        name = "Samir";
        return name;
    }
    
    
}

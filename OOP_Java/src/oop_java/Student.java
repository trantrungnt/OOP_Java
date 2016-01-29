/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_java;

/**
 *
 * @author TrungNT
 */
public class Student {
    private String name;
    private int id;
    
    void inputName(String name){
        this.name = name;
    }
    
    void inputID(int id){
        this.id = id;
    }
    
    void displayStudent(){       
        System.out.print("\nStudent id: " + id);
        System.out.print("\nName: " + name);
    }    
    
    void registerCourse() {       
    }
    
    void removeCourse(){
    }
}

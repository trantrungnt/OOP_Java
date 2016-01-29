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
public class OOP_Java {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student oStudent = new Student();
        //input type 
        oStudent.inputID(0);
        oStudent.inputName("Nguyen Tran Trung");
        
        //Display Student
        oStudent.displayStudent();
    }
    
}

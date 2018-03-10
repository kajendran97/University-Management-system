/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cwork1;
/**
 * @author Kajendran
 */
public class Student extends Person {
    int studentId;
    

    public Student(int studentId,String Name, String Address) {
        super(Name, Address);
//        this.name = Name;
//        this.address = Address;
        this.studentId = studentId;
    }
    public int getstudentId() {
        return studentId;
    }

   
     
    
}

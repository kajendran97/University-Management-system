/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cwork1;

/**
 *
 * @author Kajendran
 */
public class Lecturer extends Person{
    int lecturerId;

    public Lecturer(int lecturerId,String Name, String Address) {
        super(Name, Address);
//        String name = Name;
//        String address = Address;
        this.lecturerId=lecturerId;
    }
     public int getlecturerId() {
        return lecturerId;
    }
    
   
}

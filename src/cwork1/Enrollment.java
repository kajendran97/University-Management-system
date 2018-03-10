
package cwork1;

/**
 * @author Kajendran
 */
public class Enrollment {
    Student studentId;
    Degree degreeId; 
    
     public Enrollment(Student studentId,Degree degreeId){
        this.studentId = studentId;
        this.degreeId = degreeId;
    }
   
    public Student getstudentId() { 
        return studentId; 
    }
    public void setstudentId(Student studentId) {
        this.studentId = studentId;
    }
    public Degree getdegreeId() { 
        return degreeId; 
    }
    public void setdegreeId(Degree studentId) {
        this.degreeId = studentId;
    }
   
}

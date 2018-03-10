
package cwork1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author Kajendran
 */
public class Cwork1 {
       static Scanner input = new Scanner(System.in);
       static Student star[] = new Student[2];
       static Lecturer pro[] = new Lecturer[2];
       static Degree Enrol[] = new Degree[2];
       static Module addModule[] = new Module[2];
       static Enrollment enrolSd[] = new Enrollment[2];
       
    public static void main(String[] args) {
        
        System.out.println("                                     - Welcome To University Of Computing - ");
        System.out.println("                ---------------------------------------------------------------------------------"+"\n");
        Menu(); 
    }
    static void Add_student(){
        System.out.println("                < University of Computing - Student Regestation > ");
        System.out.println("---------------------------------------------------------------------------------------------");
        for(int noStd = 0; noStd<2; noStd++){
        
        System.out.print(" [01) - Enter Student Id :");
        int value1 = input.nextInt();
//       
        System.out.print(" [02) - Enter Student Name :");
        String value2 = input.next();
        System.out.print(" [03) - Enter Student Address :");
        String value3 = input.next();
       
       Student st1 = new Student(value1,value2,value3);
       star[noStd] = st1;
       }
        Menu();
    }
    static void Display_student(){

       for(int x=0; x<star.length; x++){
       System.out.println("               ------ Student-Details ----- ");
       System.out.println(" > Student Id : " + star[x].studentId);
       System.out.println(" > Student Name : " + star[x].name);
       System.out.println(" > Student Address : " + star[x].address); 
       System.out.println(" --------------------------------------------------------------- ");
       }
       Menu();

    }
    static void Add_lecturer(){
        System.out.println("                 < University of Computing - Lecturer Regestation > ");
        System.out.println("---------------------------------------------------------------------------------------------");
        for(int x=0; x<pro.length; x++){
        System.out.print(" [01) - Enter Lectures Id : ");
        int val1 = input.nextInt();
        System.out.print(" [02) - Enter Lectures Name : ");
        String val2 = input.next();
        System.out.print(" [03) - Enter Lectures Address : ");
        String val3 = input.next();
        
        Lecturer Lct1 = new Lecturer(val1,val2,val3);
        
        
        pro[x] = Lct1;
        }
        Menu(); 
    }
    static void Display_lecturer(){
        for(int x=0; x<pro.length; x++){
        System.out.println("               ------ Lecturer-Details ----- ");
        System.out.println(" > Lecturer Id : " + pro[x].lecturerId);
        System.out.println(" > Lecturer Name : " + pro[x].name);
        System.out.println(" > Lecturer Address : " + pro[x].address);  
        System.out.println(" --------------------------------------------------------------- ");
        }
        Menu();
    }
    static void Add_degree(){
        //Adding the Degree
       System.out.println("                 < University of Computing - Degree Regestation > ");
       System.out.println("---------------------------------------------------------------------------------------------");
       for(int x=0; x<Enrol.length; x++){
       System.out.print(" [01) - Enter Degree Id : ");
       int dId = input.nextInt();
       System.out.print(" [02) - Enter Degree Name : ");
       String dName = input.next();
       System.out.print(" [03) - Enter Max Mo of Modules : ");
       int maxModule = input.nextInt();
       
       Degree Deg1 = new Degree(dId,dName,maxModule);
       
       
       Enrol[x] = Deg1;
       }
       Menu();
       
    }
    static void Display_degree(){
       for(int x=0; x<Enrol.length; x++){
       System.out.println("               ------ Degree-Details ----- ");
       System.out.println(" > Degree Id : " + Enrol[x].degreeId);
       System.out.println(" > Degree Name : " +  Enrol[x].degreeName); 
       System.out.println(" > Max No of mudule to be Add : " +  Enrol[x].MAX_MODULES);
       System.out.println(" --------------------------------------------------------------- ");
       }
       Menu();
    }
    static void Add_module(){
        //Adding the module
        System.out.println("                 < University of Computing - Module Regestation > ");
        System.out.println("---------------------------------------------------------------------------------------------");
        for(int x=0; x<addModule.length; x++){
        System.out.println("Enter Degree Id : ");
        int id = input.nextInt();
        System.out.print(" [01) - Enter Module Id : ");
        String mId = input.next();
        System.out.print(" [02) - Enter Module Name : ");
        String mName = input.next();
        System.out.print(" [03) - Enter Module leader Id : " );
        int index = input.nextInt();
        Lecturer selectedLecture = pro[index - 1];
         
        
        Module Mod1 = new Module(mId,mName,selectedLecture);
        addModule[x] = Mod1;
        }
        Menu();
    }
    static void Display_module(){
        System.out.println("               ------ Module-Details ----- ");
        for(int x=0; x<addModule.length; x++){
        System.out.println(" > Module Id : " + addModule[x].getModuleId());
        System.out.println(" > Module Name : " + addModule[x].getModuleName());
        System.out.println(" > Lecture Id : " + addModule[x].getModuleLeader().lecturerId);
        System.out.println(" > Lecture Name : " + addModule[x].getModuleLeader().name);
//        addModule[0].setfinalExam(10);
//        System.out.println(" > Lecture Name : " + addModule[0].getfinalExam());
        System.out.println(" --------------------------------------------------------------- ");
        }
        Menu();
    }
    static void Enrol_student(){
         //Enroll the students with Degree
        System.out.println("                 < University of Computing - Student Enrollment > ");
        System.out.println("---------------------------------------------------------------------------------------------");
        for(int x=0; x<enrolSd.length; x++){
        System.out.print(" [01) - Enter Student Id : ");
        int stdIndex = input.nextInt();
        Student selectStudent = star[stdIndex - 1];
        
        System.out.println(" DEGREES THAT ARE AVAILABE ");
        for(int i=0; i<Enrol.length; i++){
            System.out.println(" - Degree Id : " + Enrol[i].degreeId + " " + " - Degree Name : " + Enrol[0].degreeName);
        }
        System.out.print(" [02) - Enter Degree Id : ");
        int degIndex = input.nextInt();
        Degree selectDdegree = Enrol[degIndex - 1];
        
       Enrollment entoll = new Enrollment(selectStudent,selectDdegree);
       
       enrolSd[x]=entoll;
        }
       Menu();
    }
    static void Display_enrolment(){
       System.out.println("               ------ Enrolment-Details ----- ");
       for(int x=0; x<enrolSd.length; x++){
       System.out.println(" > Student Id : " + enrolSd[0].studentId.studentId);
       System.out.println(" > Student name : " + enrolSd[0].studentId.name); 
       System.out.println(" > Degree Id : " + enrolSd[0].degreeId.degreeId); 
       System.out.println(" > Degree name : " + enrolSd[0].degreeId.degreeName);
       System.out.println(" --------------------------------------------------------------- ");
       }
       Menu();
    }
    static int Add_Marks(){
        System.out.print("Enter student Id : " );
        int StIndex = input.nextInt();
        Student selectStudent = star[StIndex - 1];
        System.out.print("Enter Module id : " );
        int MoIndex = input.nextInt();
        Module selectModule = addModule[MoIndex - 1];
        System.out.print("Enter Final Exam marks : ");
        int marks = input.nextInt();
        if(marks < 0 || marks>100){
            System.err.print("Invalid marks Entered!!!!!!");
            System.out.print("Enter Final Exam marks : ");
            marks = input.nextInt();
        }
        addModule[MoIndex-1].setfinalExam(marks);
        System.out.print("Enter Coursework marks : ");
        int marks1 = input.nextInt();
        if(marks1 < 0 || marks1>100){
            System.out.print("Enter Coursework marks : ");
            marks1 = input.nextInt();
        }
        addModule[MoIndex-1].setCwork(marks1);
        
        Menu();
     return marks;   
    }
    static void Display_marks(){
        System.out.println("               ------ Evaluvation-Details ----- ");
        for(int x=0; x<star.length; x++){
        System.out.println("Student id : " + star[x].studentId);
        System.out.println("Module id : " + addModule[x].getModuleId());
        System.out.println("Final Exam Marks : " +addModule[x].getfinalExam());
        System.out.println("Coursework marks : " +addModule[x].getCwork());
        System.out.println("The average is : " + (addModule[x].getfinalExam()+addModule[0].getCwork())/2 );
        System.out.println(" --------------------------------------------------------------- ");
        }
        Menu();
    }
   static void Print(){
        try{
    PrintWriter writer = new PrintWriter("Student_record.txt", "UTF-8");
    writer.println("StudentId " +" ModuleId " +"ExamMarks " +"CworkMarks " +"Average");
    writer.println("----------------------------------------------------------------");
    for(int x=0; x<addModule.length; x++){
        //System.out.print("okay"+star[x].studentId);
    writer.println( "\t" + star[x].studentId + "\t" + addModule[x].getModuleId( ) + "\t" + addModule[x].getfinalExam()+ "\t" + addModule[x].getCwork() + "\t   " + (addModule[x].getfinalExam()+addModule[x].getCwork())/2);
    
    }
    writer.close();
    } catch (IOException e) {
   }
        
   Menu();  
   }

  static void Menu(){
              System.out.println("                     -> Menu <- ");
        System.out.println("                   - Press S to Enter Student Details.");
        System.out.println("                   - Press VS to View Student Details.");
        System.out.println("                   - Press L to Enter Lecturer Details.");
        System.out.println("                   - Press VL to View Lecturer Details.");
        System.out.println("                   - Press D to Add Degree details.");
        System.out.println("                   - Press VD to View Degree details.");
        System.out.println("                   - Press M to Add Module details.");
        System.out.println("                   - Press VM to Add Module details.");
        System.out.println("                   - Press E to Add Enrol Students.");
        System.out.println("                   - Press VE to view Enrolment details.");
        System.out.println("                   - Press AM to Add Marks.");
        System.out.println("                   - Press VF to view Marks.");
        System.out.println("                   - Press SA to Save the above Details in text file."+"\n");
        System.out.print  ("                   - Select an option to get in : ");
              String user = input.next();
              
        switch(user){
		case "S":
                    Add_student();
                    break;
                case "VS":
                    Display_student();
                    break;
                case "L":
                    Add_lecturer();
                    break;
                case "VL":
                    Display_lecturer();
                    break;
                case "D":
                    Add_degree();
                    break;
                case "VD":
                    Display_degree();
                    break;
                case "M":
                    Add_module();
                    break;
                case "VM":
                    Display_module();
                    break;
                case "E":
                    Enrol_student();
                    break;
                case "VE":
                    Display_enrolment();
                    break;
                case "AM":
                    Add_Marks();
                    break;
                case "VF":
                    Display_marks();
                    break;
                case "SA":
                    Print();
                    break;
                default:
                    System.err.println("                       Invalid selection ");
                    Menu();
        }
  }
    
}

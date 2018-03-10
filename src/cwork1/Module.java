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
public class Module {
    private String moduleId; // ID for the module
    private String moduleName; // Name of the module
    private Lecturer moduleLeader; // Owner of the module
    private int finalExam;
    private int Cwork;

    public String getModuleId() {
        return moduleId;
    }

    public String getModuleName() {
        return moduleName;
    }

    public Lecturer getModuleLeader() { 
        return moduleLeader; 
    }

    public void setModuleLeader(Lecturer moduleLeader) {
        this.moduleLeader = moduleLeader;
    }
    public int getfinalExam(){
        return finalExam;
    }
    public int getCwork(){
        return Cwork;
    }
    public void setCwork(int value1){
        this.Cwork = value1;
    }
    public void setfinalExam(int value){
        this.finalExam = value;
    }
    public Module(String moduleId, String moduleName ){
        this.moduleId = moduleId;
        this.moduleName = moduleName;
    }
    
   

    public Module(String moduleId, String moduleName, Lecturer moduleLeader){
        this.moduleId = moduleId;
        this.moduleName = moduleName;
        this.moduleLeader = moduleLeader;
        this.finalExam = 0;
        this.Cwork = 0;
        
    }
  
    
}

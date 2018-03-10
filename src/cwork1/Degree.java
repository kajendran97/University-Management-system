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
public class Degree {
    int degreeId;
    String degreeName;
    private Module[] modules;

    final int MAX_MODULES;
    private static int currentIndex = 0;

    public Degree(int degreeId, String degreeName, int maxModules){
        MAX_MODULES = maxModules;
        this.degreeId = degreeId;
        this.degreeName = degreeName;

        modules = new Module[MAX_MODULES];
    }
    public int getdegreeId() {
        return degreeId;
    }
    public String getdegreeName() {
        return degreeName;
    }
    public int getmaxModules(){
        return MAX_MODULES;
    }
    public void AddModules(Module[] modules){
        this.modules = modules;
        this.currentIndex = modules.length;
    }

    public void AddModule(Module module){
        if (currentIndex < MAX_MODULES) {
            modules[currentIndex] = module;
            currentIndex++;
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.handson.managers;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Peter Kosmas
 */
public class FileManager extends FileHandler{
      final   private String[] files;
      private Set<String> pathSet=new TreeSet<String>();
      private Set<String> pathSet2=new TreeSet<String>();

    public Set<String> getPathSet() {
        return pathSet;
    }

    public void setPathSet(Set<String> pathSet) {
        this.pathSet = pathSet;
    }

    public Set<String> getPathSet2() {
        return pathSet2;
    }

    public void setPathSet2(Set<String> pathSet2) {
        this.pathSet2 = pathSet2;
    }

    public Set<String> getFinalSet() {
        return finalSet;
    }

    public void setFinalSet(Set<String> finalSet) {
        this.finalSet = finalSet;
    }
     
      private Set<String> finalSet=new TreeSet<String>();
       private BufferedWriter bufferedWriter;
    private  FileWriter fileWritter;
  public  FileManager(String[] files){
      this.files=files;
  }

  
   
    /*
    * Method that starts the gathering the Information 
    * 1 for First path
    * 2 for Second path
    */
    public void gatherInfo(int parameter){
        if (parameter==1)
        iterate(pathSet);
        else if (parameter==2) iterate(pathSet2);
        
    }
    


 
    /**
     * 
     * @param set 
     */
       private void iterate (Set set){
       
        try {
            setBufferedReader(new BufferedReader(new FileReader(getF())));
        
            String line;
        
            while ((line = getBufferedReader().readLine()) != null) {
                set.add(line);
            }
             
            } 
       catch (FileNotFoundException ex) {
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IOException ex) {
                
                
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
        }//end catch 
    }

      

}

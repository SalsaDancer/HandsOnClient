/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package handson.ws.client;

import com.handson.managers.FileManager;
import com.handson.ws.Exception_Exception;
import com.handson.ws.HandsOnService;
import com.handson.ws.HandsOnService_Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class HandsOnClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] files=new String[2];
        HandsOnService_Service service;
        service=new HandsOnService_Service();
        HandsOnService port=service.getHandsOnServicePort();
         String path="c://test/";
          files[0]=path+"file1.txt";
          files[1]=path+"file2.txt";

      FileManager manager;
       manager = new FileManager(args);
       manager. setFilePath(files[0]);
         manager.openFile();
        manager.gatherInfo(1);
        manager.closeBufferReader();
        manager.setFilePath(files[1]);
        manager.openFile();
        manager.gatherInfo(2);


List<String> list1 = new ArrayList<String>(manager.getPathSet());
List<String> list2 = new ArrayList<String>(manager.getPathSet2());

        try {
            List<String> finalSet;
            finalSet = port.handleInterSeption(list1, list2);
            manager.setFinalSet(new TreeSet<String>(finalSet));
        } catch (Exception_Exception ex) {
            Logger.getLogger(HandsOnClient.class.getName()).log(Level.SEVERE, null, ex);
        }

   System.out.println("Testing Web Service Response");
   Set<String> list=manager.getFinalSet();
   for (String s: list){
       System.out.println(s);
   }
    }
    
}

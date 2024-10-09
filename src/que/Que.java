
package que;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.Scanner;
import javax.swing.JFileChooser;

public class Que {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        String line="";
         Scanner input= new Scanner(System.in); 
        int iCount=0;
        JFileChooser fc = new JFileChooser(".");
        int val = fc.showOpenDialog(fc);
        
        if(val == JFileChooser .APPROVE_OPTION){
            File f = fc.getSelectedFile();
          Scanner output= new Scanner(f); 
          
          while(output.hasNextLine()){
                System.out.println(output.nextLine());
             iCount++;
          }
        }
        System.out.println(iCount);
        Queue<String> que = new LinkedList<>();
        JFileChooser jcs = new JFileChooser(".");
        int vals = jcs.showSaveDialog(null);
        if(vals==JFileChooser.APPROVE_OPTION){
        File f = jcs.getSelectedFile();
        FileWriter fw= new FileWriter(f,true);
        BufferedWriter bw = new BufferedWriter(fw);
        
        while(iCount>=que.size()){
           if(iCount>que.size()){
            System.out.print("Enter your name:");
            String name = input.next();
            que.offer(name);
            bw.write(name+"\n");
            
            System.out.println("successful applicants");}
           
           else {
               System.out.print("Enter your name:");
                String name = input.next();
               System.out.println("unsuccessful applicants");
               bw.close();
               System.exit(0);
                
           }
           
        }
        bw.close();
        }
        
    }
    
}

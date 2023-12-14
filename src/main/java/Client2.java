
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author alaaabdalqader
 */
public class Client2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here

            Socket S2=new Socket("localhost",1515);
            DataInputStream in=new DataInputStream(S2.getInputStream());
            DataOutputStream out=new DataOutputStream(S2.getOutputStream());
             Scanner input=new Scanner(System.in);
               String str="Hello server! Please send me the pizza order\n";
                out.writeUTF(str);
                 do{
                System.out.println(in.readUTF());
                System.out.println(in.readUTF());
                  String Flaver="";
                    
                  
                  do
              { 
                   Flaver=input.next();
                  out.writeUTF(Flaver); 
               
                  if( Flaver.equalsIgnoreCase("Margarita")||Flaver.equalsIgnoreCase("Vegetables") ||Flaver.equalsIgnoreCase("Chicken"))
                  {
                     System.out.println(in.readUTF());
                   break;
                   
                    
                  }
                  else 
                  {
                       System.out.println(in.readUTF()); 
                  
                  }
              }while(true);
                  
                  String size=input.nextLine();
                  
                  do{
                      size=input.nextLine();
                  if(size.equalsIgnoreCase("S")||size.equalsIgnoreCase("M")||size.equalsIgnoreCase("L"))
                  {
                  out.writeUTF(size);
                  break;
                  }
                  else {
                   System.out.println("Wrong out put...Enter size"); 
                  }
                  
                  
                  }while(true);
                  
                
                  System.out.println(in.readUTF());
             
            int numbe=input.nextInt();
            out.writeInt(numbe);
            double price=in.readDouble();
            System.out.println("Your price for pizzza is "+price);
            System.out.println( in.readUTF());
            String ns=input.next();
            out.writeUTF(ns);
            if(ns.equalsIgnoreCase("No") ||ns.equalsIgnoreCase("no") )
            {
            break;
            }
             }while(true);
                 
                  double ck=  in.readDouble();
            System.out.println("The Total Price if you is "+ck);
            
        } catch (IOException ex) {
            Logger.getLogger(Client2.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }
    
}

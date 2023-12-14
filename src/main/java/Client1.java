
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
public class Client1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        try {
            // TODO code application logic here
           //Burger
           
            Socket S=new Socket("localhost",1515);
            DataInputStream in=new DataInputStream(S.getInputStream());
            DataOutputStream out=new DataOutputStream(S.getOutputStream());
            
            Scanner input=new Scanner(System.in);
            
            // String Str=input.nextLine();
             String str="Hello server! Please send me the burger order \n";
             
             out.writeUTF(str);
             do{
             System.out.println(in.readUTF());
             System.out.println(in.readUTF());
             
             
              
             
              String type=" ";
              
              do
              { 
                   type=input.next();
                  out.writeUTF(type); 
               
                  if( type.equalsIgnoreCase("Beef")||type.equalsIgnoreCase("Chicken") ||type.equalsIgnoreCase("Kids"))//type!="beef"|| type!="chicken" ||type!="kids"
                  {
                     System.out.println(in.readUTF());
                   break;
                   
                    
                  }
                  else 
                  {
                       System.out.println(in.readUTF()); 
                  
                  }
                   
              
                           

                  
              }while(true);
              
              
              String flavor=input.nextLine();
              
    while(true){
         flavor=input.nextLine();
               if(type.equalsIgnoreCase("Beef")||type.equalsIgnoreCase("Chicken"))
            {
               if(flavor.equalsIgnoreCase("Grill Harley")||flavor.equalsIgnoreCase("White Mushroom")||flavor.equalsIgnoreCase("Maxican"))
               {
               out.writeUTF(flavor);
               break;
               }
               else   {  System.out.println("Wrong out put"); }
                  
                  
           }
               
               else 
          {
               if(flavor.equalsIgnoreCase("Happy Meal"))
               {
                 out.writeUTF(flavor);
                 break;
               }
               else  System.out.println("Wrong out2 put");
              
           }
               
              
        }
              
            System.out.println(in.readUTF()); 
            
            String SM="";
            
         
          do{
             SM=input.next();
          if(flavor.equalsIgnoreCase("Happy Meal"))
       {
          if(SM.equalsIgnoreCase("Meal"))
          {
               out.writeUTF(SM);
          break;
          }
          else 
          {
              System.out.println("the type is kids, the client should choose only meal.");
          }
          
       }
          else 
     {
           out.writeUTF(SM);
           break;
     }
         
          
          }while(true);
         
                  
          
            System.out.println(in.readUTF());
            
            int quantity=input.nextInt();
            out.writeInt(quantity);
               
                  System.out.println("The price is "+ in.readDouble());
           
            System.out.println(in.readUTF()); 
            
            String ans=input.next();
            out.writeUTF(ans);
            
            if(ans.equalsIgnoreCase("No") ||ans.equalsIgnoreCase("no") )
            {
            break;
            }
             }while(true);
           double ck=  in.readDouble();
            System.out.println("The Total Price if you is "+ck);
            //System.out.println("suucessfull conection ");
            
            
        } catch (IOException ex) {
            Logger.getLogger(Client1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

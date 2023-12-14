
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
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
public class Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            
            
            ServerSocket SS=new ServerSocket(1515);
            Socket S1=SS.accept();
            Socket S2=SS.accept();
              System.out.println("Client 1 and two is connect hhahahhah ");
              DataInputStream   in1=new DataInputStream(S1.getInputStream());
              DataInputStream   in2=new DataInputStream(S2.getInputStream());
              DataOutputStream out1=new DataOutputStream(S1.getOutputStream());
              DataOutputStream out2=new DataOutputStream(S2.getOutputStream());
              
              
              
                ////////Client one is start
            System.out.println(in1.readUTF()); // msg 1 
            
            double total_price=0;
           do{
            String msg1="Grill Harley Resturant Menu \n     *********Beef Burger*********   \n\t     Sandwich\tMeal\nGrill Harley\t3.25JD\t4.45\nWhite Mushroom\t3.75JD\t4.95JD\nMaxican    \t3.75\t4.95\n     *********Chicken Burger*********   \n\t     Sandwich\tMeal\nGrill Harlry\t3.25JD\t4.45JD\nWhite Mushroom\t3.75JD\t4.95JD\nMaxican    \t3.75JD\t4.95JD\n     *********Kids Meal*********   \nHappy Meal\t2.25JD";
            String msg2="Please enter your type of Burger (Beef,Chicken, Kids)";
             out1.writeUTF(msg1);out1.writeUTF(msg2);
             
           
            
               //System.out.println(type);
              
              
               
           do {
                 String type=in1.readUTF();
               if( type.equalsIgnoreCase("Beef")||type.equalsIgnoreCase("Chicken") ||type.equalsIgnoreCase("Kids"))//|| type!="chicken" ||type!="kids"
               {
              
                out1.writeUTF("Please enter your flavor for beef and chicken :( Grill Harley, White Mushroom, Maxican), and for kids (Happy Meal)\n");
               
               break;
               
               }
               else 
               {
               out1.writeUTF("Wrong input... try again");
              
             
               }
               
            }while(true);
                   
               String flavo=in1.readUTF();
            System.out.println("the flavor is "+flavo);
                   
            out1.writeUTF("Do you want Sandwich or Meal?”");
              
            String Sm=in1.readUTF();
             System.out.println("The SM is "+Sm);
              
          out1.writeUTF("Please enter the quantity:");
          
          int quantit=in1.readInt();
            System.out.println("The quantity is"+quantit);
            
            double counter=0;
           if(flavo.equalsIgnoreCase("Grill Harley")  )//||flavor.equals("White Mushroom")||flavor.equals("Maxican"))
           {
               if( Sm.equalsIgnoreCase("Sandwich"))
           counter=(counter+3.25)*quantit;
              
               else {
               
           counter=(counter+4.45)*quantit;
               }
           
           }
           
           else if( flavo.equalsIgnoreCase("White Mushroom")||flavo.equalsIgnoreCase("Maxican") )
           {
               if(Sm.equalsIgnoreCase("Sandwich"))
           counter=(counter+3.75)*quantit;
               else {
               counter=(counter+4.95)*quantit;
               }
           
           }
           
           else if (flavo.equalsIgnoreCase("Happy Meal"))
           {
            counter=(counter+2.25)*quantit;
           }
         
           
           total_price=total_price+counter;
            out1.writeDouble(counter);
             
            out1.writeUTF("Do you want to choose another burger?(small char only  first captial )");
          
            String ans=in1.readUTF();
            
            if(ans.equalsIgnoreCase("No") || ans.equalsIgnoreCase("no") )
            {
            break;
            }
            
        }while(true);
           
          out1.writeDouble(total_price);
          
          
          
          ////////Client one is done 
          ///////Client two is start 
            System.out.println(in2.readUTF());
            
            double total_price2=0;
           
            do{
                String mmg="Grill Harley Resturant Menu \n\n     *******Pizza*******\n\n           \tS\tM\tL\nMargarita\t2.00JD\t2.50JD\t4.50JD\nVegtables\t2.50\t3.25\t4.50JD\nChicken   \t2.75JD\t3.25JD\t5.00\n";
            String mmg2="Please enter your flavor of Pizza (Margarita, Vegetables, Chicken)\n";
             out2.writeUTF(mmg);  out2.writeUTF(mmg2); 

              String t2="";
 do {
                  t2=in2.readUTF();
                 System.out.println("your pizza type you want is "+t2);
               if(t2.equalsIgnoreCase("Margarita")||t2.equalsIgnoreCase("Vegetables") ||t2.equalsIgnoreCase("Chicken"))
               {
              
                out2.writeUTF("Please enter the size of your pizza(S,M,L)\n");
               
               break;
               
               }
               else 
               {
               out2.writeUTF("Wrong input... try again");
              
             
               }
               
            }while(true);
         
 String size2=in2.readUTF();
            System.out.println("your pizza size is "+size2);
            
 
 out2.writeUTF("How many boxes you want of this pizza size?");
 int numbe2=in2.readInt();
            System.out.println("the number of pizza you want is "+numbe2);
           
  double counter2=0;
   if(t2.equalsIgnoreCase("Margarita"))
   {
   if(size2.equalsIgnoreCase("S"))
   {
   counter2=(counter2+2)*numbe2;
   }
   else if (size2.equalsIgnoreCase("M"))
   {
    counter2=(counter2+2.50)*numbe2;
   }
   else if(size2.equalsIgnoreCase("L"))  counter2=(counter2+4.50)*numbe2;
   
   
   }
   //
   else if(t2.equalsIgnoreCase("Vegetables"))
   {
   if(size2.equalsIgnoreCase("S"))
   {
   counter2=(counter2+2.50)*numbe2;
   }
   else if (size2.equalsIgnoreCase("M"))
   {
    counter2=(counter2+3.25)*numbe2;
   }
   else if(size2.equalsIgnoreCase("L"))  counter2=(counter2+4.50)*numbe2;
   }
   //
   else if (t2.equalsIgnoreCase("Chicken"))
   {
   if(size2.equalsIgnoreCase("S"))
   {
   counter2=(counter2+2.75)*numbe2;
   }
   else if (size2.equalsIgnoreCase("M"))
   {
    counter2=(counter2+3.25)*numbe2;
   }
   else if(size2.equalsIgnoreCase("L"))  counter2=(counter2+5.0)*numbe2;
   
   }
   total_price2=total_price2+counter2;
          out2.writeDouble(counter2);
 out2.writeUTF("Do you want to choose another pizza?");
           String as2= in2.readUTF();
           if(as2.equalsIgnoreCase("No")||as2.equalsIgnoreCase("no"))
           {
           
           break;
           }
           
        }while(true);
               out2.writeDouble(total_price2);
            
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}

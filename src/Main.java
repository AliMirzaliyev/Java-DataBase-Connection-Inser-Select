import java.util.*;
import java.sql.*;
public class Main {

    
    public static void main(String[] args)
    {
       DBConnect connect = new DBConnect();
     
       
        while (true) {
            Scanner san = new Scanner(System.in);
            Scanner scan = new Scanner(System.in);
            System.out.println("Would you like to insert data or select data\n"
                    + "1 insert , 0 select please choose your choice\n"
                    + "for exit enter any key but different from 1 and 0\n\n ");
            Integer input = scan.nextInt();
           
            if(input==1){
                System.out.println("Enter ID number :");
                        int id=scan.nextInt();
                    System.out.println("Enter name: ");
                            String name=san.nextLine();
                    System.out.println("Enter lastname : ");
                             String lastname=san.nextLine();
                    System.out.println("Enter grade : ");
                                            int grade=scan.nextInt();
                    connect.insert(id, name, lastname,grade);
                    System.out.println("Data uploaded");
            }
            else if(input==0)
            {
                connect.select();
                    System.out.println("\n");
            }
            else
                break;
        }
        }
    }
    


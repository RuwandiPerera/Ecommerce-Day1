import java.util.*;
 import java.util.Scanner;
 
 public class one{
     public static void main(String[] args)
     {
       // 1)Print a mesage
       System.out.println("Hello World...");
     
 
       // 2)print numbers from 1 to 10
       System.out.println("--------------------------------------------------");
       for (int i = 1; i<=10; i++)
       {
         System.out.println(i);
       }
 
       // 3)print the numbers in reverse
       System.out.println("--------------------------------------------------");
       for (int i = 10; i>0; i--)
       {
         System.out.println(i);
       }
 
       // 4)print the odd numbers between 1 to 20
       System.out.println("--------------------------------------------------");
       for (int i = 1; i <= 20; i++)
       {
         if(i % 2 == 1)
         {
            System.out.println(i); 
         }
       }
 
       /* 5)Reverse the left and right numbers like
          You must use only a loop
             input  9
             output 4 3 2 1 5 9 8 7 6
 
             input 13
             output 6 5 4 3 2 1 7 13 12 11 10 9 8 */
         
       System.out.println("--------------------------------------------------");
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter a Number: ");
       int number = scanner.nextInt();
       int middle = number/2;
       for (int i = 1; i <= number; i++ )
        {
         if(i <= middle)
         {
           System.out.print((middle-i+1)+" ");  
         }
         else
         {
            if(i == middle + 1)  
            {
               System.out.print(i+" ");  
            }
            else
            {
               System.out.print((number - i+ middle + 2) +" "); 
            }
         }
        }
     }
 
 }
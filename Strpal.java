/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strpal;

import java.util.Scanner;

/**
 *
 * @author StarHP
 */
public class Strpal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n=sc.nextLine();
        String str="";
        int g=n.length();
            for(int j=g-1;j>=0;j--)
            {
              str +=n.charAt(j);}
           if(n.equalsIgnoreCase(str))
                    System.out.println("palindrome");
           else
               System.out.println("NOt a palindrome");
            }
        }
        // TODO code application logic here


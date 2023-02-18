/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1lthdt;

import java.util.Scanner;


public class Baitap1LTHDT {

  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("nhap so a");
            double a = sc.nextDouble();
            
        System.out.println("nhap so b");
            double b = sc.nextDouble();
        
            
        if (a==0) {
            if (b==0) {
                System.out.println("phuong trinh vo so nghiem");
                
            } else {
                System.out.println("phương trinh vo nghiem");
            }
          
        } 
       else {
        
            double X = -b / a;
            System.out.println("nghiem x la :"+-b+"/"+a+ "="+X);
            
            
        }
             
      
    }
    
}

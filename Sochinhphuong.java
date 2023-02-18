/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sochinhphuong;

import java.util.Scanner;

/**
 *
 * @author HOANG PHUC
 */
public class Sochinhphuong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so can kiem tra:");
        n = sc.nextInt();
        
        
        float kq = (float) Math.sqrt(n);
        
       if(kq==(int)kq){
           System.out.println(n+"la so chinh phuong");
       } 
       else{
           System.out.println(n+"khong la so chinh phuong");
       }
    }
    
}

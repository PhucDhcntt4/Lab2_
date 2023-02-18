/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.util.Scanner;

/**
 *
 * @author HOANG PHUC
 */
public class Menu {


    public static void main(String[] args) {
        System.out.println("---------------------------------- ");
        System.out.println("---1.Giải phương trình bậc nhất--- ");
        System.out.println("---2.Giải phương trình bậc hai --- ");
        System.out.println("---3.Giải tính tiền điện       --- ");   
        System.out.println("---4.kết thúc                  --- ");
        System.out.println("---------------------------------- ");
        System.out.println("--chọn chức năng : ");
        Scanner sc = new Scanner(System.in);
        int chon = sc.nextInt();
       switch(chon){
           case 1:
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
        break;
           case (2):
        
               double c,x1,x2,delta;
  
        System.out.println("Nhap vao a = ");
         a = sc.nextDouble();
        System.out.println("Nhap vao b = ");
        b = sc.nextDouble();
        System.out.println("Nhap vao c = ");
        c = sc.nextDouble();
        
        
        delta = Math.pow(b, 2) - 4*a*c;
        if(a==0){
            System.out.println("Nhap du lieu sai!");
             }
        else{
        if(delta<0) {
              System.out.println("Phuong trinh vo nghiem! ");
        }
        else if( delta==0) {
          x1 = -b / (2*a);
            System.out.println("phuong trinh co nghiem kep x1=x2= ");
            System.out.println("x1"+x1);
            
        }
           else {
          x1 = (-b - Math.sqrt(delta)) / (2*a);
          x2 = (-b + Math.sqrt(delta)) / (2*a);
          System.out.println("phuong trinh co nghiem ");
          System.out.println("x1 ="+ x1);
            System.out.println("x2 = "+ x2);
        }
        
    } 
        break;
           case 3:
                  float soDien;
        float tienDien;
        
      
        System.out.println("Nhập số điện: ");
        soDien = sc.nextFloat();
        
     if(soDien<=50){
         tienDien = soDien * 100;
     }else {
         tienDien = 50 * 1000 + (soDien - 50 )*1200;
     }
        System.out.println("Tien dien: " + tienDien);
           break;
           case 4:
               System.out.println("khong có chương trình vui longhf nhập lại!");
       } 
    }
}


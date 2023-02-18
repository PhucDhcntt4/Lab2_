/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendien;

import java.util.Scanner;

/**
 *
 * @author HOANG PHUC
 */
public class TienDien {

   
    public static void main(String[] args) {
        float soDien;
        float tienDien;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số điện: ");
        soDien = sc.nextFloat();
        
     if(soDien<=50){
         tienDien = soDien * 100;
     }else {
         tienDien = 50 * 1000 + (soDien - 50 )*1200;
     }
        System.out.println("Tien dien: " + tienDien);
    }
    
}

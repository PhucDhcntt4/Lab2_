/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xeploai;

import java.util.Scanner;

/**
 *
 * @author HOANG PHUC
 */
public class Xeploai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Nhap diem TB:");
        Scanner sc = new Scanner(System.in);
        float diemtb;
        diemtb = sc.nextFloat();
        if(diemtb<5.0){
            System.out.println("Dat loai kem ");
        }
        else if(diemtb<7.0){
            System.out.println("Dat loai trung binh ");
        }
        else if(diemtb<8.0){
            System.out.println("Dat loai kha ");
        }
        else {
            System.out.println("Dat loai gioi ne ^>^");
        }
    }
    
}

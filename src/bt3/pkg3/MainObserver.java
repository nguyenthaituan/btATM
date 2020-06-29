/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt3.pkg3;

import java.util.Scanner;


public class MainObserver {


    public static void main(String[] args) {
        ATM atm = new ATM();
        TaiKhoan tk = new TaiKhoan();
        TaiKhoan tk2 = new TaiKhoan();
        
        tk.dangNhap(atm);  
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so tien gui vao tk: ");
        float tiengui = 0;
        tiengui = scanner.nextFloat();
        tk.setSoDu(tiengui);
   
            while(true)
            {
               System.out.print("Nhap so tien can rut: ");
               float tienrut =0;
               tienrut = scanner.nextFloat();
               atm.ruttien(tienrut);
               System.out.println("/nSo tien con lai trong tk:" + tk.soDu);
               System.out.println("Tiep tuc: y/n" );
               
               String xacnhan = scanner.next();
               if(xacnhan.equalsIgnoreCase("n"))
                   System.out.println("/nSo tien con lai trong tk:" + tk.soDu); 
                   break;
            }
    }
    
}

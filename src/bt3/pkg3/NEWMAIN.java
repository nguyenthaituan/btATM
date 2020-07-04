/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt3.pkg3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class NEWMAIN {
     public static void main(String[] args) {
    
        NEWATM atm = new NEWATM();
        NEWTAIKHOAN tk = new NEWTAIKHOAN(100);      
        tk.dangNhap(atm);
        Scanner scaner = new Scanner(System.in);
       
        while(true)
        {
            System.out.println("Nhập số tiền cần rút: ");
            float tienRut = 0;
            tienRut = scaner.nextFloat();
            atm.rutTien((int) tienRut);
           
            System.out.println("\nTiếp tục: y/n");
            String xacnhan = scaner.next();
            if(xacnhan.equalsIgnoreCase("n")) 
            break;
        }
     }
     
}
    


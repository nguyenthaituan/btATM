/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt3.pkg3;

public class NEWTAIKHOAN implements NEWATM.ATM_OBSERVER{

    float soDu;

    public NEWTAIKHOAN(float soDu) {
        this.soDu = soDu;
    }
   
    public float getSoDu() {
        return soDu;
    }

    public void dangNhap(NEWATM t)
    {
        t.dangNhap((NEWATM.ATM_OBSERVER) this);
    } 
    
    @Override
    public boolean kiemtrasoDu(float tienrut) {
        return (soDu > tienrut);  
    }

    @Override
    public void nhanthongbao(float tienrut, String thongBao) {
        System.out.println("\n"+ thongBao);
        if (kiemtrasoDu(tienrut)) {
            this.soDu -= tienrut;
            System.out.println("So tien con lai:" + this.soDu);
        }
 
    }
    
}

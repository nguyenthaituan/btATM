
package bt3.pkg3;

import java.util.ArrayList;
import java.util.List;

public class ATM {
    TaiKhoan tk;
    List<CapNhatTaiKhoanListener> listeners = new ArrayList<>();

    public ATM() {
    }
    
     public void dangNhap(CapNhatTaiKhoanListener listener){
        if(!listeners.contains(listener))
        {
            this.listeners.add(listener);
            this.tk = (TaiKhoan) listener;
        }
    }
    
    public void dangXuat(CapNhatTaiKhoanListener listener){
        if(this.listeners.contains(listener))
        {
            this.listeners.remove(listener);
        }
    }
    
    public boolean kiemtratienrut(float tienrut)
    {
        if(tk.kiemtrasoDu(tienrut))
        {
            tk.nhanthongbao(tienrut);
            return true;
        }
        else
        {
            tk.nhanthongbao(tienrut);
            return false;
        }
    }
    
    public void ruttien(float tienrut)
   {
       if(kiemtratienrut(tienrut))
       {
           float k = tk.getSoDu();
           tk.setSoDu(k - tienrut);
       }
       
   }
   
    //cai dat ben trong neu giao dien chi phuc vu 1 lop nay thoi
    public static interface CapNhatTaiKhoanListener
    {
        //dua ra giao dien cu the
        public boolean kiemtrasoDu(float tienrut);
        public void nhanthongbao(float tienrut);
        
    }
}

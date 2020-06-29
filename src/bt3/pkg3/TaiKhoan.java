
package bt3.pkg3;
import bt3.pkg3.ATM.CapNhatTaiKhoanListener;

public class TaiKhoan implements CapNhatTaiKhoanListener{
    float soDu;

    public TaiKhoan() {
    }
    public TaiKhoan(float soDu) {
        this.soDu = soDu;
    }

    public float getSoDu() {
        return soDu;
    }

    public void setSoDu(float soDu) {
        this.soDu = soDu;
    }

     public void dangNhap(ATM t)
    {
        t.dangNhap(this);
    }
    
    public void dangXuat(ATM t)
    {
        t.dangXuat(this);
    }

    @Override
    public boolean kiemtrasoDu(float tienrut) {
        if(soDu > tienrut)
            return true;
        else
        return false;
    }

    @Override
    public void nhanthongbao(float tienrut) {
        if(kiemtrasoDu(tienrut))
            System.out.println("da rut tien");
        else
            System.out.println("tk khong du tien");      
    } 
}

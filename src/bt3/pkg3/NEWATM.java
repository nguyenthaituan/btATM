
package bt3.pkg3;

public class NEWATM {
    ATM_OBSERVER observer;
     
    public NEWATM() {
    }

    public NEWATM(ATM_OBSERVER observer) {
        this.observer = observer;
    }
    
    public void dangNhap(ATM_OBSERVER observer)
    {
        this.observer = observer;
    }
    
    private boolean kiemTraTienRut(int soTien)
    {
        return observer.kiemtrasoDu(soTien);
    }
    
    public void rutTien(int soTien)
    {
        if(kiemTraTienRut(soTien))
            observer.nhanthongbao(soTien,"GD Thanh cong");
        else
            observer.nhanthongbao(0, "khong du tien de rut");
    }
    
    public static interface ATM_OBSERVER
    {
    public boolean kiemtrasoDu(float tienrut);
        public void nhanthongbao(float tienrut, String thongBao);
    }
}

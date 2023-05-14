public class sinhVien {
    private int maSinhVien;
    private String hoVaTen;
    private ngaySV Ngaysv;
    private double diemTrungBinh;
    private lopSV lop;
    // ham contructorn
    public sinhVien(int msv,String hvt,ngaySV ngaysv,double dtb,lopSV lop){
        this.maSinhVien=msv;
        this.hoVaTen=hvt;
        this.Ngaysv=ngaysv;
        this.diemTrungBinh=dtb;
        this.lop=lop;
    }
    // ham set vs get
    public int getMaSinhVien(){
        return this.maSinhVien=maSinhVien;
    }
    public void setMaSinhVien(int msv){
        this.maSinhVien=maSinhVien;
    }
    public String getHoVaTen(){
        return this.hoVaTen=hoVaTen;
    }
    public void setHoVaTen(String hvt){
        this.hoVaTen=hoVaTen;
    }
    public ngaySV getNgaysv(){
        return this.Ngaysv=Ngaysv;
    }
    public void setNgaysv(int d){
        this.Ngaysv=Ngaysv;
    }

    public double getDiemTrungBinh() {
       return this.diemTrungBinh=diemTrungBinh;
    }
    public void setDiemTrungBinh(double x){
        if(diemTrungBinh>=0&&diemTrungBinh<=10){
            this.diemTrungBinh=diemTrungBinh;
        }else {
            this.diemTrungBinh=0;
        }
    }
    public lopSV getLop(){
        return this.lop=lop;
    }
    public void setLop(String l){
        this.lop=lop;
    }
    // cac phuong thuc
    public String laytenkhoa(){
        return this.lop.getTenKhoa();
    }
    public boolean kiemtra(){
          return this.diemTrungBinh>=5;
    }
    public boolean kiemtrasinhvien(sinhVien ngaysinhvienkhac){
        return this.Ngaysv.equals(ngaysinhvienkhac.Ngaysv);
    }
}

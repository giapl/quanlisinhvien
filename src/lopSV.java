public class lopSV {
    private String tenLop;
    private String tenKhoa;
    // contructorn
    public lopSV(String tenLop,String tenKhoa){
        this.tenLop=tenLop;
        this.tenKhoa=tenKhoa;
    }
    // ham get va set
    public String getTenLop(){
        return this.tenLop=tenLop;
    }
    public void setTenLop(String tenlop){
        this.tenLop=tenLop;
    }
    public String getTenKhoa(){
        return this.tenKhoa=tenKhoa;
    }
    public void setTenKhoa(String tenkhoa){
        this.tenKhoa=tenKhoa;
    }
}

import java.util.Objects;

public class ngaySV {
    private int ngay;
    private int thang;
    private int nam;
    // contructorn
    public ngaySV(int ngay,int thang,int nam){
        this.ngay=ngay;
        this.thang=thang;
        this.nam=nam;
    }
    // phuong thuc get set
    public int getNgay(){
        return this.ngay=ngay;
    }
    public void setNgay(int d){
        if(ngay>=1&&ngay<=31){
            this.ngay=ngay;
        }else {
            this.ngay=1;
        }
    }
    public int getThang(){
      return  this.thang=thang;
    }
    public void setThang(int m){
        if(thang>=1&&thang<=12){
            this.thang=thang;
        }else {
            this.thang=1;
        }
    }
    public int getNam(){
        return this.nam=nam;
    }
    public void setNam(int y){
        if(nam>=1){
            this.nam=nam;
        }else {
            this.nam=1;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ngaySV ngaySV = (ngaySV) o;
        return ngay == ngaySV.ngay;
    }
}

public class test {
    public static void main(String[] args) {
        ngaySV n=new ngaySV(17,2,345);
        ngaySV n1=new ngaySV(17,2,222);
        lopSV l=new lopSV("cmtt a","khtn va cn");
        sinhVien sv=new sinhVien(222001442,"le dang giap",n,8.53,l);
        sinhVien sv1=new sinhVien(22222,"le thi hong ngoc",n1,8,l);
        System.out.println("hien thi ten khoa:"+l.getTenLop());
        System.out.println("hien thi qua diem tb:"+sv.kiemtra());
        System.out.println("hien thi co hs nao trung ngay khong:"+sv.kiemtrasinhvien(sv1));
        l.getTenLop();
    }
}

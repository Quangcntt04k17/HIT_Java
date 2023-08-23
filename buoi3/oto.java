package buoi3;

public class oto {
    //thuoc tinh cua lop oto
   private String ten;//cho phép truy xuất bất cứ nơi đâu
   private int namSanXuat;//chỉ được phép truy xuất bên trong lớp đó
   private String thangSanXuat;
    //phuong thuc cua lop oto
   public void di()
    {
        System.out.println("oto dang di chuyen");
    }
   public void dunglai()
    {
        System.out.println("Oto dang dung lai");
    }
   public void inThongtin()
    {
        System.out.println("ten:"+ten);
        System.out.println("nam san xuat "+namSanXuat);
        System.out.println("Thang san xuat "+thangSanXuat);
    }
    public String getten()
    {
        return ten;//getter cần dữ liệu trả về và return 
    }
    // set + ten thuoc tinh
    public void setten(String ten2)
    {
        ten = ten2;
    }
    public int getnamSanXuat()
    {
        return namSanXuat;
    }
    public void setnamSanXuat(int namSanXuat2)
    {
        namSanXuat = namSanXuat2;
    }
    // hàm tạo 
    public oto()//trùng với tên class và để phạm vi public
    {
        // hàm tạo không tham số 
    }
    public oto(String ten2, int namsx)
    {
        ten = ten2;
        namSanXuat = namsx;// hàm tạo đầy đủ tham số
    }
    public static void main(String[] args) {
        oto oto1=new oto("Audi",1999);//tự động gọi đến hàm tạo 
    //    oto1.setten("Audi");
    //    System.out.println(oto1.getten());
    //    oto1.setnamSanXuat(1001);       //số thì k được thêm " "
    //    System.out.println(oto1.getnamSanXuat());
    oto1.inThongtin();
    }
}

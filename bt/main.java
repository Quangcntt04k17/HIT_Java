/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt;

import java.util.Scanner;

/**
 *
 * @author This PC
 */
public class main {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int lc=0;
        BT ds = new BT();
        do {            
            System.out.println("Menu-------------");
            System.out.println("Nhập lựa chọn: ");
            System.out.println("1. Thêm mobile");
            System.out.println("2. Xóa mobile");
            System.out.println("3. Tìm kiếm mobile theo tên");
            System.out.println("4. Sắp xếp theo giá tăng dần");
            System.out.println("5. Tính tổng giá toàn bộ số mobile đã nhập");
            System.out.println("6. ShowAll Mobile");
            System.out.println("7. Tìm theo giá");
            lc=s.nextInt();
            s.nextLine();
            if(lc==1)
            {
                System.out.println("Nhap id: ");
                String id=s.nextLine();
                System.out.println("Nhap name: ");
                String name = s.nextLine();
                System.out.println("Nhap gia: ");
                double gia= s.nextDouble();
                System.out.println("Nhap so luong: ");
                int sl=s.nextInt();
                s.nextLine();
                System.out.println("Nhap hang sx: ");
                String hangsx=s.nextLine();
                System.out.println("Nhap ram: ");
                String ram=s.nextLine();
                Mobile m = new Mobile( id, name, gia, sl,hangsx, ram);
                ds.addMobile(m);
            }
            else if(lc==2)
            {
                System.out.println("Nhap ten mobile muon xoa: ");
                String name = s.nextLine();
                Mobile m= new Mobile(name);
                ds.delMobile(m);
            }
            else if(lc==6)
            {
                System.out.println("Cac mobile co trong danh sach: ");
                ds.showMobile();
            }
            else if(lc==5)
            {
                System.out.println("Tổng của tất cả các mobile đã nhập là: ");
                ds.tongtien();
            }
            else if(lc ==3)
            {
                System.out.println("Nhập tên mobile cần tìm: ");
                String name= s.nextLine();
                ds.timten(name);
            }
            else if(lc==7)
            {
                System.out.println("Nhập giá : ");
                int gia = s.nextInt();
                ds.timgia(gia);
            }
            else if(lc==4)
            {
                ds.sapxep();
                ds.showMobile();
            }
        } while (lc!=0);
    }
}

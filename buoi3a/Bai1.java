package buoi3a;

import java.util.Scanner;

public class Bai1 {
    private String maSach;
    private String tenSach;
    private String tenTacGia;
    private String nhaXuatBan;
    private int namXuatBan;

    public Bai1() {
    }

    public Bai1(String maSach, String tenSach, String tenTacGia, String nhaXuatBan, int namXuatBan) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tenTacGia = tenTacGia;
        this.nhaXuatBan = nhaXuatBan;
        this.namXuatBan = namXuatBan;
    }

    public void setmaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getmaSach() {
        return maSach;
    }

    public void settenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String gettenSach() {
        return tenSach;
    }

    public void settenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public String gettenTacGia() {
        return tenTacGia;
    }

    public void setnhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public String getnhaXuatBan() {
        return nhaXuatBan;
    }

    public void setnamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public int getnamXuatBan() {
        return namXuatBan;
    }

    public void Nhap(Scanner input) {
        System.out.print("Ma sach: ");
        this.maSach = input.nextLine();

        System.out.print("Ten sach: ");
        this.tenSach = input.nextLine();

        System.out.print("Ten tac gia: ");
        this.tenTacGia = input.nextLine();

        System.out.print("Nha xuat ban: ");
        this.nhaXuatBan = input.nextLine();

        System.out.print("Nam xuat ban: ");
        this.namXuatBan = input.nextInt();
        input.nextLine();
    }

    public void Xuat() {
        System.out.printf("%-25s%-25s%-25s%-25s%-10d\n", getmaSach(), gettenSach(), gettenTacGia(), getnhaXuatBan(), getnamXuatBan());
    }

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Bai1 book[] = new Bai1[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Nhap thong tin sach thu " + (i + 1));
            book[i] = new Bai1();
            book[i].Nhap(input);
        }
        
        System.out.printf("%-25s%-25s%-25s%-25s%-10s\n", "Ma sach", "Ten sach", "Ten tac gia", "Nha xuat ban", "Nam xuat ban");
        for (int i = 0; i < 5; i++) {
            book[i].Xuat();
        }
    }
}
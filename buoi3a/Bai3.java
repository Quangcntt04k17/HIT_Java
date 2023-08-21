package buoi3a;

import java.util.Scanner;

public class Bai3 {
    private String maSV;
    private String tenSV;
    private float diemToan;
    private float diemLy;
    private float diemHoa;

    public Bai3() {
    }

    public Bai3(String maSV, String tenSV, float diemToan, float diemLy, float diemHoa) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public void setmaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getmaSV() {
        return maSV;
    }

    public void settenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public String gettenSV() {
        return tenSV;
    }

    public void setdiemToan(float diemToan) {
        this.diemToan = diemToan;
    }

    public float getdiemToan() {
        return diemToan;
    }

    public void setdiemLy(float diemLy) {
        this.diemLy = diemLy;
    }

    public float getdiemLy() {
        return diemLy;
    }

    public void setdiemHoa(float diemHoa) {
        this.diemHoa = diemHoa;
    }

    public float getdiemHoa() {
        return diemHoa;
    }

    public void Nhap(Scanner input) {
        System.out.print("Ma SV: ");
        this.maSV = input.nextLine();

        System.out.print("Ten SV: ");
        this.tenSV = input.nextLine();

        System.out.print("Diem Toan: ");
        this.diemToan = input.nextFloat();

        System.out.print("Diem Ly: ");
        this.diemLy = input.nextFloat();

        System.out.print("Diem Hoa: ");
        this.diemHoa = input.nextFloat();
        input.nextLine();
    }

    public void Xuat() {
        System.out.printf("%-20s%-20s%-20f%-20f%-20f%-20f\n", getmaSV(), gettenSV(), getdiemToan(), getdiemLy(), getdiemHoa(), diemTB());
    }

    public float diemTB() {
        return (getdiemToan() + getdiemLy() + getdiemHoa()) / 3;
    }

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Bai3 SV[] = new Bai3[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Nhap thong tin SV thu " + (i + 1));
            SV[i] = new Bai3();
            SV[i].Nhap(input);
        }
        
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s\n", "Ma SV", "Ten SV", "Diem Toan", "Diem Ly", "Diem Hoa", "Diem TB");
        for (int i = 0; i < 5; i++) {
            SV[i].Xuat();
        }
    }
}
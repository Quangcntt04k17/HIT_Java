import java.util.Scanner;
public class bai3 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Nhap so nguyen duong n : ");
    int n= s.nextInt();
    int dem = 0;
    for(int i=1;i<=n;i++)
    {
        if(n%i==0)
        {
            dem++;
        }
    }
    System.out.println("Ket qua :");
    if(dem==2)
    System.out.println(n + " la so nguyen to");
    else
    System.out.println(n + " khong phai la so nguyen to");
    }
    
}

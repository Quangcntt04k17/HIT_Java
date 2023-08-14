package buoi2;
import java.util.Scanner;
public class bai1 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Nhap so phan tu mang n : ");
        int n = s.nextInt();
        int [] a = new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("a["+i+"] = ");
            a[i]=s.nextInt();
        }
        int [] b = new int[n];
        for(int i=0;i<n;i++)
        {
            b[i]=1;
           for(int j=i+1;j<n;j++)
           {
            if(a[i]==a[j]){
            b[i]++; //so lan xuat hien
            a[j]=-1;}
           }
        }
        System.out.println("So lan xuat hien cua cac phan tu :");
        for (int i = 0; i < n; i++) {
            if (a[i] != -1) {
                System.out.println(a[i] + " xuat hien " + b[i] + " lan");
            }
        }

    }
}

package buoi2;
import java.util.Scanner;
public class bai4 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String a = s.nextLine();
        String b= new String();
        String c=new String();
        int n = a.length();
        int t=n;
        for(int i=0;i<=(n+1)/2;i++)
        {
            b=a.substring(i,i+1);
            c=a.substring(n-1-i,n-i);

            if(b.compareTo(c)!=0)
            {
                t--;
            }
        }
        if(t!=n)
        {
            System.out.print("False");
        }
        else
        {
            System.out.print("True");
        }
    }
}


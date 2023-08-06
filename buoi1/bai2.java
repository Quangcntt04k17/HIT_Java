import java.util.Scanner;
public class bai2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        float S = 0;
        float P=0;
        int gt =1;
        int n = s.nextInt();
        for(int i=1; i<=n;i++)
        {
            gt*=i;
            S+= (float)1/i;
            P+=gt;

        }
        
        System.out.println("S= "+ S);
        System.out.println("P= "+P);
    }
}

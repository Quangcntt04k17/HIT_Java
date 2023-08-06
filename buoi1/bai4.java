import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap a : ");
        float a = s.nextFloat();
        System.out.println("Nhap b : ");
        float b = s.nextFloat();
        System.out.println("Nhap c : ");
        float c = s.nextFloat();
        float x1, x2, x3, x4,t1,t2;
        if (a != 0) {
            float d = b*b - 4 * a * c;
            if (d == 0) {
                float t = -b / (2 * a);
                if (t >= 0) {
                    x1 = (float) Math.sqrt(t);
                    x2 = -(float) Math.sqrt(t);
                    System.out.println("x1 = " + x1);
                    System.out.println("x2 = " + x2);
                } else
                    System.out.println("phuong trinh vo nghiem ! ");
            }
            if (d < 0)
                System.out.println("phuong trinh vo nghiem ! ");
            if (d > 0) {
                t1 = (float) ((-b + Math.sqrt(d)) / (2 * a));
                t2 = (float) ((-b - Math.sqrt(d)) / (2 * a));
                if (t1 > 0 && t2 > 0) {
                x1 = (float) Math.sqrt(t1);
                x2 = -(float) Math.sqrt(t1);
                x3 = (float) Math.sqrt(t2);
                x4 = -(float) Math.sqrt(t2);
                 System.out.println("x1 = " + x1)   ;
                 System.out.println("x2 = " + x2)   ;
                 System.out.println("x3 = " + x3)   ;
                 System.out.println("x4 = " + x4)   ;
                }
                if(t1<0 && t2<0)
                {
                    System.out.println("Phuong trinh vo nghiem ! ");
                }
                if(t1>0 && t2<0)
                {
                x1 = (float) Math.sqrt(t1);
                x2 = -(float) Math.sqrt(t1);
                System.out.println("x1 = " + x1)   ;
                System.out.println("x2 = " + x2)   ;
                }
                if(t1<0 && t2>0)
                {
                x1 = (float) Math.sqrt(t2);
                x2 = -(float) Math.sqrt(t2);
                System.out.println("x1 = " + x1)   ;
                System.out.println("x2 = " + x2)   ;
                }
            }
        }
         else {
            if(b==0)
            {
                if(c==0)
                {
                    System.out.println("phuong trinh vo so nghiem ");
                }
                else
                System.out.println("phuong trinh vo nghiem !");
            }
            else
            {
                if((-c/b)>=0)
                {
                    x1 = (float)Math.sqrt(-c/b);
                    x2 = -(float)Math.sqrt(-c/b);
                    System.out.println("x1 = "+ x1);
                    System.out.println("x2 = "+ x2);
                }
                else
                System.out.println("phuong trinh vo nghiem ! ");
            }


        }
    }
}

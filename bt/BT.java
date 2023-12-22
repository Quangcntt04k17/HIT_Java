/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bt;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author This PC
 */
public class BT implements MobileManager{
    private ArrayList<Mobile> danhSach;

    public BT() {
        this.danhSach= new ArrayList<>();
    }

    public BT(ArrayList<Mobile> danhSach) {
        this.danhSach = danhSach;
    }
    
    
    public void addMobile(Mobile m)
    {
       this.danhSach.add(m);
    }


    public void delMobile(Mobile m) {
        
      this.danhSach.remove(m);
    }
    
    public void showMobile()
    {
        for(Mobile m:danhSach)
        {
            System.out.println(m);
        }
    }
    public void timten(String name)
    {
        for(Mobile m: danhSach)
        {
            if(m.getName().indexOf(name)>=0)
            {
                System.out.println("những mobile có tên "+name+" là: ");
                System.out.println(m);
            }
            else 
                System.out.println("không tìm thấy");
            
        }
    }
    public void timgia(int gia)
    {
        for(Mobile m: danhSach)
        {
            if(Math.abs(m.getGia()-gia)<=10000)
            {
                System.out.println("Có những mobile giá gần đấy là: ");
                System.out.println(m);
            }
            else{
                System.out.println("không có sản phẩm nào có giá tuongư tự ");
            }
        }
    }
    public void sapxep()
    {
        Collections.sort
        (this.danhSach, new Comparator<Mobile>(){
        public  int compare(Mobile mb1, Mobile mb2)
        {
            if(mb1.getGia()<mb2.getGia())
            {
                return -1;
            }
            else if(mb1.getGia()>mb2.getGia())
            {
                return 1;
            }
            else {
                return 0;
            }
        }
        });
        
    }

                
    
    public void tongtien()
    {
        double tong = 0;
        for(Mobile m: danhSach)
        {
            tong = tong + m.getGia();
        }
        System.out.println(tong);
    }
        }
        
  


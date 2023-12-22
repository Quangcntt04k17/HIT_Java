/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt;

import java.util.Objects;

/**
 *
 * @author This PC
 */
public class Mobile extends Product{
    private String hangsx;
    private String ram;

    public Mobile(String id, String name, double gia, int sl,String hangsx, String ram) {
        super(id, name, gia, sl);
        this.hangsx = hangsx;
        this.ram = ram;
    }

    public Mobile(String hangsx, String ram) {
        this.hangsx = hangsx;
        this.ram = ram;
    }
    public Mobile(String name)
    {
        
    }

    Mobile() {
    }

    public String getHangsx() {
        return hangsx;
    }

    public String getRam() {
        return ram;
    }

    public void setHangsx(String hangsx) {
        this.hangsx = hangsx;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }
    public void getTotalPrice()
    {
        double tong = 1.2*getSl()*getGia();
        System.out.println("Tổng tiền: "+tong);
    }

    @Override
    public String toString() {
        return super.toString()+ " " + "hangsx=" + hangsx + ", ram=" + ram + '}';
    }

    public int compareTo(Mobile o) {
        return this.getId().compareTo(o.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,name,gia,sl,hangsx,ram);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Mobile other =(Mobile) obj;
        return Objects.equals(name, other.name);
    }
    
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt;

/**
 *
 * @author This PC
 */
public abstract class Product {
    String id;
    String name;
    double gia;
    int sl;

    public Product(String id, String name, double gia, int sl) {
        this.id = id;
        this.name = name;
        this.gia = gia;
        this.sl = sl;
    }

    public Product() {
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGia() {
        return gia;
    }

    public int getSl() {
        return sl;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }
    public void getTotalPrice()
    {
        double tong=0;
        tong=gia*sl;
        System.out.println("tổng tiền là: "+tong);
    }

    @Override
    public String toString() {
        return "{" + "id=" + id + ", name=" + name + ", gia=" + gia + ", sl=" + sl ;
    }
    
}

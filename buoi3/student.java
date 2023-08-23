package buoi3;

public class student {
    private int id;
    private String name;
    private int age;
    private String address;
    private int score;
    public student(int id1,String name1 , int age1,String address1, int score1)
    {
        id=id1;
        name = name1;
        age=age1;
        address=address1;
        score=score1;
    } 
    public void setid(int id)
    {

    }
    public int getid()
    {
        return id;
    }
    public void setname()
    {

    }
    public String getname()
    {
        return name;
    }
    public void setage(int age)
    {

    }
    public int getage()
    {
        return age;
    }
    public void setaddress()
    {

    }
    public String getaddress()
    {
        return address;
    }
    public void setscore(int score)
    {

    }
    public int getscore()
    {
        return score;
    }
    public static void main(String[] args) {
        student student1 = new student(2022603818,"Quang",19,"thanh hoa",10);
        System.out.println(student1.getid());
        System.out.println(student1.getname());
        System.out.println(student1.getage());
        System.out.println(student1.getaddress());
        System.out.println(student1.getscore());
    }
    

}

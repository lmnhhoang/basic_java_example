package Part4;

public class Main {
    public static void main(String[] args) {
        //OOP Class - Object
        Nguoi nguoi1 = new Nguoi();
        nguoi1.setHoVaTen("Will Smith");
        nguoi1.setTuoi(20);
        nguoi1.setGioiTinh("Nam");
        nguoi1.setDiaChi("Mĩ");
        nguoi1.setGiau(true);
        System.out.println(nguoi1.toString());
        //Ke thua
        LapTrinhVien lapTrinhVien = new LapTrinhVien();
        lapTrinhVien.setHoVaTen("Lap Trinh Vien");
        lapTrinhVien.setChucVu("Truong phong");
        System.out.println(lapTrinhVien.toString());
        //override
        Cho cho_dom = new Cho();
        cho_dom.keu();

        Meo meo_tam_the = new Meo();
        meo_tam_the.keu();

        Vit vit_xiem = new Vit();
        vit_xiem.keu();
        //overLoad
        nguoi1.chao();
        nguoi1.chao("Will Smith");
        nguoi1.chao("Will Smith", "Chris Rock");
        //Truu tuong
        Vehicle car = new Car();
        car.start();

        //Stack -> variables, references to objects, and partial results
        //Heap -> objects and Java Runtime Environment (JRE) classes

        //references variable
        Demo D1 = new Demo(); // the default constructor is called and returns a reference of the object

        System.out.println(D1); // The value of a reference variable is a reference.

        System.out.println(D1.display()); //access the methods display() of the class demo using our custom reference variable that we created
    }
}

class Demo {
    int x = 10;
    int display()
    {
        System.out.println("x = " + x);
        return 0;
    }
}

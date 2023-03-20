package Part5;

import Part2.Students;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("File I/O");
        //FileOutputStream
        try {
            FileOutputStream fos = new FileOutputStream("file1.dat");
            String text = "this is a test byte file";
            byte[] textByte = text.getBytes();
            fos.write(textByte);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //FileInputStream
        try {
            FileInputStream fis = new FileInputStream("file1.dat");
            int c;
            while ((c = fis.read()) != -1){
                System.out.println((char) c);
            }
            fis.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //DataOutputStream
        try {
            FileOutputStream fos = new FileOutputStream("filedata.dat");
            DataOutputStream dos = new DataOutputStream(fos);
            final int NUMBER = 5;
            dos.writeInt(NUMBER);
            dos.writeUTF("Hello");
            dos.writeDouble(10.5);
            dos.flush();
            dos.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //I/O Object with exception
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("fileobject.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            Stock[] stocks = { new Stock(1,"p1",100.0,20),
                    new Stock(2,"p2",100.0,20),
                    new Stock(3,"p3",100.0,20),
                    new Stock(4,"p4",100.0,20)
            };
            oos.writeObject(stocks);
            oos.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("I/O has error");
        } finally {
            try {
                fos.close();
            } catch (IOException e){
                System.out.println(e);
            }
        }
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream("fileobject.dat");
            ois = new ObjectInputStream(fis);
            Stock[] stocks = (Stock[]) ois.readObject();
            System.out.println("Doc tu file: ");
            for (Stock s: stocks) {
                System.out.println(s);
            }
            ois.close();
            fis.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        //FileReader/FileWriter
        File filename = new File("first.txt");
        try {
            FileWriter out = new FileWriter(filename);
            out.write("Doc du lieu Java");
            out.close();

            FileReader input = new FileReader(filename);
            int ch = input.read();
            while (ch != -1){
                System.out.println((char) ch);
                ch = input.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String loader(String FilePath) {
        BufferedReader br = null;
        String str = null;
        StringBuilder strb = new StringBuilder();

        try {
            br = new BufferedReader(new FileReader(FilePath));
            while ((str = br.readLine()) != null) {
                strb.append(str).append("\n");
            }
        } catch (FileNotFoundException f) {
            System.out.println(FilePath + " does not exist");
            return null;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return strb.toString();
    }
}


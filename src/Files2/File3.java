package Files2;

import java.io.*;
import java.util.Random;

public class File3 {
    public static void main(String[] args) throws IOException {  //Задание 32 РТ-1 стр 79
        DataOutputStream a;
        try {
            a = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("./hello.dat")));
        } catch (FileNotFoundException e){
            System.out.println("File not found");
            return;}
        Random r = new Random();
        int[] array = new int[20];
        for (int i=0; i<array.length; i++) {
            array[i] = r.nextInt(100);
            a.writeInt(array[i]);
          // System.out.print(array[i]+" ");
        }
        a.close();


        DataInputStream dataInputStream = null;
        try{
        dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream("./hello.dat")));}
        catch (FileNotFoundException e){
        System.out.println("File not found");
        return;}
         int res = dataInputStream.readInt();
        int summ = 0; int sred = 0;
        System.out.println("Содержимое файла: ");
       while (true) {
           System.out.print(res + " ");
           try {
               res = dataInputStream.readInt();
           } catch (EOFException e) {
               break;
           }
       }
        for (int i1 = 0; i1 < 20; i1++) {
            summ = summ + array[i1];
            sred = summ / 20;
        }
        System.out.println(" ");
        System.out.println("Среднее значение: " + sred);
 if (dataInputStream!=null) { dataInputStream.close();}
    }
}







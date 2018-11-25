import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;


public class Main {
    public static void main(String[] args) throws IOException, NullPointerException {


            BufferedInputStream bufferedInputStream;              // Задание 31 РТ-1  стр 76
            try {
                bufferedInputStream = new BufferedInputStream(new FileInputStream("./test_file.txt"));
            } catch (FileNotFoundException e) {
                System.out.print("File not found");
                return;
            }
            bufferedInputStream.close();

            BufferedReader bufferedReader;
            try {
                bufferedReader = new BufferedReader(new FileReader("./test_file.txt"));
                String res = bufferedReader.readLine();
                String res2 = res;
                while (res2 != null) {
                    System.out.println(res2);
                    res2 = bufferedReader.readLine();
                }
                bufferedReader.close();
                String str2 = res.trim();

                     String str1 = str2.replaceAll( "[^\\d]", "" );
                     int intRes= Integer.parseInt(str1);
                System.out.println(intRes);

                     int sum = 0;
                     while (intRes != 0) {
                         sum = sum + intRes % 10;
                         intRes = intRes / 10;
                     }
                     System.out.println("Сумма цифр = " + sum);
                 intRes= Integer.parseInt(str1);

                    int j = 0;
                    int len = Integer.toString(intRes).length();
                    int[] arr = new int[len];
                    while(intRes!=0) {
                        arr[len - j - 1] = intRes % 10;
                        intRes = intRes / 10;
                        j++;
                    }

                ArrayList arrayList = new ArrayList();
                for (int el : arr) {
                    arrayList.add(el);
                }

                ArrayList arrayList1 = new ArrayList();
                Iterator iterator = arrayList.iterator();               // отбрасываем повторяющиеся числа
            while (iterator.hasNext()) {
                int o = (int) iterator.next();
                if (!arrayList1.contains(o)) arrayList1.add(o);
            }
                System.out.println("Новый список: " + arrayList1);

            } catch (FileNotFoundException e) {
                System.out.print("File nod found");
            }
        }
    }

package Files2;

import java.io.File;

public class Files4 {
    public static void main(String[] args) {
        File f1 = new File("D:\\Checks");
        System.out.println(f1.getAbsolutePath());
        System.out.println(f1.isDirectory());
        System.out.println(f1.isHidden());


        File f2 = new File("D:\\Checks");
        if (f2.isDirectory()) {
            for (File item : f2.listFiles()) {

                if (item.isDirectory()) {
                    System.out.println(item.getName() + "  \t folder");
                } else {
                    System.out.println(item.getName() + "\t file");
                }
            }
        }
    }
}
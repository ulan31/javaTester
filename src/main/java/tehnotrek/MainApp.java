package tehnotrek;

import org.apache.camel.main.Main;

/**
 * A Camel Application
 */
public class MainApp {

    /**
     * A main() so we can easily run these routing rules in our IDE
     */
    public static void main(String... args) throws Exception {
        /*
        ** задача 1
         */
        int[] a = {2, 6, 7, 12};
        for (int i=0; i<a.length; i++) {
            if(a[i]%2 == 0 && a[i]%3 == 0){
                //System.out.println(a[i]);
               // System.out.format("%d%n", a[i]);
            }
        }

        /*
        ** задача 2
         */
        int[] b = new int[7];
        for (int i=0; i<b.length; i++){
            if(i%2 == 0){
               b[i] = i;
            }
        }
    }

}


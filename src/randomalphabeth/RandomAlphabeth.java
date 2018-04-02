/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomalphabeth;

import java.util.Random;
/**
 *
 * @author ASUS A455L
 */
public class RandomAlphabeth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RandomAlphabeth fungsi = new RandomAlphabeth();
        System.out.println("Random Alphabet dan Numeric =");
        System.out.println("");
        System.out.println(fungsi.getRandomAlphabeth(10));
    }

    public String getRandomAlphabeth(int captcha) {
        char[] a = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890".toCharArray();
//        char[] x = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
//        char[] y = "1234567890".toCharArray();
        char[] b = new char[captcha];
//        char[] c = new char[captcha];
//        char[] d = new char[captcha];
        Random r = new Random();
        for (int i = 0; i < captcha; i++) {
            b[i] = a[r.nextInt(a.length)];
//            c[i] = x[r.nextInt(x.length)];
//            d[i] = y[r.nextInt(y.length)];
        }
     
        return new String(b);
    }
}

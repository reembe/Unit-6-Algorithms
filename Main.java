import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] i = {1, 2 ,3};
        Algs.alg1(i);
        System.out.println("");
        int[] j = {5, 6 ,8};
        Algs.alg1(j);
        System.out.println("");

        int[] k = {3, 2 ,1};
        System.out.println(Arrays.toString(Algs.alg2(k, 0, 2)));
        int[] l = {5, 2 ,5, 8};
        System.out.println(Arrays.toString(Algs.alg2(l, 0, 3)));

        int[] y = {3, 2 ,1};
        System.out.println(Algs.alg3(y));
        int[] u = {6, 2 ,5,5,7};
        System.out.println(Algs.alg3(u));

        int[] w = {3, 2 ,1};
        System.out.println(Algs.alg4(w));
        int[] q = {8, 7 ,3,4,5};
        System.out.println(Algs.alg4(q));

        String[] f = {"Hello, ", "world" ,"!"};
        System.out.println(Algs.alg5(f));
        String[] x = {"Pen", "Pineapple" ,"Apple", "Pen"};
        System.out.println(Algs.alg5(x));

        String[] v = {"Hello, ", "world" ,"!"};
        System.out.println(Algs.alg6(v));
        String[] z = {"Pen", "Pineapple" ,"Apple", "Pen", "Apple"};
        System.out.println(Algs.alg6(z));

        int[] ii = {2, 3 ,4};
        int[] ll = {-1, -2 ,-3};
        System.out.println(Algs.alg7(ii, ll));
        int[] jj = {8, 7 ,3,4,5};
        int[] cc = {3, -6 ,1};
        System.out.println(Algs.alg7(jj, cc));

        double[] ww = {2.0, 3.0, 4.0, 5.0};
        System.out.println(Algs.alg8(ww));
        double[] qq = {9.0, 34.0, 75.0, 5.0};
        System.out.println(Algs.alg8(qq));

        int[] d = {1, 0, -1};
        System.out.println(Algs.alg11(d));
        int[] qc = {8, -7 ,2,-3,5};
        System.out.println(Algs.alg11(qc));

        String[] a = {"zebra", "alpha"};
        System.out.println(Algs.alg14(a));
        String[] p = {"apple", "banana" ,"vines"};
        System.out.println(Algs.alg14(p));




    }
}

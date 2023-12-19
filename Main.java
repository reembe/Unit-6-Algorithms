import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] i = {1, 2 ,3};
        Algs.alg1(i);
        System.out.println("");
        int[] j = {5, 6 ,8};
        Algs.alg1(j);
        System.out.println("");
        int[] m = {2, 7 ,8, 6};
        Algs.alg1(m);
        System.out.println("");

        int[] k = {1, 2 ,3, 4};
        System.out.println(Arrays.toString(Algs.alg2(k, 1, 2)));
        int[] l = {5, 2 ,5, 8};
        System.out.println(Arrays.toString(Algs.alg2(l, 0, 3)));
        int[] c = {7, 2 ,6, 2, 1};
        System.out.println(Arrays.toString(Algs.alg2(c, 2, 4)));

        int[] y = {3, 2 ,1};
        System.out.println(Algs.alg3(y));
        int[] u = {6, 2 ,5,5,7};
        System.out.println(Algs.alg3(u));
        int[] hj = {3,4,1,7,44,3};
        System.out.println(Algs.alg3(hj));

        int[] w = {3, 2 ,1};
        System.out.println(Algs.alg4(w));
        int[] q = {8, 7 ,3,4,5};
        System.out.println(Algs.alg4(q));
        int[] qf = {3,2,5,23,55,2};
        System.out.println(Algs.alg4(qf));

        String[] f = {"Hello, ", "world" ,"!"};
        System.out.println(Algs.alg5(f));
        String[] x = {"Pen", "Pineapple" ,"Apple", "Pen"};
        System.out.println(Algs.alg5(x));
        String[] xd = {"Sally", "Sold", "Seashells"};
        System.out.println(Algs.alg5(xd));

        String[] v = {"Hello, ", "world" ,"!"};
        System.out.println(Algs.alg6(v));
        String[] z = {"Pen", "Pineapple" ,"Apple", "Pen", "Apple"};
        System.out.println(Algs.alg6(z));
        String[] fd = {"Sally", "Sold", "Seashells", "On the", "Seashore"};
        System.out.println(Algs.alg6(fd));

        int[] ii = {2, 3 ,4};
        int[] ll = {-1, -2 ,-3};
        System.out.println(Algs.alg7(ii, ll));
        int[] jj = {8, 7 ,3,4,5};
        int[] cc = {3, -6 ,1};
        System.out.println(Algs.alg7(jj, cc));
        int[] jdj = {3,-2,3,4,-43,42,3};
        int[] cd = {3,3,2,43,3,-2,34,55,3,2,};
        System.out.println(Algs.alg7(jdj, cd));

        double[] ww = {2.0, 3.0, 4.0, 5.0};
        System.out.println(Algs.alg8(ww));
        double[] qq = {9.0, 34.0, 75.0, 5.0};
        System.out.println(Algs.alg8(qq));
        double[] eq = {67.0, 34.0, 2.0, 2.0, 1.0};
        System.out.println(Algs.alg8(eq));

        int[] hh = {1, 2, 3};
        System.out.println(Arrays.toString(Algs.alg9(hh)));
        int[] hf = {3, 1, 0};
        System.out.println(Arrays.toString(Algs.alg9(hf)));
        int[] s = {5,2,3,2,34,2,3,2,3};
        System.out.println(Arrays.toString(Algs.alg9(s)));

        int[] dd = {1, 2, 3, 3, 4};
        System.out.println(Algs.alg10(dd));
        int[] qcf = {8,-7,5};
        System.out.println(Algs.alg10(qcf));
        int[] qdcf = {3,2,4,2,3,2,3,3,2};
        System.out.println(Algs.alg10(qdcf));

        int[] d = {1, 0, -1};
        System.out.println(Algs.alg11(d));
        int[] qc = {8, -7 ,2,-3,5};
        System.out.println(Algs.alg11(qc));
        int[] dc = {4,2,3,4,2};
        System.out.println(Algs.alg11(dc));

        int[] df = {1, 2, 3, 2};
        System.out.println(Algs.alg12(df));
        int[] qcg = {8, -7 ,2,-3,5};
        System.out.println(Algs.alg12(qcg));
        int[] qcgs = {2,22,2,2,2,2,3,2,3};
        System.out.println(Algs.alg12(qcgs));

        int[] gd = {1, 2, 1, 1, 1};
        System.out.println(Algs.alg13(gd, 1));
        int[] vd = {3,3,3,3,3,3,2,3};
        System.out.println(Algs.alg13(vd, 3));
        int[] bd = {3,3,32,3,23,2};
        System.out.println(Algs.alg13(bd, 2));

        String[] a = {"zebra", "alpha"};
        System.out.println(Algs.alg14(a));
        String[] p = {"apple", "banana" ,"vines"};
        System.out.println(Algs.alg14(p));
        String[] ps = {"what", "does", "the", "fox"};
        System.out.println(Algs.alg14(ps));




    }
}

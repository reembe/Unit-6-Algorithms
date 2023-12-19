

public class Algs {


    public static void alg1(int[] i) {
        for (int j : i)
            System.out.print(j + " ");
    }


    public static int[] alg2(int[] i, int j, int h) {
        int k = i[j];
        i[j] = i[h];
        i[h] = k;
        return i;
    }


    public static int alg3(int[] i) {
        int max = i[0];
        for (int j = 1; j < i.length; j++) {
            if (i[j] > i[j - 1]) {
                max = i[j];
            }
        }
        return max;
    }


    public static int alg4(int[] i) {
        int min = i[0];
        for (int j = 1; j < i.length; j++) {
            if (i[j] < i[j - 1]) {
                min = i[j];
            }
        }
        return min;
    }

        public static String alg5(String[] i)
    {
        String shrt = i[0];
        for (int j = 1; j < i.length; j++)
        {
            if (i[j].length() < i[j - 1].length())
            {
                shrt = i[j];
            }


        }
        return shrt;
    }

    public static String alg6(String[] i)
    {
        String shrt = i[0];
        for (int j = 1; j < i.length; j++)
        {
            if (i[j].length() > i[j - 1].length())
            {
                shrt = i[j];
            }


        }
        return shrt;
    }
    public static int alg7(int[] i, int[] j)
    {
       int diff = Math.abs(i[0] - j[0]);
        for (int l = 1; l < i.length; l++)
        {
            for (int k = 1; k < j.length; k++)

            {
                diff = Math.abs(i[l] - j[k]);
            }


        }
        return diff;
    }

    public static double alg8(double[] i)
    {
        double add = 0.0;
        for (double j : i)
            add += j;

        return(add/i.length);

    }

    public static int[] alg9(int[] i)
    {
        for (int k = 0; k < i.length / 2; k++)
        {
            int j = i[k];
            i[k] = i[i.length - k - 1];
            i[i.length - k - 1] = j;

        }
        return i;

    }

    public static boolean alg10(int[] i)
    {
        int count = 0;
        for (int j = 0; j < i.length - 1; j++) {

                if (i[j] == i[j + 1]) {
                    count++;


            }
        }
        return count >= 1;

    }

    public static int alg11(int[] i)
    {
        for (int j = 0; j < i.length; j++) {
            if (i[j] < 0) {
                return j;
            }
        }
        return -1;
    }

    public static boolean alg12(int[] i){
        for(int j = 0; j < i.length; j++ ){
            for(int l = j; l < i.length; l++){
                if(l + 1 < i.length && i[j] == i[l + 1])
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static int alg13(int[] i, int L) {
        int l = 0;
        int j = 0;

        for (int k : i) {
            if (k == L) {
                l++;
            } else {
                if (l > j) j = l;
                l = 0;
            }

        }
        return Math.max(l, j);
    }
    public static String alg14(String[] i)
    {
        String shrt = i[0];
        for (int j = 1; j < i.length; j++)
        {
            if (i[j].compareTo(i[j-1]) > 0)
            {
                shrt = i[j];
            }

        }
        return shrt;
    }
}



















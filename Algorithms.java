
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
        int max = 0;
        for (int j = 0; j < i.length; j++) {
            if (i[j] > i[j + 1] && j < (i.length - 1)) {
                max = i[j];
            }
        }
        return max;
    }


    public static int alg4(int[] i) {
        int min = 0;
        for (int j = 0; j < i.length; j++) {
            if (i[j] < i[j + 1] && j != (i.length - 1)) {
                min = i[j];
            }
        }
        return min;
    }

        public static String alg5(String[] i)
    {
        String shrt = "null";
        for (int j = 0; j < i.length; j++)
        {
            if (i[j].length() < i[j + 1].length() && j != (i.length - 1))
            {
                shrt = i[j];
            }


        }
        return shrt;
    }

    public static String alg6(String[] i)
    {
        String shrt = "null";
        for (int j = 0; j < i.length; j++)
        {
            if (i[j].length() > i[j + 1].length() && j != (i.length - 1))
            {
                shrt = i[j];
            }


        }
        return shrt;
    }




    public static String alg14(String[] i)
    {
        String shrt = "null";
        for (int j = 0; j < i.length; j++)
        {
            if (i[j].compareTo(i[j+1]) > 0 && j != (i.length - 1))
            {
                shrt = i[j];
            }

        }
        return shrt;
    }
}



















import java.util.Arrays;
public class Mutability {
    public static int u (int a, int b) {
        a *= 2;
        b += 10;
        return a + b;
    }
    public static void p (int c, int d) {
        c -= 15;
        d *= 3;
        System.out.printf("%d %d", c, d);
    }
    public static void r (int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] += 5;
        }
    }
    public static int[] o (int[] myMassiv) {
        int[] Mas = new int[myMassiv.length];
        for (int i = 0; i < myMassiv.length; i++) {
            Mas[i] = myMassiv[i] + 5;
        }
        return Mas;
    }

    public static void main (String[] args) {
        int[] myArray = {1,2,3};
        int[] myArr = {4,5,6};
        int a = 23;
        int b = 15;
        int c = 48;
        int d = 24;
        p(b, c);

        System.out.printf("%d %d" , b, c);
        d = u(a, b);
        System.out.printf("%d %d %d" , a, b, d);

        System.out.println(java.util.Arrays.toString(myArray));
        r(myArray);
        System.out.println(java.util.Arrays.toString(myArray));


        System.out.println(java.util.Arrays.toString(myArr));
        int[] gfg= o(myArr);
        System.out.println(java.util.Arrays.toString(myArr));
        System.out.println(java.util.Arrays.toString(gfg));

    }
}

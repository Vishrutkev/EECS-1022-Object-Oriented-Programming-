package fibonaccii;
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
public class Sequence {
    public static boolean checkseq(int num){
        int a = 1;
        int b = 1;
        int c = a+b;
        if (num == 0){
            return true;
        } else if (num == 1){
            return true;
        } else {

            for (int i = 0; i < num; i++) {
                b = a;
                a = c;
                c = a + b;
                if (c == num) {
                    return true;
                }
            }
        }

        return false;

    }

    public static void main(String[] args) {
        System.out.println(checkseq(121392));

    }
}

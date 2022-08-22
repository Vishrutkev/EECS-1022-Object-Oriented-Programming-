package eecs1022;

public class week6 {

    public static String replaceDigit(String s){
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            //String digit = s.substring(i, i+1);
            char elei = s.charAt(i);
            if (Character.isDigit(elei)) {
                System.out.print(elei + "|");
                result.append("#");
            }else {
                result.append(elei);
            }

        }
        return result.toString();
    }

    public static void main(String[] args) {

        String s = "Hello EECS 1022, date is feb 23";
        String r = replaceDigit(s);
        System.out.println();
        System.out.println("Before: "+ s);
        System.out.println("After: "+ r);

    }
}

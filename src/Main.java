import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("*********** 1 uzduotis ***********");

        result(7, 5);

        System.out.println("*********** 2 uzduotis ***********");

        System.out.println(PISq());
        //arba//
        double resDobel = PISq();
        System.out.println(resDobel);

        System.out.println("*********** 3 uzduotis ***********");
        int x = 10;
        int y = 15;

        System.out.println(sandauga(x,y));

        System.out.println("*********** 4 uzduotis ***********");

        int[] arr = {6,5,7,8};
        printArr(arr);
        System.out.println("hi");

        System.out.println("*********** 5 uzduotis ***********");

        System.out.println(randNumb(1,50));

        System.out.println("*********** 6 uzduotis ***********");

        int[] rndArr = rndIntArr (10, 20, 30);
        printArr(rndArr);

        System.out.println("*********** 7 uzduotis ***********");

        System.out.println( sumArr(rndArr));

        System.out.println("*********** 8 uzduotis ***********");

        System.out.println(avgArr(rndArr));

        System.out.println("*********** 9 uzduotis ***********");

        int row = 20;
        int column = 30;
        printRectang(20,30);

        System.out.println("*********** 10 uzduotis ***********");

        String sentence = "Šiandien labai graži diena";
        countSymbols(sentence);

        System.out.println("*********** 11 uzduotis ***********");

        String input = "Pukuotukas";
        System.out.println(input);
        System.out.println("Atvirkščiai: " + revString(input));

        System.out.println("*********** SUNKESNE 1 uzduotis ***********");

        String bruksniai = "---";
        printSakinys(bruksniai);

        System.out.println("*********** SUNKESNE 2 uzduotis ***********");

    }
    // SUNKESNE 1 uzduotis//
    public static void printSakinys(String bruksniai) {
        System.out.println(bruksniai + "Kempiniukas Plačiakelnis" + bruksniai);
    }
    // SUNKESNE 2 uzduotis//


    public static void result(int a, int b) {
        System.out.println(a + b);
    }
    public static double PISq() {
        return  9.8596;
    }
    public static int sandauga(int x, int y) {
        int sandauga = x * y;
        return (sandauga);
    }
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static int randNumb(int min, int max) {
        return (int) (min + Math.random() * (max - min));
    }
    public static int[] rndIntArr(int min,int max,int length){
        int[] arr = new int[length];
        for(int i= 0; i < length; i++){
            arr[i] = min - (int)Math.round(Math.random()*(max-min));
        }
        return arr;
    }
    public static int sumArr(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static double avgArr(int[] arr) {
        return (double) sumArr(arr) / arr.length;

    }
    public static void printRectang (int row, int column) {
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void countSymbols (String sentence) {
        int letters = 0;
        int spaces = 0;

        for (int i = 0; i < sentence.length(); i++) {
            char symbol = sentence.charAt(i);
            if (Character.isLetter(symbol)) {
                letters++;
            } else if (Character.isWhitespace(symbol)) {
                spaces++;
            }
        }
        System.out.println("Raidžių skaičius: " + letters);
        System.out.println("Tarpų skaičius: " + spaces);
    }
    public static String revString(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }



}

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

        int[] arr2 = numArr (10, 20, 30);
        printArr(arr2);

        System.out.println("*********** 7 uzduotis ***********");




    }
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
    public static int[] numArr(int min,int max,int length){
        int[]array= new int[length];
        for(int i= 0; i < length; i++){
            array[i] = min - (int)Math.round(Math.random()*(max-min));
        }
        return array;
    }

}

public class Main {
    public static void main(String[] args) {

//       //declare a array
//        int[] newArray;
//        //cấp phát bộ nhớ cho mảng
//        int[] myArray = new int[10];
//        //tức là kích thước mảng ở đây là 10
//
//        // assign
//        //int[] Array = {1, 3, 5, 7, 9, 11};
//        myArray[0] = 1;
//        myArray[1] = 2006;
//        myArray[2] = 29;
//
//        int arraySize =  10;
//        int[] yourArray = new int[arraySize];
//        for (int i = 0; i < arraySize; i++) {
//            yourArray[i] = i;
//            System.out.printf(yourArray[i] + " \n");
//        }
//
//        System.out.println("The length of array 'yourArray' is " + yourArray.length);

        int[] myArray =  {3, 5, 7, 30, 10, 5, 8, 23, 0, -5};
        int sum = 0;
        int avg;
        int countLength = myArray.length;
        boolean isFound = false;

        //truy xuất vào mảng`
        for (int i = 0; i < countLength; i++)
//            sum += myArray[i];
//            if (myArray[i] <= 0) {
//                isFound = true;
//                System.out.println("The nummber < 0: " + myArray[i] + " locate is " + i);
//            }
        if (!isFound)
            System.out.println("Not found value in this list number < 0");
//        avg = sum / 2;
//        System.out.println("The sum and average of list numbers are " + sum + "| average: " + avg);



    }
}
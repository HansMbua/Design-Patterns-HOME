import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int receiptsAmount;
        System.out.println("enter your amount");
        receiptsAmount = input.nextInt();



       add(receiptsAmount);

    }


    public static void add( int receiptsAmount) {

        if (receiptsAmount != 0) {
            int point = 5;
            int sum = receiptsAmount / 10;

            for (int i = 1; i < sum; i++) {
                point = point + 2;
            }
            displayResult(point);
        }
    }


//        int point = 5;
//        if (receiptsAmount > 10 ){
//            point = 5;
//            displayResult(point);
//
//        }
//        if (receiptsAmount > 20){
//            addPoint(point);
//            displayResult(point);
//        }
//         if (receiptsAmount > 30){
//            point = point + 2;
//            displayResult(point);
//        }
//        if (receiptsAmount > 40){
//            point = point + 2;
//            displayResult(point);
//        }




    public static void displayResult(int point){
        System.out.println("the point is : "+point);
    }
}
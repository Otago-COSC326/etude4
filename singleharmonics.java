

/*this uses single precision*/


import java.lang.Float;
import java.util.Random;

public class singleharmonics{


    public static void main(String[]argv){

        float forward = (0.5f + 0.6f + 0.555f );
        float backward = (0.555f + 0.6f + 0.5f);

        System.out.println(forward);
        System.out.println(backward);

//        int count = 10;
//        int[] numbers = new int[count];
//        Random random = new Random();
//        for(int i = 0; i < count; i++){
//            numbers[i] = random.nextInt((1000 - 1) + 1) + 1;
//        }
//
//        System.out.println("Single Precision [Forward + Backward]");
//
//        for(int i= 0 ; i < count; i++){
//            System.out.println("-------Single-------");
//            singlePrecisionForwards(numbers[i]);
//            singlePrecisionBackwards(numbers[i]);
//            System.out.println("-------Double-------");
//            doublePrecisionForwards(numbers[i]);
//            doublePrecisionBackwards(numbers[i]);
//            System.out.println("");
//        }

//        System.out.println("Single Precision [Backward]");
//        for(int i= 0 ; i < count; i++){
//            singlePrecisionBackwards(numbers[i]);
//        }

//        System.out.println("Double Precision [Forward]");
//        for(int i= 0 ; i < count; i++){
//            doublePrecisionForwards(numbers[i]);
//        }
//
//        System.out.println("Double Precision [Backward]");
//        for(int i= 0 ; i < count; i++){
//            doublePrecisionBackwards(numbers[i]);
//        }
    }


    //prints out harmonics counting Backwards using single precision
    public static void singlePrecisionBackwards(float number){
        float result = 0.0f;
        float storenum = number;
        while (number > 0){
            result = result + (float) 1 / number;
            number--;
        }
        System.out.println(result);
    }


    //prints out harmonics counting forwards using single precision
    public static void singlePrecisionForwards(float number){
        float result = 0.0f;
        float start = 1;

        while (start <= number){
            result = result + (float) 1 / start;
            start++;
        }
        System.out.println(result);
    }

    //prints out harmonics counting backwards using double precision
    public static void doublePrecisionBackwards(double number){
        double result = 0.0f;
        double storenum = number;
        while (number > 0){
            result = result + (double) 1 / number;
            number--;
        }
        System.out.println(result);
    }

    //prints harmonics counting forwards using double precision
    public static void doublePrecisionForwards(double number){
        double result = 0.0f;
        int start = 1;

        while (start <= number){
            result = result + (double) 1 / start;
            start++;
        }
        System.out.println(result);
    }

    public static float randomInRange(float min, float max) {
        Random random = new Random();
        float range = max - min;
        float scaled = random.nextFloat() * range;
        float shifted = scaled + min;
        return shifted; // == (rand.nextDouble() * (max-min)) + min;
    }

    public static double randomInRange(double min, double max) {
        Random random = new Random();
        double range = max - min;
        double scaled = random.nextDouble() * range;
        double shifted = scaled + min;
        return shifted; // == (rand.nextDouble() * (max-min)) + min;
    }
}





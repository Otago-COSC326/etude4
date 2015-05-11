import java.lang.Float;
import java.lang.String;
import java.util.*;
import java.util.ArrayList;

public class Deviation {


	public static void main(String[] args){


        System.out.println();
        System.out.println("-----------------------Float----------------------");
        List<Float> numbers = new ArrayList<>();
        for(int i = 0; i < 500; i ++){
            numbers.add(10.0f);
        }
        for(int i = 0; i < 500; i ++){
            numbers.add(10.1f);
        }

        System.out.println("------------(#500 -> 10.0, #500 -> 10.1)------------");
        Float[] toArray = numbers.toArray(new Float[numbers.size()]);
        dev1(toArray);
        dev2(toArray);


        Float[] values = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 10000000.0f};

        for(Float value : values){
            System.out.println("------------Add fixed number [" + value + "]------------");
            numbers = addValues(numbers, value);
            toArray = numbers.toArray(new Float[numbers.size()]);
            dev1(toArray);
            dev2(toArray);
        }

//        Float[] toArray = numbers.toArray(new Float[numbers.size()]);
//        dev1(toArray);
//		dev2(toArray);

//        System.out.println("---------Float (0.00 -> 1000.00)---------");
//        List<Float> numbers = new ArrayList<>();
//        for(float i = 0.0f; i < 10000.0f; i++){
//            numbers.add(i);
//        }
//        Float[] toArray = numbers.toArray(new Float[numbers.size()]);
//        dev1(toArray);
//        dev2(toArray);
//
//        System.out.println("---------Float(Float.MAX_VALUE 1000 times)---------");
//        numbers = new ArrayList<>();
//        for(float i = 0.0f; i < 10000.0f; i++){
//            numbers.add((Float.MAX_VALUE));
//        }
//        toArray = numbers.toArray(new Float[numbers.size()]);
//        dev1(toArray);
//        dev2(toArray);
//
//        System.out.println("---------Float(Float.MIN_VALUE 1000 times)---------");
//        numbers = new ArrayList<>();
//        for(float i = 0.0f; i < 10000.0f; i++){
//            numbers.add((Float.MIN_VALUE));
//        }
//        toArray = numbers.toArray(new Float[numbers.size()]);
//        dev1(toArray);
//        dev2(toArray);
//
//        System.out.println("---------Float(Fixed Number -> 8900)---------");
//        numbers = new ArrayList<>();
//        for(float i = 0.0f; i < 10000.0f; i++){
//            numbers.add(i + 8900);
//        }
//        toArray = numbers.toArray(new Float[numbers.size()]);
//        dev1(toArray);
//        dev2(toArray);
//
//        System.out.println("---------Float(Fixed Number -> 8900.1234)---------");
//        numbers = new ArrayList<>();
//        for(float i = 0.0f; i < 10000.0f; i++){
//            numbers.add(i + 8900.1234f);
//        }
//        toArray = numbers.toArray(new Float[numbers.size()]);
//        dev1(toArray);
//        dev2(toArray);
//
//        System.out.println("---------Float(Fixed Number -> Integer.MAX_VALUE - 1000000000)---------");
//        numbers = new ArrayList<>();
//        for(float i = 0.0f; i < 10000.0f; i++){
//            numbers.add(i + (Integer.MAX_VALUE - 1000000000));
//        }
//        toArray = numbers.toArray(new Float[numbers.size()]);
//        dev1(toArray);
//        dev2(toArray);
	}

	public static float ab(Float[] numbers){
		float ai = 0.00f;
		for(int i = 0; i < numbers.length; i++){
			ai += numbers[i];
		}
		return ai/numbers.length;
	}

	public static float dev1(Float[] numbers){
		float summation = 0.00f;
		int n = numbers.length;
		for(int i = 0; i < n; i++){
			summation += (float) Math.pow((numbers[i] - ab(numbers)), 2); //(ai - ab)^2
		}
		float root = (float) Math.sqrt((summation/n));
		System.out.println("Eq1: " + root);
		return root;
	}

	public static float dev2(Float[] numbers){
		float summation1 = 0.00f;
		int n = numbers.length;
		for(int i = 0; i < n; i++){
			summation1 += (float) Math.pow(numbers[i], 2);
		}
		float summation2 = 0.00f;
		for(int i = 0; i < n; i++){
			summation2 += numbers[i];
		}
		float nomi = (float)(summation1 - Math.pow(summation2, 2)/n);
		float root = (float) Math.sqrt(nomi/n);
		System.out.println("Eq2: " + root);
		return root;
	}

    public static List<Float> addValues(List<Float> numbers, Float value){
        List<Float> result = new ArrayList<Float>();
        for (int i = 0; i < numbers.size(); i ++){
            result.add(numbers.get(i) + value);
        }
        return result;
    }
}
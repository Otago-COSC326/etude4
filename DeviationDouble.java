import java.lang.Double;
import java.util.*;

public class DeviationDouble {


	public static void main(String[] args){

        System.out.println();
        System.out.println("-----------------------Double----------------------");
        List<Double> numbers = new ArrayList<>();
        for(int i = 0; i < 500; i ++){
            numbers.add(10.0);
        }
        for(int i = 0; i < 500; i ++){
            numbers.add(10.1);
        }

        System.out.println("------------(#500 -> 10.0, #500 -> 10.1)------------");
        Double[] toArray = numbers.toArray(new Double[numbers.size()]);
        dev1(toArray);
        dev2(toArray);


        Double[] values = {1.0, 10.0, 100.0, 1000.0, 10000.0, 100000.0, 1000000.0, 10000000.0};

        for(Double value : values){
            System.out.println("------------Add fixed number [" + value + "]------------");
            numbers = addValues(numbers, value);
            toArray = numbers.toArray(new Double[numbers.size()]);
            dev1(toArray);
            dev2(toArray);
        }

//        System.out.println("---------Double (0.00 -> 1000.00)---------");
//        List<Double> numbers = new ArrayList<>();
//        for(double i = 0.0; i < 10000.0; i++){
//            numbers.add(i);
//        }
//        Double[] toArray = numbers.toArray(new Double[numbers.size()]);
//        dev1(toArray);
//        dev2(toArray);
//
//        System.out.println("--------Double (Double.MIN_VALUE 1000 times)----------");
//        numbers = new ArrayList<>();
//        for(double i = 0.0; i < 10000.0; i++){
//            numbers.add((Double.MIN_VALUE));
//        }
//        toArray = numbers.toArray(new Double[numbers.size()]);
//        dev1(toArray);
//        dev2(toArray);
//
//        System.out.println("--------Double (Double.MIN_VAUE 1000 times)----------");
//        numbers = new ArrayList<>();
//        for(double i = 0.0; i < 10000.0; i++){
//            numbers.add((Double.MAX_VALUE));
//        }
//        toArray = numbers.toArray(new Double[numbers.size()]);
//        dev1(toArray);
//        dev2(toArray);
//
//        System.out.println("--------Double (Fixed Number -> 8900)----------");
//        numbers = new ArrayList<>();
//        for(double i = 0.0; i < 10000.0; i++){
//            numbers.add(i + 8900.5);
//        }
//        toArray = numbers.toArray(new Double[numbers.size()]);
//        dev1(toArray);
//        dev2(toArray);
//
//        System.out.println("--------Double (Fixed Number -> 8900.1234)----------");
//        numbers = new ArrayList<>();
//        for(double i = 0.0; i < 10000.0; i++){
//            numbers.add(i + 8900.1234);
//        }
//        toArray = numbers.toArray(new Double[numbers.size()]);
//        dev1(toArray);
//        dev2(toArray);
//
//        System.out.println("--------Double (Fixed Number -> Integer.MAX_VALUE - 1000000000)----------");
//        numbers = new ArrayList<>();
//        for(double i = 0.0; i < 10000.0; i++){
//            numbers.add(i + (Integer.MAX_VALUE - 1000000000));
//        }
//        toArray = numbers.toArray(new Double[numbers.size()]);
//        dev1(toArray);
//        dev2(toArray);
    }

	public static double ab(Double[] numbers){
		double ai = 0.00f;
		for(int i = 0; i < numbers.length; i++){
			ai += numbers[i];
		}
		return ai/numbers.length;
	}

	public static double dev1(Double[] numbers){
		double summation = 0.00f;
		int n = numbers.length;
		for(int i = 0; i < n; i++){
			summation += Math.pow((numbers[i] - ab(numbers)), 2); //(ai - ab)^2
		}
		double root = Math.sqrt((summation/n));
		System.out.println("Eq1: " + root);
		return root;
	}

	public static double dev2(Double[] numbers){
		double summation1 = 0.00f;
		int n = numbers.length;
		for(int i = 0; i < n; i++){
			summation1 += Math.pow(numbers[i], 2);
		}
		double summation2 = 0.00f;
		for(int i = 0; i < n; i++){
			summation2 += Double.valueOf(numbers[i]);
		}
		double nomi = summation1 - Math.pow(summation2, 2)/n;
		double root = Math.sqrt(nomi/n);
		System.out.println("Eq2: " + root);
		return root;
	}

    public static List<Double> addValues(List<Double> numbers, Double value){
        List<Double> result = new ArrayList<Double>();
        for (int i = 0; i < numbers.size(); i ++){
            result.add(numbers.get(i) + value);
        }
        return result;
    }
}
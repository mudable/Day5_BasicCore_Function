package com.bz.basic_core_function;

public class SumEqualsZero{ 
static void arraySum() {

	int[] array = {5, -4, -2, 6, 8};
    for (int i = 0; i < array.length - 2; i++) {
        for (int j = i + 1; j < array.length - 1; j++) {
            for (int k = j + 1; k < array.length; k++) {
                if (array[i] + array[j] + array[k] == 0) {
                    System.out.println("Sum of the array elements resulting to 0 are ");
                    System.out.print(array[i] + " ");
                    System.out.print(array[j] + " ");
                    System.out.print(array[k] + " ");
                }
            }
        }
    }


}

public static void main(String[] args) {
    arraySum();
}

}

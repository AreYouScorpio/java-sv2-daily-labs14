package day04;

import java.util.Arrays;
import java.util.Collections;

public class PairFinder {

    public int findPairs(int[] arr){ // -> 5,1,4,5
        int pairs=0;
        int [] newArr = Arrays.stream(arr).distinct().sorted().toArray();
        for (int i=0; i<newArr.length; i++) {

            int actualNumber = newArr[i]; // 1,4,5 and  1, 3, 5, 6, 7
            pairs += (Arrays.stream(arr).filter(p -> p == actualNumber).count()) / 2;

            System.out.println(newArr[i] + "-s számból ennyi van: " + Collections.frequency(Arrays.stream(arr).boxed().toList(), newArr[i]));
        }
        return pairs;
    }




    public static void main(String[] args) {
        PairFinder pairFinder = new PairFinder();
        int [] numbers = {5, 1, 4, 5};
        int [] numbers2 = {7, 1, 5, 7 , 3, 3, 5, 7, 6, 7 };
        int [] numbers3 = {1,2,2,2,2,2,2,2 };

        System.out.println("Ennyi pár van: " +pairFinder.findPairs(numbers));
        System.out.println("Ennyi pár van: " +pairFinder.findPairs(numbers2));
        System.out.println("Ennyi pár van: " +pairFinder.findPairs(numbers3));



    }

}

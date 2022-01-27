package day04;

import java.util.Arrays;

public class PairFinder {

    public int findPairs(int[] arr){ // -> 5,1,4,5
        int x=0;
        int pairs=0;
        int [] newArr = Arrays.stream(arr).distinct().sorted().toArray();
        for (int i=0; i<newArr.length; i++) {
            //if (Arrays.stream(arr).min().getAsInt()==newArr[i]) {
              //  pairs++;
            int actualNumber=newArr[i]; // 1,4,5 and  1, 3, 5, 6, 7
            pairs+= (Arrays.stream(arr).filter(p->p==actualNumber).count()-1);
        }
        if(pairs%2!=0) pairs--;
        return pairs;
    }




    public static void main(String[] args) {
        PairFinder pairFinder = new PairFinder();
        int [] numbers = {5, 1, 4, 5};
        int [] numbers2 = {7, 1, 5, 7 , 3, 3, 5, 7, 6, 7 };

        System.out.println("Ennyi pár van: " +pairFinder.findPairs(numbers));
        System.out.println("Ennyi pár van: " +pairFinder.findPairs(numbers2));



    }

}

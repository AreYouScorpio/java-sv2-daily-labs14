package day05;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static day05.FileReader.FILENAME;
import static day05.FileReader.houses;


public class Streets {


    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        fileReader.readFile(Path.of(FILENAME));


        for (Map.Entry<String, List<Integer>> entry : houses.entrySet()) {
            List<Integer> housenumbers = new ArrayList<>(Arrays.asList(2, 4, 1, 3, 5, 6, 7, 9, 8, 11));
            System.out.println("A teljes házszámlista: " + housenumbers);

            System.out.println(entry.getKey() + " utca: ");
            System.out.println("Adatsora: " + entry.getValue().toString());
            System.out.println("Házszámai: ");

            for (int i = 0; i < entry.getValue().size(); i++) {
                if (entry.getValue().get(i) == 0) {
                    Integer actual = housenumbers.stream().filter(o -> o % 2 < 1).findFirst().get();
                    System.out.println(actual);
                    housenumbers.remove(actual);
                } else {
                    Integer actual = housenumbers.stream().filter(o -> o % 2 > 0).findFirst().get();
                    System.out.println(actual);
                    housenumbers.remove(actual);
                }
            }
        }


    }

}

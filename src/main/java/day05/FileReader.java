package day05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class FileReader {

    public static final String FILENAME = "src/main/resources/streets.txt";


    public static Map<String, List<Integer>> houses = new TreeMap<>();

    public Map<String, List<Integer>> getHouses() {
        return houses;
    }

    public String dataflow;


    public void readFile(Path p) throws IllegalStateException {
        try {
            List<String> lines = Files.readAllLines(p);
            for (String line : lines) {

                    dataflow = line.trim();
                    System.out.println(dataflow);



                    String s[] = line.trim().split(" ");
                    if (!houses.containsKey(s[0])) houses.put(s[0], new ArrayList<>());
                    houses.get(s[0]).add(Integer.parseInt(s[1]));
                    System.out.println(houses);


            }

        } catch (
                IOException ise) {
            throw new IllegalStateException("Can't read file!", ise);
        }
    }


}
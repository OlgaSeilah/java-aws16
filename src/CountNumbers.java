import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class CountNumbers {
    public static void main(String[] args) {
        Random r = new Random();
        Map<Integer, Integer> map = new TreeMap<>();

        for (int i = 0; i < 100; i++) {
            int randomNumber = r.nextInt(10)+1;

            if (!map.containsKey(randomNumber)) {
                map.put(randomNumber, 0);
            } else {
                map.put(randomNumber, map.get(randomNumber) + 1);
            }

        }
        System.out.println(map);
    }

}

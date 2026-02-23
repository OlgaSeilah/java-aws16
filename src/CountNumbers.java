import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class CountNumbers {
    public static void main(String[] args) {
        Random r = new Random();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < 100; i++) {
            int randomNumber = r.nextInt(10);

            if (!map.containsKey(randomNumber)) {
                map.put(randomNumber, 0);
            } else {
                map.put(randomNumber, map.get(randomNumber) + 1);
            }

        }
        System.out.println(map);
    }

}

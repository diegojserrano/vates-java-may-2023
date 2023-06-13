import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Principal {
    public static void main(String[] args) {

        List<Integer> nums = new Random().ints(1000, 1, 1000000).boxed().toList();

        //List<Integer> nums = List.of(1,8,3,6,8,2,3,7,1,3,3);


        //Map<Integer, Long> cantidades =  nums.stream().collect(Collectors.groupingBy(n -> n % 10, Collectors.counting()));

        Map<Integer, Double> promedios =  nums.stream().collect(Collectors.groupingBy(n -> n % 10, Collectors.averagingInt(Integer::intValue)));
        Map<Integer, List<Integer>> clasificacion =  nums.stream().collect(Collectors.groupingBy(n -> n % 10));
        Map<Integer, Long> cantidades =  nums.stream().collect(Collectors.groupingBy(n -> n % 10, Collectors.counting()));

        System.out.println(clasificacion);
        System.out.println(cantidades);
        System.out.println(promedios);
    }
}

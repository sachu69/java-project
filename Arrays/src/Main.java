import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] number = new int[5];
        number[0] = 1;
        number[1] = 2;
        System.out.println(Arrays.toString(number));

        int[] numbers ={2,5,1,3,6};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        //multi-dimensional arrays
        int[][] multiNumbers = new int[2][3];
        multiNumbers[0][0] = 1;
        System.out.println(Arrays.toString(multiNumbers));
        // this creats error because multi arrays use diffrent method
        // example error :- [[I@5f184fc6, [I@3feba861]
        System.out.println(Arrays.deepToString(multiNumbers));

        int[][] multi ={{1,2,3},{3,2,1}};
        System.out.println(Arrays.deepToString(multi));
    }
}
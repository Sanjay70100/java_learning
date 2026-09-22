
import java.util.Arrays;

public class arraydemo {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5};
        for (int i = 0; i < arr.length; i++) {
            System.out.println("array:" + arr[i]);
        }
        System.out.println(Arrays.toString(arr));
        Arrays.fill(arr,2 ,4, 5);
        System.out.println(Arrays.toString(arr));
        arr[4]=2;
        System.out.println(Arrays.toString(arr));

    }
}

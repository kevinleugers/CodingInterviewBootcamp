import java.util.ArrayList;
import java.util.Arrays;

public class ArrayChunking_8 {
    public static void main(String[] args) {
        ArrayChunking_8 arrayChunking8 = new ArrayChunking_8();

        arrayChunking8.chunk(new int[]{1,2,3,4}, 2);
        arrayChunking8.chunk(new int[]{1,2,3,4, 5,6,7,8,9}, 4);
        arrayChunking8.chunk(new int[]{1,2,3,4, 5,6,7,8,9}, 2);
    }

    public void chunk(int[] arr, Integer size) {
        System.out.println(arr[0]);
        int count = 0;
        ArrayList<int[]> result = new ArrayList<>();
        while (count < arr.length) {
            if (count + (size-1) < arr.length) {
                result.add(Arrays.copyOfRange(arr, count, count+size));
            } else {
                result.add(Arrays.copyOfRange(arr, count, arr.length));
            }

            count += size;

        }
        for (int[] r :
                result) {
            System.out.println(Arrays.toString(r));
        }

    }
}

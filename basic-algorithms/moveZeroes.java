import java.util.Arrays;

public class moveZeroes {
    public static void moveZeroes(int[] nums) {
        int pos = 0;
        for (int n : nums) if (n != 0) nums[pos++] = n;
        while (pos < nums.length) nums[pos++] = 0;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
}
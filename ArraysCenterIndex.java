import java.util.Arrays;

/**
 * 查找数组的中心下标
 */
public class ArraysCenterIndex {
    public static void main(String[] args) {
        System.out.println(getCenterIndex(new int[] {1,2,3,4,5,6,6,7,2}));
    }

    public static int getCenterIndex(int[] nums) {
        if(nums.length < 1) {
            return -1;
        }
        int sum = Arrays.stream(nums).sum();
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            leftSum += nums[i];
            if (leftSum == sum) {
                return i;
            }
            sum -= nums[i];
        }
        return -1;
    }
}

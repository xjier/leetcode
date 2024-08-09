/**
 * 数组删除重复元素
 */
public class SortedArrayDuplicates {


    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{0,0,1,3,4,4,5,5}));
    }

    public static int removeDuplicates(int[] nums) {

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }



}

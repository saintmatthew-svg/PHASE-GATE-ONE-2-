public class TaskFour {
    public static void main(String[] args) {
        int[] nums = {5, 2, 8, 9, 3, 1};
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] < nums[j + 1]) 
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
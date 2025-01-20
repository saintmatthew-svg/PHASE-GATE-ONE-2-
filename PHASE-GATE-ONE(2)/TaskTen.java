public class TaskTen {
	public static void main(String[] args){
	int[] nums = {5,6,7,8,9,10};
	
	for(int count = 0; count < nums.length; count++){
		if(nums[count] % 2 != 0){
			System.out.print("1");
		}else if(nums[count] % 2 == 0){
			System.out.print("0");
		}
	}
	
	}
}
public class TaskThree{
public static void main(String[] args){
int[] input = {20,7,2,2,7};
	if(input[0] != input[1] && input[0] != input[2] && input[0] != input[3] && input[0] != input[4]){
		System.out.print(input[0]);
	}

	if(input[1] != input[0] && input[1] != input[2] && input[1] != input[3] && input[1] != input[4]){
		System.out.print(input[1]);
	}

	if(input[2] != input[0] && input[2] != input[1] && input[2] != input[3] && input[2] != input[4]){
		System.out.print(input[2]);
	}

	if(input[3] != input[0] && input[3] != input[1] && input[3] != input[2] && input[3] != input[4]){
		System.out.print(input[3]);
	}

	if(input[4] != input[0] && input[4] != input[1] && input[4] != input[2] && input[4] != input[3]){
		System.out.print(input[4]);
	}

}
}
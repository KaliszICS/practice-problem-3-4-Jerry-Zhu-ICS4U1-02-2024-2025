public class PracticeProblem {

	public static void main(String args[]) {
int n = 10;
		for(int i = 0; i < n; i++){
			System.out.println(recaman(10)[i]);
		}
	}

	public static int[] recaman(int n) {
		
		if(n <= 0){
			int[] arr = new int[0];
			return arr;
		}
int[] arr = new int[n];
for(int i = 0; i < n; i++){
	arr[i] = recamanHelper(i+1, arr);
}
return arr;
	}

	public static int recamanHelper(int n, int[] arr){
//base case
		if (n == 1){
return 1;
		}
boolean isPositive;
boolean hasValue = false;
int test = recamanHelper(n-1, arr) - n;
		if(test > 0){
isPositive = true;
		}
		else{
		isPositive = false;
		}
		for(int i = n-2; i >= 0; i--){
			if(arr[i] == test){
				hasValue = true;
			}
		}

		if(isPositive && !hasValue){
			return test;
		}
		else{
			return test + 2*n;
		}
		
	}

	
	}


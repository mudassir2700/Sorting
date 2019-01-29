import java.util.Arrays;
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr ={2,15,3,7,1,9,5};
		int temp;
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-1;j++){
				if(arr[j+1]<arr[j]){
					temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		

	}

}

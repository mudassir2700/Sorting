import java.util.Arrays;

public class Newsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr ={2,15,3,17,10,90,20};
		int min_index,temp;
		for(int i=0;i<arr.length-1;i++){
			min_index=i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<arr[min_index]){
					min_index=j;
				}
				temp=arr[i];
				arr[i]=arr[min_index];
				arr[min_index]=temp;
				
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}

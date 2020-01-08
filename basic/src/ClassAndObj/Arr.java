package ClassAndObj;

public class Arr {


			public static void main(String[] args) {
				
			
				int arr[]= new int[5];
			
				arr[0]=10;
				arr[1]=20;
				arr[2]=20;
				arr[3]=30;
				arr[4]=40;				
				System.out.println(arr[2]);
				System.out.println(arr.length);

				for(int i=0;i<arr.length;i++) {
					System.out.println(arr[i]);
				}
				
				System.out.println("--------->");
				
				int ar[]= {10,20,30,40};
				System.out.println(ar[3]);
				
				for(int a:ar) {
					System.out.println(a);
				}
			}
}

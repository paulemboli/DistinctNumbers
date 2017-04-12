package Review.java;

	import java.util.Scanner;

	public class DistinctNumbers {

		public static void main(String[] args) {
			int[] arr = new int[10];
			Scanner scnr = new Scanner(System.in);
			int c= 0;
			for(int i = 0;i< arr.length; i++){
				System.out.println("Enter a number: ");
				int num = scnr.nextInt();
				if(i==0){
					arr[c]=num;
				    c++;
				}
				else{
					boolean f= false;
					for(int j = 0;j< i; j++){
						if(arr[j]==num){
							f= true;
							break;
						}
					}
					if(f==false){
						arr[c]=num;
						c++;
					}
				}
				
			}


			System.out.print("Distinct Numbers = ");
			for(int i = 0;i< c; i++){
			System.out.print( arr[i]+",");	
			}
			
		}

	}
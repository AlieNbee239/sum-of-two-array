package sortingQuistion;

public class SumOfTwoArray {
	public static int[] AddTwoNum(int[] arr1, int[] arr2) {
		int n;
		if (arr1.length > arr2.length) {
			n = arr1.length;
		} else
			n = arr2.length;

		int NewArr[] = new int[n+1];
		int a1l=arr1.length;
		int a2l=arr2.length;
		int al=NewArr.length;
		int store=0; 
		int i=a1l-1;
		int j=a2l-1;
		int k=al-1;
		
		
		while (i>=0 && j>=0) {
			
				int	sum = arr1[i] + arr2[j ]+ store;
					int lastNum=sum%10;
					store=sum/10;
					sum=0;
					
						
						NewArr[k]=lastNum;
						i--;
						j--;
						k--;
					
			}
		while(i>=0) {
			int	sum = arr1[i] + store;
			int lastNum=sum%10;
			store=sum/10;
			sum=0;
			
				
				NewArr[k]=lastNum;
				i--;
				k--;
		}
		while(j>=0) {
			int	sum = arr2[j] + store;
			int lastNum=sum%10;
			store=sum/10;
			sum=0;
			
				
				NewArr[k]=lastNum;
				j--;
				k--;
		}
		NewArr[k]=store ;
		return NewArr;
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 9,5,3,4 };
		int b[] = {5,6,7 };
		int [] ans= AddTwoNum(a, b);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
	}

}

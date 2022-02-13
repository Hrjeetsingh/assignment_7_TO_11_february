import java.util.Arrays;

import java.util.ArrayList;

// 1 find maximum product of two integer?
class maximumproduct{
	
	static void maxProduct(int arr[], int n)
	{
		if (n < 2)
		{
			System.out.println("No pairs exists");
			return;
		}
		int a = arr[0], b = arr[1];
	
		for (int i = 0; i < n; i++)
		for (int j = i + 1; j < n; j++)
			if (arr[i] * arr[j] > a * b){
				a = arr[i];
				b = arr[j];
			}
			
		System.out.println("Max product pair is {" +a + ", " + b + "}");
	}
	
	public static void main(String[] args)
	{
		int arr[] = {1, 4,8,9,10,12,15,46};
		int n = arr.length;
		maxProduct(arr, n);
			
	}
}


// 2 WAP to check if an array is unique or not?
class unique{
    public static void main(String[] args) {
        int array[]={2,5,2,4,5,6,3,5,5,8};
        
        Arrays.sort(array);
        int len=array.length;     
        int[] distinctArray = new int[20];    
        int index = 0;   
        
        for(int i = 0; i < len; i++){    
             while (i < len - 1 && array[i] == array[i + 1])   
                i++;  
            distinctArray[index] = array[i];  
            index++;  
        }  
        for(int i = 0; i < index; i++)  
            System.out.print( distinctArray[i] + " ");   
    }         
}

// 3 WAP to check if they are permutation to each other?

class permutatioarray1{
    public static void main(String[] args) {
        int[]a={1,2,3,4,5,6};
        int[]b={1,7,8,9,41,5};
        int n=a.length;
        int m=b.length;
        if(permutationarray(a,b,n,m)==true){
        System.out.println("is permutation each other");
        }
        else{System.out.println("is not permutation each other");}

    }
    private static boolean permutationarray(int a[],int b[],int n,int m){
        int sum1=0,sum2=0,mul1=1,mul2=1;
        for(int i=0;i<n;i++){
            sum1=sum1+a[i];
            mul1=mul1*a[i];
        }
        for(int i=0;i<m;i++){
            sum2=sum2+a[i];
            mul2=mul2*a[i];
        }
        return ((sum1==sum2)&&(mul1==mul2));
    }
}


class containAll{
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(5,6,4,8,9));

        System.out.println(midile(arrayList));

    }
    private static ArrayList<Integer> midile(ArrayList<Integer> arrayList){
        ArrayList<Integer> list=arrayList;
        int index=0;
        int index1=list.size()-1;
        list.remove(index1);
        list.remove(index);
        
        return list;

    }
}
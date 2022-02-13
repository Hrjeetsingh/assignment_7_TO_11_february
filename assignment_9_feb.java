import java.util.Scanner;

// 1 make an array with user inputs of size 10. , then find sum of all elements in array 
class sumallelement{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int arr[]=new int[10];
        int sum_number=0;
        for(int k=0;k<arr.length;k++){
            System.out.print("enter element in array : ");
            int num=s.nextInt();
            arr[k]=num;
            sum_number=sum_number+arr[k];
        }
        System.out.println(sum_number);
        s.close();
    }
}

// 2 make an array with user inputs of size 10. , then find midle element in an array 

class Midleelement{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int arr1[]=new int[10];
        for(int k=0;k<arr1.length;k++){
            System.out.print("enter an element in array : ");
            int num=s.nextInt();
            arr1[k]=num;
        }
        int start=0;
        int midleindex=start+(arr1.length-1-start)/2;
        System.out.println("midle element is : "+arr1[midleindex]);
        
        s.close();
    }
}
// 3 make an array with user inputs of size 10. then print all positive numbers in an array
class positivenum{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int arr1[]=new int[10];
        
        for(int k=0;k<arr1.length;k++){
            System.out.print("enter an element in array : ");
            int num=s.nextInt();
            arr1[k]=num;
        }
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]>0){
                System.out.print(arr1[i]+" ");
            }
        }
        s.close();
    }
}

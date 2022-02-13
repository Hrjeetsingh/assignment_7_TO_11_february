import java.util.Scanner;

// 1 WAP to reverse an array 

class reversearray{
    public static void main(String[] args) {
        int arr1[]={23,45,69,78,15,2,45,65};
        int rev[]=new int[arr1.length];

        int len=arr1.length;  
        int j=len;
        for(int i=0;i<len;i++){
            rev[j-1]=arr1[i];
            j=j-1;
        }

        for(int k=0;k<len;k++){
            System.out.println(rev[k]);
        }
    }
}
//  2  Given a random set of numbers, Print them in sorted order
class sortingarray{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size=s.nextInt();
        int array[]=new int[size];
        System.out.println("Enter all elements : ");
        for(int i=0;i<size;i++){
            array[i]=s.nextInt();
        }
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(array[i]>array[j]){
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        for(int k=0;k<size;k++){
            System.out.print(array[k]+" ");

        }
        s.close();
    }
}

// 3 WAP to find first index at which element is present in array 


class firstelement{
    public static void main(String[] args) {
        int arr1[]=new int[10];
        arr1[2]=0;
        arr1[5]=5;
        arr1[3]=6;
        arr1[6]=6;
        arr1[9]=6;
        arr1[8]=6;

        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=0){
                System.out.println(i);
                break;
            }
        }  
    }
}

// 4 WAP to find last index at which element is present in array 

class lastelement{
    public static void main(String[] args) {
        int arr2[]=new int[10];
        arr2[0]=56;
        arr2[3]=5;
        arr2[5]=5;
        arr2[6]=6;
        arr2[7]=9;
        
        int len=arr2.length;
        for(int i=len-1;i>=0;i--){
            if(arr2[i]!=0){
                System.out.println(i);
                break;
            }
        }
        
    }
}

import java.util.Scanner;

//1  Reverse each word


class reverseEachword{
    public static void main(String[] args) {
        reverseEachWord("hrjeet singh java class student");
       
    }
    private static String reverseEachWord(String originalStr) {
        // split the sentence by words using split method
        String[] words = originalStr.split(" ");
        StringBuilder reverseStr = new StringBuilder();
        // Iterate over String array
        for (String word : words) {
         // reverse each word by calling reverseWithStringConcat method
         StringBuilder temp = new StringBuilder(word);
         reverseStr.append(temp.reverse());
         reverseStr.append(" ");
        }
        
        display(originalStr, reverseStr.toString());
        return reverseStr.toString();
       }
       private static final void display(String original , String reverse){
        System.out.println(original);
        System.out.println(reverse);
        
       }
}

//  2  Compress the string


class compresse1{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int len=str.length();
        StringBuilder str1=new StringBuilder();
        int count=1;
        for(int i=0;i<len;i++){
           
            if(i==len-1){
                str1.append(str.charAt(i));
                break;
            }
            if(str.charAt(i)==str.charAt(i+1)){
                count++;

            }
            else{
                str1.append(str.charAt(i));
                count=1;
            }
        }
        System.out.println(str1.toString());
        s.close();
    }
}
//  3  Highest Occuring character

class higestoccur1{
    public static void main(String[] args) {
        String str="AABSSBBBAA";
	    System.out.println(highestOccuring(str));

    }
	public static char highestOccuring(String str) {
		
        int max=0;
        char occ='a';
        int freq[]=new int[256];
        for(int i=0;i<str.length();i++)
        {
            freq[str.charAt(i)]++;
        }
        for(int j=0;j<freq.length;j++)
        {
           if(freq[j]>max)
           {
               max=freq[j];
               occ=(char)(j);
           }
        }
        
        return occ;
	}
}

// 4 if string are equal or not
class equalstr{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter string ");
        String s1=s.nextLine();
        System.out.println("enter string ");
        String s2=s.nextLine();
        if(s1.equals(s2)){
            System.out.println("equal string");
        }
        else{
            System.out.println("not equal string");
        }
        s.close();
    }
}

//  5  check permutation

class PermuteString1 {    
        
    public static String swapString(String a, int i, int j) {    
        char[] b =a.toCharArray();    
        char ch;    
        ch = b[i];    
        b[i] = b[j];    
        b[j] = ch;    
        return String.valueOf(b);    
    }    
        
    public static void main(String[] args)    
    {    
        String str = "ABC";    
        int len = str.length();    
        System.out.println("All the permutations of the string are: ");    
        generatePermutation(str, 0, len);    
    }    
        
        
    public static void generatePermutation(String str, int start, int end)    
    {    
            
        if (start == end-1)    
            System.out.println(str);    
        else    
        {    
            for (int i = start; i < end; i++)    
            {    
                   
                str = swapString(str,start,i);    
                   
                generatePermutation(str,start+1,end);    
                   
                str = swapString(str,start,i);    
            }    
        }    
    }   
}
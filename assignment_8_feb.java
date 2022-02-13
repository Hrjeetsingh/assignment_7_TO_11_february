import java.util.Scanner;   


// 1  Write a method which returns a string by removing special charaters( &,$,:,+,@) 
//  spaces from the string 
//  
//  Input: "Geekster-The%school:where+you@code:your-success$stories" 
//  Output : "eekster The school where you code your success stories 

class removspacial{
    public static void main(String[] args) {
        String str="Geekster-The%school:where+you@code:your-success$stories";
        System.out.print(remov(str));
    }  
    private static String remov(String s){              
        String str=s;
        str=str.replaceAll("[^a-zA-Z0-9]", " ");
        return str;
    }
}


// 2 WAP to prove that intern() method guarantees to return unique String from  a String pool   

class internmethod{
    public static void main(String[] args) {
        String s1="hrjeet";
        String s2=new String("hrjeet");
        boolean result=(s1==s2)? true:false;
        boolean result1=(s1==s2.intern())? true:false;
        System.out.println(result+" "+result1);
    }
}

// 3 -- Write a method which accepts 10 digits mobile number as an Integer parameter and return a string containing country code with mobile number. 
//  Input: 7890765456 
//  Output : "+91-7890765456"; 


class phone{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number 10 digits : ");
        String phone_number=s.nextLine();
        String num= phonenumberccode(phone_number);
        System.out.println(num);
        s.close();
    }
    private static String phonenumberccode(String n){

        String num1 = n;
        if(num1.length()==10){
            String num="+91-"+num1;
            return num;
        }
        else{
            String s="Not a valied number";
            return s;
        }
        
    }
}

/*  4  Write a method which accepts a String as a parameter and returns ratio of vowels to consonants in String format
Input: "We are Proud to be an India" 
Output : "11:10"  */


class ratioVC1{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        //System.out.print("Enter a paragraph as a string : ");
        //String para=s.nextLine();
        String para="We are Proud to be an India";
        
        System.out.println(ratiovc(para));
        s.close();
    }
    private static String ratiovc (String ns){
        String str=ns;
        
        int count=0;
        int temp=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a' ||ch=='A'|| ch=='e' || ch=='E' || ch=='i' || ch=='I'|| ch=='o' ||ch=='O' ||ch=='u'||ch=='U'){
                count=count+1;
                
            }
            else{temp++;}
            if(ch==' '){
                temp=temp-1;
                
            }
        }
        
        String str1=""+count+":"+temp;
        return str1;

    }

}
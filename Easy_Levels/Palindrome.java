package Easy_Levels;

public class Palindrome {
    public static int CheckPalindrome(int num){
        int Final_Val = num;
        int result = 0;

        if (num < 0) {
            return -1;
        }

        while (num !=0) {
            int mod = num % 10;
            result = result * 10 + mod;
            num = num/10 ;
        }
        if (Final_Val == result) {
            return 1 ;
        }else{
            return -1;
        }
    }

    public static void main(String[] args) {
        int num = 12321;
        int result = CheckPalindrome(num);

        if(result == 1){
            System.out.println("This is Palindrome");
        }else{
            System.out.println("This is Not Palindrome");
        }  
    }
    
}



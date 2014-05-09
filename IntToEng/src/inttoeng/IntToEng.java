package inttoeng;

import java.util.Scanner;

public class IntToEng {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        
        System.out.println(translateEng(input));
        
    }
    
    // 数値を英訳する変換するメソッド
    static String translateEng(int n) {
    	String Eng[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
    	String Eng1[] = {"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eightteen","nineteen"};
    	String Eng2[] = {"twenty","thirty","fourty","fifty","sixty","seventy","eightty","ninety"};
    	if(0<=n && n<10) return Eng[n]+"";
    	
    	else if(9<n && 20>n) return Eng1[n-10]+"";
    	else {
    		int i=0;
    		while(n<10){
    				n = n-10;
    					i++;
    		}
    			return Eng2[i-2]+"-"+Eng[n];
    			
    	}
    	
    }
}

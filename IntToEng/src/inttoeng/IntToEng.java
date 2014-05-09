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
    	String Eng[] = {"","one","two","three","four","five","six","seven","eight","nine"};
    	String Eng1[] = {"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eightteen","nineteen"};
    	String Eng2[] = {"twenty","thirty","fourty","fifty","sixty","seventy","eightty","ninety"};
    
    	int x=0,y=0,z=0;
    	if(n==0) return "zero";
    	if(0<n && n<10) {return Eng[n]+"";}
    	else if(9<n && 20>n) {return Eng1[n-10]+"";}
    	else {
    			while(1000<n && n<10000) {
    				n = n-1000;
    				x++;
    			}
    			while(99<n && n<1000){
    				n = n-100;
    					y++;
    			}
    			while(n>=10){
    			n = n-10;
    			z++;
    		}
    		if(x==0 && y==0) return Eng2[z-2]+"-"+Eng[n]+"";
    		else if(x==0 && z==0) return Eng[y]+" hundred "+Eng[n];
    		else if(y==0 && z==0) return Eng[x]+" thousand "+Eng[n];
    		else if(x==0) return Eng[y]+" hundred "+Eng2[z-2]+"-"+Eng[n];
    		else if(y==0) return Eng[x]+" thousand "+ Eng2[z-2]+"-"+Eng[n];
    		else if(z==0) return Eng[x]+" thousand "+ Eng[y]+" hundred "+Eng[n];
    		else  return Eng[x]+" thousand "+ Eng[y]+" hundred and "+Eng2[z-2]+"-"+Eng[n];
    		
    	}
    	
    }
}

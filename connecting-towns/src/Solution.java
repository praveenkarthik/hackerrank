import java.util.Scanner;

public class Solution {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	int t = in.nextInt();
    	for(int i=0; i<t; i++){
    		int n = in.nextInt();
    		int temp, a = 1;
    		for(int j=0; j<n-1; j++){
    			temp = in.nextInt();
    			a = a*temp;
    			if(a>1234567){
    				a = a%1234567;
    			}
    		}
    		System.out.println(a);
    	}
    }
}
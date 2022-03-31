package exam1;
import java.util.*;
class Solution {
	public static int costofGarden(int a,int b,int c,int d) {
		int area,side,t,ans=0;
		if(a<0||b<0||c<0||d<0) {
			System.out.println("Invalid");
		}
		else {
			area = b*c;
			side = a*a;
			t=side-area;
			ans=(t*d)/100;
		}
		return ans;
		    
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int s=sc.nextInt();
		int l=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.println(costofGarden(s,l,b,c));

	}

}

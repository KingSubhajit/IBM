import java.util.Arrays;
import java.util.Scanner;
class SSS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int c[] = new int [n];
        for (int i=0;i<n;i++)
        {
             c[i]=sc.nextInt();
        }
        Arrays.sort(c);
        int result=0;
        if (k>=n)
        {
        	int i;
			result+= c[i];
        	
        	System.out.println(result);
        	
        }
	}

}

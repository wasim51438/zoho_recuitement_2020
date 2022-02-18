import java.util.Scanner;

public class AssesementZoho {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String str = scan.next();
	char ch[] = str.toCharArray();
	int n = ch.length;
	int start = (n)/2;
	String newStr="";
	for(int i=1; i<=ch.length;i++){
		for(int j=1;j<=(n-i);j++){
			System.out.print(" ");
		}
			if(start>=n){
				start=0;
			}
			newStr+=ch[start];
			System.out.print(newStr);
			start++;
		System.out.println();
	}
}
}


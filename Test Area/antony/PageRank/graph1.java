package PageRank;
import java.util.*;
import static java.lang.System.out;


public class graph1{
	public static void foo(int n){
		double[] arr = new double[n];
		int rounds = 100;
		for(int i =0 ; i<n ; i++) arr[i] = 1;
		//for(double i : arr) out.println(i);
		for(int k = 0 ; k<rounds ; k++){
			arr[0] = 0.15 + 0.85 * (arr[2]/2);
			arr[1] = 0.15 + 0.85 * (arr[0]/2 + arr[2]/2);
			arr[2] = 0.15 + 0.85 * (arr[3]/1);
			arr[3] = 0.15 + 0.85 * (arr[0]/2 + arr[1]/1);
		}
		out.println("Number of rounds : " + rounds);
		for(int i =0 ; i<n ; i++) out.printf("Node %d = %.5f\n" , i+1 , arr[i]);
	}
	public static void main(String[] args){
		foo(4);
	}

}
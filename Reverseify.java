import java.util.*;
public class Reverseify {
	
	public static int[] reverse(int[] n) {
		Stack<Integer> stk = new Stack<Integer>();
		int[] reversed = new int[n.length];
		
		for(int m : n) {
			stk.push(m);
		}
		
		int i = 0;
		while(!stk.empty()){
			reversed[i] = stk.pop();
			i++;
		}
		return reversed;
	}
	
	public static String reverse(String s) {
		char[] c = new char[s.length()];
		Stack<Character> stk = new Stack<Character>();
		
		for(int i = 0; i < s.length(); i++) {
			stk.push(s.charAt(i));			
		}
		
		int i = 0;
		while(!stk.empty()) {
			c[i] += stk.pop();
			i++;
		}
		
		String reversed = new String(c);
		return reversed;
	}
	
	public static void printInt(int[] n) {
		for (int i : n) {
			System.out.print(i);
			System.out.print(" ");
		}
	}
	
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4};
		int[] revInt = reverse(array);
		
		printInt(array);
		System.out.println();
		printInt(revInt);
		
		System.out.println();
		
		String s = "hello world how are you today";
		System.out.println(s);
		System.out.println(reverse(s));
	}
}

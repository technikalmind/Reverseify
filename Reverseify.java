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
	
	public static int getMenu() {
		Scanner sc = new Scanner(System.in);
		String input = "";
		System.out.println("Please select an option: ");
		System.out.println(
			"1) Reverse an array of integers\n" +
			"2) Reverse a String\n" +
			"3) Exit\n");
		try {
				input = sc.next();
				if(input.equals("1")){
					return 1;
				} else if(input.equals("2")) {
					return 2;						
				} else if(input.equals("3")) {
					return 3;
				} else {
					throw new IllegalArgumentException("Illegal argument: " + input +". Please choose a correct value");
				}
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			return -1;
		}
	}
	
	public static void getOption(int opt) {
		Scanner sc = new Scanner(System.in);
		try {
			switch(opt) {
				case 1:
					LinkedList<Integer> list = new LinkedList<Integer>();
					System.out.println("Enter an integer (enter x to stop): ");
					
					while(true){
						String input = sc.next();
						if(input.equals("x")) {
							break;
						} else {
							int n = Integer.parseInt(input);
							list.add(n);
						}
					}
					
					int[] listArr = new int[list.size()];
					
					for(int i = 0; i <= list.size()-1; i++) {
						listArr[i] = list.get(i);
						System.out.print(list.get(i) + " ");
					}
					System.out.println();
					int[] reverse = reverse(listArr);
					printInt(reverse);
					System.out.println();
					break;
				case 2:
					System.out.println("Type a message to be reversed: ");
					String s = sc.nextLine();
					System.out.println(reverse(s));
					break;
				default:
					break;
			}
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		int menu;
		do {
			menu = getMenu();
			getOption(menu);
		} while(menu != 3);
		
		/*
		int[] array = {1, 2, 3, 4};
		int[] revInt = reverse(array);
		
		printInt(array);
		System.out.println();
		printInt(revInt);
		
		System.out.println();
		
		String s = "hello world how are you today";
		System.out.println(s);
		System.out.println(reverse(s));
		*/
	}
}

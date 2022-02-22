package asgmnt02;
import java.util.*;
public class AssignmentTwo {

	public static void main(String[] args) {		
		ProblemOne();
		ProblemTwo();
		ProblemThree();
		ProblemFour();
		ProblemFive();
		ProblemSix();
	}
	
	public static void ProblemOne() {
		System.out.println("Problem-1");
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter Number of Strings: ");
		int intVal1 = scn.nextInt();
		String[] arr = new String[intVal1];
		System.out.println("Enter " + intVal1 + " Strings: ");

		for (int i = 0; i < intVal1; i++) {
			String str1 = scn.next();
			arr[i] = str1;

		}

		Map<String, Integer> objMap = countStrings(arr);
		System.out.print("Input (S1): [");
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			count++;
			if (count != arr.length)
				System.out.print("\"" + arr[i] + "\",");
			else
				System.out.print("\"" + arr[i] + "\"");
		}
		System.out.println("]");
		System.out.println("Output: ");
		count = 0;
		for (Map.Entry<String, Integer> entry : objMap.entrySet()) {
			count++;
			if (count != objMap.size()) {
				System.out.print(entry.getKey() + "-" + entry.getValue() + ", ");
			} else {
				System.out.print(entry.getKey() + "-" + entry.getValue());
			}
		}
	}

	public static Map<String, Integer> countStrings(String[] input) {
		Map<String, Integer> objectMap1 = new HashMap<>();

		for (int i = 0; i < input.length; i++) {
			objectMap1.put(input[i], objectMap1.getOrDefault(input[i], 0) + 1);
		}
		return objectMap1;

	}	
	
	public static void ProblemTwo() {
		Scanner scn = new Scanner(System.in);

		System.out.println("\n Problem-2");
		System.out.print("Enter Number of Strings: ");
		int n = scn.nextInt();
		String[] str2 = new String[n];
		System.out.println("Enter " + n + " Strings: ");

		for (int i = 0; i < n; i++) {
			String s = scn.next();
			str2[i] = s;

		}

		Map<String, String> objectMap = concatStrings(str2);
		System.out.print("Input (S1): [");
		int count = 0;
		for (int i = 0; i < str2.length; i++) {
			count++;
			if (count != str2.length)
				System.out.print("\"" + str2[i] + "\",");
			else
				System.out.print("\"" + str2[i] + "\"");
		}
		System.out.println("]");
		System.out.println("Output (M1): {");
		count = 0;
		for (Map.Entry<String, String> entry : objectMap.entrySet()) {
			count++;
			if (count != objectMap.size())
				System.out.print("\"" + entry.getKey() + "\"" + ":" + "\"" + entry.getValue() + "\"" + ",");
			else
				System.out.print("\"" + entry.getKey() + "\"" + ":" + "\"" + entry.getValue() + "\"");

		}
		System.out.print("}");
	}

	public static Map<String, String> concatStrings(String[] input) {
		Map<String, String> map = new HashMap<>();
		for (int i = 0; i < input.length; i++) {
			String s = input[i];
			map.put(s.charAt(0) + "", map.getOrDefault(s.charAt(0) + "", "") + s);
		}

		return map;
	}

	public static void ProblemThree() {
		Scanner scn= new Scanner(System.in);
        System.out.println("\nProblem-3");
		System.out.print("Enter Number of Elements: ");
		int n = scn.nextInt();
		int[] arrayVal = new int[n];
		System.out.println("Enter " + n + " Elements: ");

		for (int i = 0; i < n; i++) {
			int ele = scn.nextInt();
			arrayVal[i] = ele;

		}

		Set<Integer> res = printSequentialSet(arrayVal);
		System.out.println("Input (A1): " + Arrays.toString(arrayVal));
		System.out.println("Output (S): " + res);
	}

	public static Set<Integer> printSequentialSet(int[] input) {
		Set<Integer> objectSet = new LinkedHashSet<>();
		for (int i = 0; i < input.length; i++) {
			int ele = input[i];
			while (objectSet.contains(ele)) {
				ele++;
			}
			objectSet.add(ele);
		}
		return objectSet;
	}

public static void ProblemFour() {
	Scanner scn = new Scanner(System.in);

	System.out.println("\nProblem-4");
	System.out.print("Enter number of Strings: ");
	int n = scn.nextInt();
	ArrayList<String> arrayinput = new ArrayList<>();
	System.out.println("Enter " + n + " Elements: ");

	for (int i = 0; i < n; i++) {
		String ele = scn.next();
		arrayinput.add(ele);

	}

	ArrayList<String> arraylistobj = removeDuplicateChars(arrayinput);
	System.out.print("Input (A1): [");
	int count = 0;
	for (int i = 0; i < arrayinput.size(); i++) {
		count++;
		if (count != arrayinput.size())
			System.out.print("\"" + arrayinput.get(i) + "\",");
		else
			System.out.print("\"" + arrayinput.get(i) + "\"");
	}
	System.out.println("]");

	System.out.println("Output (A2): [");
	count = 0;
	for (int i = 0; i < arraylistobj.size(); i++) {
		count++;
		if (count != arraylistobj.size())
			System.out.print("\"" + arraylistobj.get(i) + "\",");
		else
			System.out.print("\"" + arraylistobj.get(i) + "\"");
	}
	System.out.println("]");
	// System.out.println(res);

}

public static ArrayList<String> removeDuplicateChars(ArrayList<String> input) {
	ArrayList<String> arraylistobj = new ArrayList<>();
	Set<Character> objset = new HashSet<>();

	for (int i = 0; i < input.size(); i++) {
		String s = input.get(i);
		StringBuilder sb = new StringBuilder();
		for (char c : s.toCharArray()) {
			if (!objset.contains(c)) {
				sb.append(c);
				objset.add(c);
			}
		}
		arraylistobj.add(sb.toString());

		objset.clear();
	}
	return arraylistobj;
}


public static void ProblemFive() {
	Scanner scn = new Scanner(System.in);
	System.out.println("\nProblem-5");
	System.out.print("Enter Number of Strings: ");
	int n = scn.nextInt();
	ArrayList<String> arraylistobj = new ArrayList<>();
	System.out.println("Enter " + n + " elements: ");

	for (int i = 0; i < n; i++) {
		String ele = scn.next();
		arraylistobj.add(ele);

	}

	Map<String, String> res = firstLastCharMap(arraylistobj);
	System.out.print("Input: [");
	int count = 0;
	for (int i = 0; i < arraylistobj.size(); i++) {
		count++;
		if (count != arraylistobj.size())
			System.out.print("\"" + arraylistobj.get(i) + "\",");
		else
			System.out.print("\"" + arraylistobj.get(i) + "\"");
	}
	System.out.println("]");

	System.out.println("Output: {");
	count = 0;
	for (Map.Entry<String, String> entry : res.entrySet()) {
		count++;
		if (count != res.size())
			System.out.print("\"" + entry.getKey() + "\"" + ":" + "\"" + entry.getValue() + "\"" + ",");
		else
			System.out.print("\"" + entry.getKey() + "\"" + ":" + "\"" + entry.getValue() + "\"");

	}
	System.out.print("}");
}

public static Map<String, String> firstLastCharMap(ArrayList<String> input) {
	Map<String, String> objmap = new HashMap<>();
	for (int i = 0; i < input.size(); i++) {
		char char1 = input.get(i).charAt(0);
		char char2 = input.get(i).charAt(input.get(i).length() - 1);
		objmap.put(char1 + "", char2 + "");
	}
	return objmap;

}

public static void ProblemSix() {
	Scanner scn = new Scanner(System.in);

	System.out.println("\nProblem-6");
	System.out.print("Enter Number of Strings: ");
	int n = scn.nextInt();
	ArrayList<String> input = new ArrayList<>();
	System.out.println("Enter " + n + " Elements: ");

	for (int i = 0; i < n; i++) {
		String ele = scn.next();
		input.add(ele);

	}

	Map<String, Boolean> mapobj = setBooleanMap(input);
	System.out.print("Input (S1): [");
	int count = 0;
	for (int i = 0; i < input.size(); i++) {
		count++;
		if (count != input.size())
			System.out.print("\"" + input.get(i) + "\",");
		else
			System.out.print("\"" + input.get(i) + "\"");
	}
	System.out.println("]");

	System.out.println("Output (M1): {");
	count = 0;
	for (Map.Entry<String, Boolean> entry : mapobj.entrySet()) {
		count++;
		if (count != mapobj.size())
			System.out.print("\"" + entry.getKey() + "\"" + ":" + entry.getValue() + ", ");
		else
			System.out.print("\"" + entry.getKey() + "\"" + ":" + entry.getValue());

	}
	System.out.print("}");
}

public static Map<String, Boolean> setBooleanMap(ArrayList<String> input) {

	Map<String, Boolean> objmap = new HashMap<>();
	for (int i = 0; i < input.size(); i++) {
		if (objmap.containsKey(input.get(i))) {
			objmap.put(input.get(i), true);
		} else {
			objmap.put(input.get(i), false);
		}
	}
	return objmap;
}}


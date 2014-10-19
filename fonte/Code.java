import java.util.Stack;

public class Code{
	private String code;
	private int[] matchingBrackets;
	
	Code(String c){
		code = c;
		
		matchingBrackets = new int[code.length()];
		Stack<Integer> matchingBracketsStack = new Stack<Integer>();
		int i;
		for(i = 0; i < code.length(); i++){
			if(code.charAt(i) == '['){
				matchingBracketsStack.push(new Integer(i));
			}
			if(code.charAt(i) == ']'){
				matchingBrackets[i] = ((Integer)matchingBracketsStack.peek()).intValue();
				matchingBrackets[((Integer)matchingBracketsStack.pop()).intValue()] = i;
			}
		}
	}
	
	public String getCode(){
		return code;
	}
	
	public int getMatchingBracket(int m){
		return matchingBrackets[m];
	}
	
	public int getLength(){
		return code.length();
	}
}

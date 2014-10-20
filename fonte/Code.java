import java.util.Stack;

public class Code{
	private String code;
	private int[] matchingBrackets;
	private int instructionPointer;
	
	Code(String c){
		code = c;
		
		instructionPointer = 0;
		
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
	
	public int getInstructionPointer(){
		return instructionPointer;
	}
	
	public void setInstructionPointer(int i){
		instructionPointer = i;
	}
	
	public int getMatchingBracket(int m){
		return matchingBrackets[m];
	}
}

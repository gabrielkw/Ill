import java.util.Stack;
import java.io.IOException;

class IllC{
	public static void main(String args[]){

		String code = ",+.";
		System.out.println("Code length = " + code.length());
		
		int numberOfCells = 30000;
		int indicator = 0;
		int i;

		System.out.println("Initializing cells");
		int[] cells = new int[numberOfCells];
		for(i = 0; i < numberOfCells; i++){
			cells[i] = 0;
		}
		System.out.println("Cells initialized");

		System.out.println("Matching brackets");
		int[] matchingBrackets = new int[numberOfCells];
		Stack matchingBracketsStack = new Stack();
		for(i = 0; i < code.length(); i++){
			if(code.charAt(i) == '['){
				matchingBracketsStack.push(new Integer(i));
			}
			if(code.charAt(i) == ']'){
				matchingBrackets[i] = ((Integer)matchingBracketsStack.peek()).intValue();
				matchingBrackets[((Integer)matchingBracketsStack.pop()).intValue()] = i;
			}
		}
		System.out.println("Brackets matched");

		System.out.println("Starting interpretation");
		for(i = 0; i < code.length(); i++){
			switch(code.charAt(i)){
				case '+':
					cells[indicator]++;
					break;
				case '-':
					cells[indicator]--;
					break;
				case '>':
					indicator++;
					break;
				case '<':
					indicator--;
					break;
				case '[':
					if(cells[indicator] == 0){
						i = matchingBrackets[i];
					}
					break;
				case ']':
					if(cells[indicator] != 0){
						i = matchingBrackets[i];
					}
					break;
				case '.':
					System.out.println((char)cells[indicator]);
					break;
				case ',':
					try{
						cells[indicator] = (int) System.in.read();
					}
					catch (IOException e){
						System.out.println("Erro na leitura de entrada do usuário");
					}
			}
		}
		System.out.println("Interpretation finished");
	}
}
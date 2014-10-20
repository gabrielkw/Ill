class IllC{
	public static void main(String args[]){
		String codeToInterpret = "";
		
		Code codeToEval = new Code(codeToInterpret);
		
		IllArray cellArray = new IllArray(codeToEval, 30000);
		
		IllInstruction.execute(codeToEval, cellArray);
	}
}

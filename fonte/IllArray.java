public class IllArray{
	private int numberOfCells;
	private int indicator;
	private int[] cells;

	IllArray(Code c, int size){
		numberOfCells = size;
		indicator = 0;
		cells = new int[numberOfCells];
		int i;
		for(i = 0; i < numberOfCells; i++){
			cells[i] = 0;
		}
	}
	
	public int getIndicator(){
		return indicator;
	}
	
	public void setIndicator(int i){
		indicator = i;
	}
	
	public int getCellValue(int c){
		return cells[c];
	}
	
	public void setCellValue(int cell, int value){
		cells[cell] = value;
	}
}

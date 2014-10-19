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
}

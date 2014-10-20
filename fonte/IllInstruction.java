import java.io.IOException;

public class IllInstruction {
	static void execute(Code code, IllArray arr){
		int i, indicator, cellValue;
		for(i = 0; i < code.getCode().length(); i++){
			indicator = arr.getIndicator();
			cellValue = arr.getCellValue(indicator);
			switch(code.getCode().charAt(i)){
				case '+':
					arr.setCellValue(indicator,cellValue+1);
					break;
				case '-':
					arr.setCellValue(indicator,cellValue-1);
					break;
				case '>':
					arr.setIndicator(arr.getIndicator()+1);
					break;
				case '<':
					arr.setIndicator(arr.getIndicator()-1);
					break;
				case '[':
					if(cellValue == 0){
						i = code.getMatchingBracket(i);
					}
					break;
				case ']':
					if(cellValue != 0){
						i = code.getMatchingBracket(i);
					}
					break;
				case '.':
					System.out.print((char)cellValue);
					break;
				case ',':
					try{
						arr.setCellValue(indicator,(int)System.in.read());
					}
					catch (IOException e){
						System.out.println("Erro na leitura de entrada do usuario");
					}
					break;
			}
		}
	}
}

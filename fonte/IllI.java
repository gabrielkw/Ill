/**
 * Interpretador de Ill
 *
 * Ill é uma linguagem de programação exotérica
 * Mais informações em https://github.com/muthdra/Ill
 * 
 * Por Gabriel Kwiecinski Antunes <gabrielkwi@hotmail.com>
 */

import java.io.File;
import java.io.FileInputStream;

class IllI{	
	public static void main(String args[]) throws Exception{	
		String codeToInterpret;
        try{
	        File file = new File(args[0]);
	        FileInputStream fis = new FileInputStream(file);
	        byte[] data = new byte[(int)file.length()];
	        fis.read(data);
	        fis.close();
	        codeToInterpret = new String(data, "UTF-8");
	        System.out.println(Ill2bf.transform(codeToInterpret));
			Code codeToEval = new Code(Ill2bf.transform(codeToInterpret));
			IllArray cellArray = new IllArray(codeToEval, 30000);
			IllInstruction.execute(codeToEval, cellArray);
        }
        catch (Exception e){
        	System.out.println("\nErro");
        }
	}
}

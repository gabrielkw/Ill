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
import java.util.Scanner;

class IllC{	
	public static void main(String args[]) throws Exception{	
		String codeToInterpret;
        try{
	        File file = new File(args[0]);
	        FileInputStream fis = new FileInputStream(file);
	        byte[] data = new byte[(int)file.length()];
	        fis.read(data);
	        fis.close();
	        codeToInterpret = new String(data, "UTF-8");
			Code codeToEval = new Code(codeToInterpret);
			IllArray cellArray = new IllArray(codeToEval, 30000);
			IllInstruction.execute(codeToEval, cellArray);
        }
        catch (Exception e){
        	System.out.println("Erro na leitura de arquivo");
        }
	}
}

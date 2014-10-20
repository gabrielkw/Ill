public class Ill2bf {
	public static String transform(String str){
		String bf = new String();
		String command = new String();
		int i;
		for(i = 0; i < str.length(); i++){
			if(str.charAt(i) == 'I' || str.charAt(i) == 'l'){
				command += str.charAt(i);
			}
			if(command.length() == 3){
				switch(command){
					case "IIl":
						bf += '+';
						break;
					case "lII":
						bf += '-';
						break;
					case "llI":
						bf += '>';
						break;
					case "Ill":
						bf += '<';
						break;
					case "lll":
						bf += ',';
						break;
					case "III":
						bf += '.';
						break;
					case "IlI":
						bf += '[';
						break;
					case "lIl":
						bf += ']';
						break;
				}
				command = "";
			}
		}		
		return bf;
	}
}

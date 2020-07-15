package epam.TDD_Demo;

public class RemoveChars {

	public String remove_A(String string) {
		
		String lastsubstring= string.substring(2,string.length()) ;
		char firstchar = string.charAt(0);
		char secondchar = string.charAt(1);
		String result = lastsubstring;
		
		if(firstchar != 'A' && secondchar == 'A') {
			result = firstchar+lastsubstring;
		}
		
		else if(firstchar == 'A' && secondchar != 'A') {
			result = secondchar+lastsubstring;
		}
		
		else if (firstchar == 'A' && secondchar == 'A') {
			result = lastsubstring;
		}
		
		else {
			result = string;
		}
		//print(result)
		return result;
	}

}

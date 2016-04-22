package iut.tdd;

public class RomanNumerals {
	public String convertToRoman(String arabe) {
		String rom = "";
		int I=0;
		int nbr = Integer.parseInt(arabe); 
		if (nbr <4){
			I= nbr;	
			for(int i=0; i<I; i++){
				rom+="I";
			}
		}else if (nbr%5==4){
			rom+= "I";
			if(((nbr/5)<1)){
				rom+="V";
			}else{
				rom+="X";
			}
		}
		
		return rom;
	}

	public String convertFromRoman(String roman) {
		
		return "1";
	}

}

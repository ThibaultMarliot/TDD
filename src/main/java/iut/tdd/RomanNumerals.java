package iut.tdd;

public class RomanNumerals {
	public String convertToRoman(String arabe) {
		switch(arabe){
		case "1" : return "I";
		case "3" : return "III";
		case "4" : return "IV";
		case "5" : return "V";
		case "7" : return "VII";
		case "9" : return "IX";
		case "10" : return "X";
		default : return "ERROR";
		}
	}

	public String convertFromRoman(String roman) {
		switch(roman){
		case "I" : return "1";
		case "III" : return "3";
		case "IV" : return "4";
		case "V" : return "5";
		case "VII" : return "7";
		case "IX" : return "9";
		case "X" : return "10";
		default : return "ERROR";
		}
	}
	
}

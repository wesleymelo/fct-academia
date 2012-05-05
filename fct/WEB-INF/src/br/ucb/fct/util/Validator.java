package br.ucb.fct.util;

public class Validator {
	public static boolean isStringValid(String value){
		return value != null && !value.trim().isEmpty();
	}
	
	
}

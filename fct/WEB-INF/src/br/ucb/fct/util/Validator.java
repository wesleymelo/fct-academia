package br.ucb.fct.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
	
	public static boolean isDDDValido(String ddd){
        String invalidos[] = {"01", "02", "03", "04", "05", "06", "07",
                              "08", "09", "10", "20", "23", "25", "26",
                              "29", "30", "36", "39", "40", "50", "52",
                              "56", "57", "58", "59", "60", "69", "70",
                              "72", "76", "78", "80", "90"};
        for(int i = 0; i < invalidos.length; i++){
            if(ddd.equals(invalidos[i]))
                return false;
        }
        return true;

    }
	
	
	public static boolean isEmailValid(String email,int min){
        final String EMAIL_REGEX = "^[\\w-]+(\\.[\\w-]+)*@([\\w-]+\\.)+[a-zA-Z]{2,7}$";
        
        if(!isStringValid(email,min))
        	return false;
        
        Pattern p = Pattern.compile(EMAIL_REGEX);
       
        Matcher m = p.matcher(email.trim());

        if(!m.matches())
            return false;
        return true;
    }
	
	public static boolean isCPFValid(String cpf){
		String cpfInval[] = {"11111111111", "22222222222", "33333333333", "44444444444", "55555555555", 
							 "66666666666",	"77777777777", "88888888888", "99999999999"}; 		
		int cont,aux2,soma=0;
		int []dig = new int [11];
		int [] digVeri = new int[2];
		
		
		
		if(cpf.length() != 11)
			return false;

		for(cont=0;cont<9;cont++){
			if(cpfInval[cont].equals(cpf))
				return false;
		} 
		
  
		for(cont=0;cont<cpf.length();cont++)
			dig[cont] = Character.getNumericValue(cpf.charAt(cont));
		
		// obtem o primeiro digito verificador
		aux2=10;
		for(cont=0;cont<9;cont++,aux2--){
			soma+= dig[cont] * aux2;
		}
		digVeri[0]=soma % 11;
		digVeri[0]= digVeri[0] < 2 ? 0 : 11-digVeri[0];
		
		soma=0;
		aux2=11;
		
		for(cont=0;cont<10;cont++,aux2--){
			if(cont==9)
				soma+= digVeri[0] * aux2;
			else
				soma+= dig[cont] * aux2;
		}
		
		digVeri[1]=soma % 11;
		digVeri[1]= digVeri[1]<2 ? 0 : 11-digVeri[1];
		if(digVeri[0]!=dig[9] || digVeri[1]!=dig[10])
			return false;
		return true;
	}
	
	
	public static boolean isStringValid(String value, int qtde){
		return (value != null && !(value.trim().isEmpty()) && value.length() <= qtde);
	}
	
	public static boolean verificaTamanho(String value, int min){
		if(!value.isEmpty() && value.length() == 10){
			return true;
		}
		return false;
	}
	
	public static boolean verificaDouble(String value, double min, double max ){
		return (isDoubleValid(value) && (Double.parseDouble(value) >= min && Double.parseDouble(value)<=max));
	}
	
	public static boolean verificaInteger(String value, int min, int max ){
		return verificaDouble(value, min, max);
	}
	
	
	public static boolean isDoubleValid(String value){
		if(!isStringValid(value, 100))
			return false;
		
		try {
			Double.parseDouble(value);
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

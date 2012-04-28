package br.ucb.fct.util;
import java.text.*; 
import java.util.*; 

public class Util {
	
	public static Date formatDate(String data){
		DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");  
		Date date = null;
		try {
			date = formatador.parse(data);
		} catch (ParseException e) {
			e.printStackTrace();
		}  
		return date;
	}
	
	public static Date formatDateOut(String data){
		DateFormat formatador = new SimpleDateFormat("yyyy-MM-dd");  
		Date date = null;
		try {
			date = formatador.parse(data);
		} catch (ParseException e) {
			e.printStackTrace();
		}  
		return date;
	}
	

}

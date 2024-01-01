package tr.edu.medipol.yazilimort;

import org.apache.commons.lang3.StringUtils;

public class Main {

	public static void main(String[] args) {
	
		String hatalimetin ="M e d i p o    l";
		System.out.println("Hatalı Metin: "+hatalimetin);
		String duzgunimetin=StringUtils.deleteWhitespace(hatalimetin); 	
		System.out.println("Duzgun Metin: "+duzgunimetin);
		
	}

	
	
	
}

package com.mayoral.icu;

import java.util.Enumeration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ibm.icu.text.Transliterator;

@SpringBootApplication
public class IcuApplication {

	public static void main(String[] args) {
		SpringApplication.run(IcuApplication.class, args);
		
		for(int i = 0; i < args.length; i++) {
			System.out.println(args[i] + ": " + conversorUrl(args[i]));
		}
		
		// descomentar para mostrar los ides
		// avaliablesIds();
		
	}

	public static String conversorUrl(String texto) {
		
		String id = "Latin-Cyrillic";
		// id = "Any-Hangul";
		// id = "Any-Latn/ALALOC";
		id = "Any-Latin";
		
		Transliterator trl = Transliterator.getInstance(id);
		
		return trl.transform(texto);
	}
	
	public static void avaliablesIds() {
		Enumeration<String> availableIDs = Transliterator.getAvailableIDs();
		while (availableIDs.hasMoreElements()) {
			System.out.println(availableIDs.nextElement());
		} 
	}
	
}

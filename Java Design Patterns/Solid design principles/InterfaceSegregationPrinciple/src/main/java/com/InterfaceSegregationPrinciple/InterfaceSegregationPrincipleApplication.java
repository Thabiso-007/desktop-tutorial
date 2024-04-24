package com.InterfaceSegregationPrinciple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InterfaceSegregationPrincipleApplication {

	public static void main(String[] args) {

		SpringApplication.run(InterfaceSegregationPrincipleApplication.class, args);

		/**
		 * Clients should not be forced to depend on interfaces they do not use.
		 *
		 * In simpler terms, ISP suggests that interfaces should be fine-grained and
		 * focused on specific client requirements. Clients (classes or modules) should
		 * not be forced to implement methods they don't need. Instead, interfaces should
		 * be tailored to the specific needs of each client, promoting cohesion and reducing
		 * coupling.
		 */

		// Instantiate and use a SimpleDocument
		Document simpleDocument = new SimpleDocument();
		simpleDocument.open();
		simpleDocument.save();
		simpleDocument.close();

		// Instantiate and use a PrintableDocument
		Document printableDocument = new PrintableDocument();
		printableDocument.open();
		printableDocument.save();
		printableDocument.close();

		// Print a PrintableDocument
		if (printableDocument instanceof Print) {
			((Print) printableDocument).print();
		}
	}

}

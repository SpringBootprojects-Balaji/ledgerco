package com.teller;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;


import com.teller.Models.Loan;


public class EmiTrust {



	public static void main(String[] args) throws FileNotFoundException {
		String filePath = args[0];
		Processor process = new Processor();
		process.calculateEmi(filePath);

	}

}

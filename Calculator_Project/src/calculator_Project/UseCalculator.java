package calculator_Project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author VISHNU VARDHAN
 *
 */
public class UseCalculator {

	public static void main(String[] args) throws IOException {

		BufferedReader o = new BufferedReader(new InputStreamReader(System.in));

		boolean next;

		System.out.println("There are Two Types of Calculators");
		System.out.println("Basic Caculator - B");
		System.out.println("ScientificCalculator - S");
		String option;
		option = o.readLine();

		if (option.length() == 1) {
			if (option.equals("B") || option.equals("b")) {

				Calculator c = new Calculator();
				c.Calc();
			} else if (option.equals("S") || option.equals("s")) {

				ScientificCalculator sc = new ScientificCalculator();
				sc.Calc();
			} else {
				System.out.println("Please enter the options among 'B' or 'S': ");
			}
		} else {
			System.out.println("Please enter the options among 'B' or 'S': ");
		}

	}

}

package calculator_Project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author VISHNU VARDHAN
 *
 */
class Calculator {
	public void Calc() throws java.io.IOException {
		boolean next;

		do {
			int iFirstNumber = 0;
			int iSecondNumber = 0;

			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Please enter First Number: ");
			iFirstNumber = Integer.parseInt(buffer.readLine());

			System.out.println("Please enter the Operation among :");
			System.out.println("Add : +\n Minus : -\n Product : *\n Divide : / \n");

			String option = buffer.readLine();
			System.out.println("Please enter Second Number: ");

			iSecondNumber = Integer.parseInt(buffer.readLine());

			if (option.length() == 1) {
				// Creates Calculate Class Instance
				Calculate c = new Calculate(iFirstNumber, option.charAt(0), iSecondNumber);

				// Calls the class methods
				c.doCalculation();
				c.getResult();
			} else {
				System.out.println("you have choosen wrong option. Please choose the correct operation to perform");
			}

			System.out.println("Would you like to calculate again (y/n)?");

			char response = (char) buffer.read();
			if ((response == 'y') || (response == 'Y')) {
				next = false;
			} else {
				next = true;
			}

		} while (!next);

	}

}

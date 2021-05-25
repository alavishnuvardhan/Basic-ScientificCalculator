package calculator_Project;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author VISHNU VARDHAN
 *
 */
class ScientificCalculator extends Calculate {
	char Operator;
	double dblNumber;

	ScientificCalculator() {
	}

	ScientificCalculator(double dblNumber, char Operator) {
		// Calls Super Class Constructor
		super(dblNumber, Operator);

		this.Operator = Operator;
		this.dblNumber = dblNumber;
	}

	public void Calc() throws java.io.IOException {
		boolean next;

		do {
			Double d = (double) 0;

			BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

			// Gets User Input
			System.out.println("Please choosethe option to Calculate ");
			System.out.println("Sine(sine) - s, Cosine(cos) - c, Tangent(tan) - t, Log(log) - l:");
			String option = r.readLine();

			System.out.println("Please enter the operation to calculate ");
			d = Double.valueOf(r.readLine());

			if (option.length() == 1) {
				// Creates Class Instance
				ScientificCalculator sc = new ScientificCalculator(d, option.charAt(0));

				// this will calls Super Class Methods
				sc.doCalculation();
				sc.getResult();
			} else {
				System.out.println("Operation u have entered is wrong please enter correct operation");
			}
			System.out.println("Would you like to calculate again (y/n)?");
			char aa = (char) r.read();
			if ((aa == 'y') || (aa == 'Y')) {
				next = false;
			} else {
				next = true;
			}

		} while (!next);
	}
}

package calculator_Project;

/**
 * @author VISHNU VARDHAN
 *
 */
public class Calculate implements iCalc {
	public char cOperator;
	public int iFirstNum, iSecondNum;
	public double dblNumber;
	public Double dblResult;
	public int iResult = 0;
	public boolean typeDouble = false;
	public boolean typeInt = false;

	Calculate() {

	}

	Calculate(double dblNumber2, char cOperator) {
		this.dblNumber =  dblNumber2;
		this.cOperator = cOperator;
		typeDouble = true;

	}

	Calculate(int iFirstNum, char cOperator, int iSecondNum) {
		this.iFirstNum = iFirstNum;
		this.cOperator = cOperator;
		this.iSecondNum = iSecondNum;
		typeInt = true;

	}

	@Override
	public void doCalculation() {
		iResult = 0;
		dblResult = 0.0;

		switch (cOperator) {
		case '+':
			checkInt();
			iResult = iFirstNum + iSecondNum;
			break;

		case '-':
			checkInt();
			iResult = iFirstNum - iSecondNum;
			break;

		case '*':
			checkInt();
			iResult = iFirstNum * iSecondNum;
			break;

		case '/':
			checkInt();
			if (!checkSecondNum()) {
				iResult = iFirstNum / iSecondNum;
				break;
			}

		case 'S':
		case 's':
			checkDouble();
			dblResult = Math.sin(dblNumber);
			break;

		case 'C':
		case 'c':
			checkDouble();
			dblResult = Math.cos(dblNumber);
			break;

		case 'T':
		case 't':
			checkDouble();
			dblResult = Math.tan(dblNumber);
			break;

		case 'L':
		case 'l':
			checkDouble();
			dblResult = Math.log(dblNumber);
			break;

		default:
			iResult = 0;
			dblResult = 0.0;
			System.out.println("Operation u have entered is wrong please enter correct operation");
			break;
		}

	}

	@Override
	public void getResult() {
		if (typeInt) {
			System.out.println("The result is: " + iResult);
		} else if (typeDouble) {
			System.out.println("The result is: " + dblResult);
		}

	}

	boolean checkSecondNum() {
		if (iSecondNum == 0) {
			System.out.println("Zero Not allowed");
			return true;
		} else {
			return false;
		}
	}

	void checkInt() {
		if (!typeInt) {
			iResult = 0;
			System.out.println("Operation u have entered is wrong please enter correct operation");
		}

	}

	void checkDouble() {
		if (!typeDouble) {
			dblResult = 0.0;
			System.out.println("Operation u have entered is wrong please enter correct operation");

		}

	}

}

package sCalculator;

public class StringCalculator {

	public String addTwoNums(String number1, String number2) {
		// TODO Auto-generated method stub
		int num1 = 0;
		int num2 = 0;
		int sum = 0;
		
		num1=castLongNumToInt(number1);
		num2=castLongNumToInt(number2);

		sum = num1 + num2;
		
		return Integer.toString(sum);
	}
	
	public int castLongNumToInt(String strNum) {
		int resNum = 0;
		int inputNum;
		inputNum=validateAndConvertStringToInt(strNum);
		if ( inputNum > (long)Integer.MAX_VALUE || inputNum<0) {
		    resNum=0;
		}
		else {
			resNum = (int)inputNum;
		}
		return resNum;
	}
	
	public int validateAndConvertStringToInt(String strNum)
	{
		if (strNum != "" && strNum != null) {
			//return Integer.parseInt(strNum);
			return Double.valueOf(strNum).intValue();
		}
		else
		{
			return 0;
		}	
	}

	public String multiplyTwoNums(String number1, String number2) {
		// TODO Auto-generated method stub
		int num1 = 0;
		int num2 = 0;
		int product = 0;
		
		num1=castLongNumToInt(number1);
		num2=castLongNumToInt(number2);

		product = num1 * num2;
		
		return Integer.toString(product);
	}
}

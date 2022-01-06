
package servicepublisher;

public class ServicePublishImpl implements ServicePublish {

	@Override
	public double calculate(double number1, double number2, char operator) {
		
		double ans = 0;
		
		if (operator == '+') {
			ans = number1 + number2;
		}else if (operator == '-') {
			ans = number1 - number2;
		}else if(operator == 'X' | operator == '*'){
			ans = number1 * number2;
		}
		else if (operator == '/') {
			ans = number1 / number2;
		}
		else if (operator == '%') {
			ans = number1 % number2; 
		}
		return ans;
	}

}

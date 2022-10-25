package calculator;
import java.io.IOException;

public class compute {

	   public static void main(String[] args) throws IOException {
		   int input = 0;
		   while(input!='x') {
		   char charNum1, op1, charNum2, op2 = 0;
		   int intNum1, intNum2, result = 0;
		   charNum1 = (char) System.in.read(); 
		   op1 = (char) System.in.read(); 
		   charNum2 = (char) System.in.read(); 
		   op2 = (char) System.in.read(); 
		   
		   intNum1 = charNum1 - '0';
		   intNum2 = charNum2 - '0';
		   
		   if(op2 == '=') {
			   switch(op1) {
			   case '+':
				   result = intNum1 + intNum2;
				   break;
			   case '-':
				   result = intNum1 - intNum2;
				   break;
			   case '*':
				   result = intNum1 * intNum2;
				   break;
			   case '/':
				   result = intNum1 / intNum2;
				   break;
			   }
			System.out.println(result);
		   }   	
	   }
	   }
}

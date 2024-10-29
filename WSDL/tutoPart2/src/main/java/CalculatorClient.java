import com.mehdi.Calculator;
import com.mehdi.CalculatorSoap;

public class CalculatorClient {

    public static void main(String[] args){
        Calculator calculatorService = new Calculator();

        CalculatorSoap calculatorPort = calculatorService.getCalculatorSoap();

        int a = 10;
        int b = 200;
        int resultAdd = calculatorPort.add(a, b);
        int resultSub = calculatorPort.subtract(a, b);
        int resultMult = calculatorPort.multiply(a, b);

        System.out.println("Addition Result : "+resultAdd);
        System.out.println("Sub Result : "+resultSub);
        System.out.println("Mult Result : "+resultMult);
    }
}

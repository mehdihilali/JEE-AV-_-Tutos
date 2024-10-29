import com.mehdi.tuto.Calculator;
import com.mehdi.tuto.CalculatorSoap;

public class ClientAPP {
    public static void main(String[] args) {
        Calculator calculatorService = new Calculator();
        CalculatorSoap calculatorPort = calculatorService.getCalculatorSoap();

        int resultAdd = calculatorPort.add(10, 20);
        System.out.println("Addition Result: "+ resultAdd);

        int resultSub = calculatorPort.subtract(20, 10);
        System.out.println("Sub Result: "+ resultSub);
    }
}

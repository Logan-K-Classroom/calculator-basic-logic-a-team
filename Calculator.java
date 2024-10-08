
public class Calculator {
    public static void main(String[] args) {
        double firstNumber = AutoGraderInput.getFirstNumber();
        String operator = AutoGraderInput.getOperator();
        double secondNumber = AutoGraderInput.getSecondNumber();

        double result = 0;

        switch(operator){
            case "+":
                result = firstNumber + secondNumber;
                System.out.print(result);
                break;
            case "-":
                result = firstNumber - secondNumber;
                System.out.print(result);
                break;
            case "*":
                result = firstNumber * secondNumber;
                System.out.print(result);
                break;
            case "/":
                if(secondNumber == 0){
                    System.out.print("Error: Can't Divide by Zero");
                }else{
                result = firstNumber / secondNumber;
                System.out.print(result);
                }
                break;
            case "^":
                result = Math.pow(firstNumber, secondNumber);
                System.out.print(result);
                break;
            default:
                System.out.print("Error: Invalid Operator");
                break;

        }
    }
}

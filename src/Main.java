public class Main {
    public static void main(String[] args) {
        Calculator calculator = new
                Calculator();
        //variables number
        double num1 = Math.random();
        double num2 = Math.random();
        //addTwoNumbers
        System.out.println(calculator.addTwoNumbers(num1, num2));
        num1 = Math.random();
        num2 = Math.random();
        //subtractTwoNumber
        System.out.println(calculator.subtractTwoNumbers(num1, num2));
        num1 = Math.random();
        num2 = Math.random();
        //multiplyTwoNumbers
        System.out.println(calculator.multiplyTwoNumbers(num1, num2));
        num1 = Math.random();
        num2 = Math.random();
        //divideTwoNumber
        System.out.println(calculator.divideTwoNumbers(num1, num2));
        /*int intTotal = (int) (calculator.getRunningTotal() * 10);
Use the method checkIsEven(intTotal) and selection to either print out intTotal + “ is even" using the actual value of the intTotal total if it is even, if it is odd print out intTotal +  " is odd"
 */
        int intTotal = (int)
                (calculator.getRunningTotal() * 10);
        if (calculator.checkIsEven(intTotal)) {
            System.out.println(intTotal + "is even");}
        else{
                System.out.println(intTotal + "is odd");
            }
        //Finally print out the current status of the code using the method getCurrentStatus()in the Calculator class
System.out.println(calculator.getCurrentStatus());
        }
    }

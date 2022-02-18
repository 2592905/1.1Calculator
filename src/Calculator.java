public class Calculator {
    //1.1 // Two field username(name) and runningTotal
    private String username;
    private int total;
    public Calculator() {
        total = 0;
    }
    public String getUserName() {
        return username;
    }
    public Calculator(String username) {
        this.username = username;
    }
    private double runningTotal;

    public void setRunningTotal(double runningTotal) {
        this.runningTotal = runningTotal;
    }
    public double getRunningTotal() {
        return runningTotal;
    }
    public Calculator(double runningTotal) {
        this.runningTotal = runningTotal;
    }
    //1.4 addTwoNumber(double num1, double num2)
    public double addTwoNumbers(double num1, double num2) {
        double result = num1 + num2;
        runningTotal += result;
        return result;
    }
    public double subtractTwoNumbers(double num1, double num2) {
        double result = num1 - num2;
        runningTotal += result;
        return result;
    }
    public double multiplyTwoNumbers(double num1, double num2) {
        double result = num1 * num2;
        runningTotal += result;
        return result;
    }
    public double divideTwoNumbers(double num1, double num2) {
        double result = num1 / num2;
        runningTotal += result;
        return result;}
        /*public boolean checkIsEven(int checkNum)
        Write a method with an appropriate return type and access modifier that determines if checkNum is
        currently even.*/
    public boolean checkIsEven(int checkNum){
        return checkNum % 2==0;
    }
    /*1.9 getCurrentStatus()
Write a method with an appropriate return type and access modifier that returns a String in the following
format "username running total is runningTotal" but show the actual values stores in username and
runningTotal in the String*/
    public String getCurrentStatus() {
        return username + "running total is" +runningTotal;
    }
}

package myfirstpackage;
public class MySecondClass {
    private int firstNumber;
    private int secondNumber;
    
    public int getFirstNumber() {
        return firstNumber;
    }
    
    public void setFirstNumber(int number) {
        this.firstNumber = number;
    }
    
    public int getSecondNumber() {
        return secondNumber;
    }
    
    public void setSecondNumber(int number) {
        this.secondNumber = number;
    }
    
    public int bitwiseShiftLeft() {
        return firstNumber << secondNumber;
    }
}
import myfirstpackage.*;
class MyFirstClass {
    public static void main(String[] args) {
        MySecondClass o = new MySecondClass();
        System.out.println(o.bitwiseShiftLeft());
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                o.setFirstNumber(i);
                o.setSecondNumber(j);
                System.out.print(o.bitwiseShiftLeft());
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
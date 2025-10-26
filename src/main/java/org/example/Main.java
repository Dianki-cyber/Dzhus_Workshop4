package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        UserInterface test1 = new UserInterface();
        test1.start();
    }

}
 class MathDiana{
    private  int num1;
    private int num2;

     public MathDiana(int num1, int num2) {
         this.num1 = num1;
         this.num2 = num2;
     }

     public  void  addTwoNumbers(int num1, int num2){
        int result = num1+ num2;
        System.out.println(result);

    }
    public  static  int addTwoNumbersWithResult(int num1 , int num2){
        int result = num1 + num2;
        return  result;
    }


}

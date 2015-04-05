package abaird.week1.hw;

public class OperatorPrecedence {
  public static void main(String[] args){
    int x;
    int y = 4;
    x = ++y + 47 + 91 % 8 * (14 * 8 % 3) / 4;
    System.out.println("x is: " + x);  // x = 52

    // Here is how this works:
    // do the ()'s, using left associativity
    // 14 * 8 = 112
    // 112 % 3 = 1
    //
    // Do postfix increment (but there aren't any)
    //
    // Do prefix increment and/or unary +/-
    // ++y = 5
    //
    // Do multiplicative (* / %) from left to right
    // in the order you see these operators in
    // 91 % 8 = 3
    //
    // 3 * (14 * 8 % 3) = 3 * 1 = 3
    // 3 / 4 = 0.75 -> but this is an integer, so 0
    //
    // Do addition and subtraction
    // 5 + 47 = 53
    
  }
}

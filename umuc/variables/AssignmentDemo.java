public class AssignmentDemo {
  public static void main(String[] args){
    int a = 1;
    int b = 2;
    int c = 3;
    System.out.println("a: " + a + " b: " + b + " c: " + c);
    // a: 1 b: 2 c: 3
    System.out.println("increment a by 1, decrement b by 1");
    a += 1;
    b -= 1;
    System.out.println("a: " + a + " b: " + b + " c: " + c);
    // a: 2 b: 1 c: 3
    System.out.println("a increment postfix by 1");
    System.out.println("b increment prefix by 1");
    a++;
    ++b;
    System.out.println("a: " + a + " b: " + b + " c: " + c);
    // a: 3 b: 2 c: 3
    System.out.println("reset everything to 0");
    a = b = c = 0;
    System.out.println("a: " + a + " b: " + b + " c: " + c);
    int sum;
    sum = a + (++b);
    System.out.println("add a and (++b) together");
    System.out.println("a: " + a + " b: " + b + " c: " + c + " sum: " + sum);
    // a: 0 b: 1 c: 0 sum: 1
    sum = 0;
    a = b = c = 0;
    System.out.println("reinitialize and add a and (b++) together");
    sum = a + (b++);
    System.out.println("a: " + a + " b: " + b + " c: " + c + " sum: " + sum);
    // a: 0 b: 1 c: 0 sum: 0

    System.out.println("A: 1 + 2.0 = " + (1 + 2.0)); // 3.0
    System.out.println("B: 1 + 2 - 2.5 = " + (1 + 2 - 2.5)); // 0.5
    System.out.println("C: 17 / 5 * 3.2 = " + (17 / 5 * 3.2)); // 9.600000000001
    System.out.println("D: 3.2 / 5 * 17 = " + (3.2 / 5 * 17)); // 10.88
    System.out.println("E: 4.5 / (17 / 5) = " + (4.5 / (17 / 5))); // 1.5
  }
}

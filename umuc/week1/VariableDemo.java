public class VariableDemo
{
	public static void main(String[] args){
		byte myByte = 20;
		short myShort = 2000;
		int myInt = 20000;
    int myHexInt = 0x00dd;
    int myBinaryInt = 0b1101;
		long myLong = 2_000_000_000L;
		float myFloat = 32.234f;
		double myDouble = 32.932;
		boolean myBoolean = true;
    boolean myFalseBoolean = false;
		char myChar = 'C';
    final double SPEEDOFSOUND = 343.6; 

    System.out.println("mybyte: " + myByte);
    System.out.println("myShort: " + myShort);
    System.out.println("myInt: " + myInt);
    System.out.println("myHexInt: " + myHexInt);
    System.out.println("myBinaryInt: " + myBinaryInt);
    System.out.println("myLong: " + myLong);
    System.out.println("myFloat: " + myFloat);
    System.out.println("myDouble: " + myDouble);
    System.out.println("myBoolean: " + myBoolean);
    System.out.println("myChar: " + myChar);
    System.out.println("SPEEDOFSOUND: " + SPEEDOFSOUND);

	}
}

public class PrintDiff
{
	public static String repeat(int count, int increment) {
		String character = String.valueOf((char)(96 + increment)); 
		return new String(new char[count]).replace("\0", character);
	}

	public static String repeat(int count) {
		return new String(new char[count]).replace("\0", " ");
	}
	
	public static void char_printout(int count) {
		System.out.println(repeat(count, count) + repeat(5) + repeat(count, count));
	}

	public static void repeat_for_and_print(int repeat_for, int direction) {
                int start, end;
		if (direction > 0) {
                        start = 1;
                        end = repeat_for + 1;
		} else {
                        start = repeat_for -1;
                        end = 0;
		}
		for (int n = start; n < end || n > end; n += direction) {
			char_printout(n);
		}
	}  

	public static void main(String[] args)
	{
		int repeat_for = 20;
                 repeat_for_and_print(repeat_for, 1);
                 repeat_for_and_print(repeat_for, -1);
		 
	}
}    

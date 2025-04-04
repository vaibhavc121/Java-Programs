package techRostrum;

public class StringArray
{

	public static void main(String[] args)
	{

//		String arr[] =
//		{ "abc def" };
//		System.out.println(arr.length);

		String str = "aba def";
		int original = str.length();
		int result = str.replaceAll("a", "").length();
		System.out.println(original - result);

	}

}

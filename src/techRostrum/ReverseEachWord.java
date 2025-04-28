package techRostrum;

public class ReverseEachWord
{

	public static void main(String[] args)
	{
		String str = "how are you";
		String[] arr = str.split(" ");

		char rev='';

		for (String word : arr)
		{
			int i = word.length();

			while (i >= 0)
			{
				char ch = word.charAt(i - 1);

				rev=rev+ch;
				i--;

			}

			System.out.println(rev);
		}
	}

}

package techRostrum;

public class StringArray
{

	public static void main(String[] args)
	{
		String str = "nayan";
		String orgstr = str;

		int left = 0;
		int right = str.length() - 1;
		char ch[] = str.toCharArray();

		while (left < right)
		{
			char temp = ch[left];
			ch[left] = ch[right];
			ch[right] = temp;
			left++;
			right--;
		}

		String newstr = new String(ch);

		if (orgstr.equals(newstr))
		{
			System.out.println("palin");
		}
		else
		{
			System.out.println("not palin");
		}

//		String str = "vaibhavchavan";
//		char arr[] = str.toCharArray();
//
//		for (int i = 0; i <= (arr.length - 7); i++)
//		{
//			System.out.print(arr[i]);
//		}

//		String str1 = "";
//		str1 = str1 + str.charAt(1);
//		System.out.println(str1);

//		for (int i = 0; i < str.length(); i++)
//		{
//			for (int j = str.length() - 1; j >= 0; j--)
//			{
//				while (str.charAt(i) != str.charAt(j))
//				{
//					str.charAt(i);
//
//				}
//			}
//		}

//		String str1 = "stop";
//		String str2 = "tops";
//
//		char ch1[] = str1.toCharArray();
//		char ch2[] = str2.toCharArray();
//
//		System.out.println(ch1[3]);

//		char temp[] =
//		{ 3 };
//
//		for (int i = 0; i < str1.length(); i++)
//		{
//			for (int j = 0; j < str2.length(); j++)
//			{
//				if (ch1[i] == ch2[j])
//				{
//					for(int k=)
//					temp[i] = ch1[i];
//				}
//			}
//		}
//
//		if (temp.equals(ch1))
//		{
//			System.out.println(temp);
//		}

//		String str = "laptap";
//		char arr[] = str.toCharArray();
//		int counter = 0;
//		char ch = 0;
//		String str1 = "a";
//
//		for (int i = 0; i < arr.length; i++)
//		{
//			for (int j = 0; j < arr.length; j++)
//			{
//				if (arr[i] == arr[j])
//				{
//					counter++;
//					if (counter < 1)
//					{
//
//						System.out.println("duplicate characters are: " + arr[i] + ",");
//						ch = arr[i];
//
//					}
//
//				}
//			}
//			counter = 0;
//		}
//
//		System.out.print("duplicate character is: " + ch);

		// char ch[] =
//		{ 'a', 'b', 'c' };
//		int i = 0;
//		while (i < ch.length)
//		{
//			System.out.print(ch[i]);
//			i++;
//		}

//		String arr[] =
//		{ "abc def" };
//		System.out.println(arr.length);

//		String str = "aba def";
//		int original = str.length();
//		int result = str.replaceAll("a", "").length();
//		System.out.println(original - result);

//		String str = "laptop";
//		for (int i = 0; i <= str.length(); i++)
//		{
//			try
//			{
//				System.out.print(str.charAt(i) + " ");
//			}
//			catch (Exception e)
//			{
//				System.out.println("exception");
//			}
//
//		}
	}

}

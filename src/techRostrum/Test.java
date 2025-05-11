package techRostrum;

public class Test
{

	public static void main(String[] args)
	{
		int[] arr = { 1, 2, 1, 3, 4, 5, 3 };

		for (int i = 0; i < arr.length - 1; i++)
		{
			for (int j = i + 1; j < arr.length; j++)
			{
				if (arr[i] == arr[j])
				{
					System.out.print(arr[i] + " ");
				}
			}
		}

//		String str = "vaibhav";
//		char[] ch = str.toCharArray();
//
//		int i = 0;
//		int j = ch.length - 1;
//
//		while (i < j)
//		{
//			char temp = ch[i];
//			ch[i] = ch[j];
//			ch[j] = temp;
//
//			i++;
//			j--;
//		}
//
//		System.out.println(ch);
	}

}

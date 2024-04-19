package sdet_qa.collections;

import java.util.HashSet;

public class HashSetDemo
{

	public static void main(String[] args)
	{
		// Set<Object> myset = new HashSet<Object>(); //hetrogenios data
		// HashSet<Object> myset = new HashSet<Object>(); //hetrogenios data
		HashSet<String> myset = new HashSet<String>(); // homogenios data

		myset.add("abc");
		myset.add("abc");
		myset.add(123);

		System.out.println(myset);
	}

}

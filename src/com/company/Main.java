package com.company;

public class Main
{
    public static void main(String[] args)
    {
	int n = 11;
	int product = 1;
	for (int counter = 1; counter <= n; counter = counter + 1)
		product = product * counter;

	System.out.println(product);
    }
}

package com.bridgelabz;

public class StringPermutation {
	   public static void main(String[] args)
	    {
	    	System.out.println("Welcome to String Permutations program : ");
	    	StringPermutationMethods call = new StringPermutationMethods();
	        String input = call.getinput();
	        StringPermutationMethods.permutateRecursive(input, "");
	        StringPermutationMethods.permutateIterative(input);
	        call.displayResult();
	    }
}

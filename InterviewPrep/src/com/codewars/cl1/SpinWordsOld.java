package com.codewars.cl1;

public class SpinWordsOld {
	
	private static String SPINSTATEMENT_INSTANCE_1 = "Hey fellow warriors";
	private static String SPINSTATEMENT_INSTANCE_2 = "This is a test";
	private static String SPINSTATEMENT_INSTANCE_3 = "This is another test";
	private String input;
	private String RESULT;
	
	
	public SpinWordsOld(String statement)
	{
		input = statement;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SpinWordsOld instance_1 = new SpinWordsOld(SPINSTATEMENT_INSTANCE_1);
		SpinWordsOld instance_2 = new SpinWordsOld(SPINSTATEMENT_INSTANCE_2);
		SpinWordsOld instance_3 = new SpinWordsOld(SPINSTATEMENT_INSTANCE_3);
		
		System.out.println("Statement to Spin : " + SPINSTATEMENT_INSTANCE_1);
		instance_1.RESULT = instance_1.spinWords(instance_1.input);
		System.out.println("Spinned Statement :" + instance_1.RESULT);
		
		System.out.println("Statement to Spin : " + SPINSTATEMENT_INSTANCE_2);
		instance_2.RESULT = instance_2.spinWords(instance_2.input);
		System.out.println("Spinned Statement :" + instance_2.RESULT);
		
		System.out.println("Statement to Spin : " + SPINSTATEMENT_INSTANCE_3);
		instance_3.RESULT = instance_3.spinWords(instance_3.input);
		System.out.println("Spinned Statement :" + instance_3.RESULT);
		
	}
	
	public String spinWords(String sentence)
	{
		String stringArray[] = sentence.split(" ");
		StringBuffer resultBuffer = new StringBuffer();
		
		for(String element : stringArray) {
			 System.out.println("Element : " + element);
			 if(element.length() >= 5)
			 {
				 StringBuffer tempBufferToReverse = new StringBuffer();
				 tempBufferToReverse.append(element);
				 tempBufferToReverse.reverse();
				 resultBuffer.append(tempBufferToReverse);
				 resultBuffer.append(" ");
			 }
			 else{
			     resultBuffer.append(element);
			     resultBuffer.append(" ");
			 }
	      }
		
		RESULT = resultBuffer.toString();
		//result = resultBuffer;
		return RESULT;
		
	}

}

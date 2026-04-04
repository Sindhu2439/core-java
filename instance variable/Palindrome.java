class Palindrome{
	static void palindromeCheck(String text){
		 String reversed = "";
		 
		for(int i=text.length()-1; i>=0; i--){
			reversed = reversed + text.charAt(i);
		}
		System.out.println("reversed form is"+ reversed);
		
		if(text.equals(reversed)){
			System.out.println(reversed+"it is a palindrome");
		}
		else{
			System.out.println(reversed+"it is  not a palindrome");
		}
	}
}
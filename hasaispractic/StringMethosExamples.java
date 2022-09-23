package hasaispractic;

public class StringMethosExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Welcome", s2="Hello ",s3="welcome", s4="   Welcome to Edubridge   ",s7="";
		System.out.println("CharAt(3): "+s1.charAt(3));
		System.out.println("Length(): "+s2.length());
		System.out.println("String substring(int beginIndex):  "+s1.substring(3));
		System.out.println("String substring(int beginIndex, int endIndex):  "+s3.substring(0,4));
		System.out.println("String substring(int beginIndex, int endIndex):  "+s3.substring(1,3));
		
		System.out.println("boolean contain(charSequence): "+s1.contains("X"));
		System.out.println("boolean contain(charSequence): "+s2.contains("H"));
		System.out.println("boolean contain(charSequence): "+s1.contains("h"));
		
		System.out.println("boolean equals(Object obj): "+s1.equals(s3));
		System.out.println("boolean equals(Object obj): "+s1.equals("Welcome"));
		System.out.println();
		System.out.println("boolean equalsIgnoreCase(Object obj): "+s1.equalsIgnoreCase(s3));
		System.out.println();
		System.out.println("boolean isEmpty(): "+s4.isEmpty());
		System.out.println("boolean isEmpty(): "+s7.isEmpty());
		System.out.println("int indexOf(char ch,int fromIndex): "+s1.indexOf('e',2));
		System.out.println("\n\n");
		System.out.println("int indexOf(char ch,int fromIndex): "+s1.indexOf('e'));
		
		System.out.println("String concat(String str): "+s2.concat("abc"));
		System.out.println(s2);
		s2=s2.concat("abc");
		System.out.println(s2);
		System.out.println("String replace(Char old,char new): "+s3.replace('e', 'a'));
		System.out.println("String toUpperCaese(): "+s3.toUpperCase());
		System.out.println("String toLowerCaese(): "+s3.toLowerCase());
		System.out.println();
		System.out.println("String trim(): "+s4.length());
		s4=s4.trim();
		System.out.println(s4+"  "+s4.length());
		
		System.out.println(s4.length());
	//	System.out.println("String[] split(" "): ");
		System.out.println();
		String splitedString[]=s4.split(" ");		//splited is a variable name.
		System.out.println("Splited Strings: ");
		for(int i=0;i<splitedString.length;i++)
		{
			System.out.println(splitedString[i]);
		}
	}

}

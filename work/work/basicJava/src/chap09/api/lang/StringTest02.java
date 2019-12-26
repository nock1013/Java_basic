package chap09.api.lang;
//String클래스의 기본 메소드
public class StringTest02 {
	public static void main(String[] args) {
		String str1 = new String("java programming");
		String str2 = new String("재밌다???");
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println("str1.concat(str2)=>"+str1.concat(str2));
		System.out.println("str1.indexOf('a')=>"+str1.indexOf('a'));
		System.out.println("str1.indexOf('합')=>"+str1.indexOf('합'));
		System.out.println("str1.lastIndexOf('a')=>"+str1.lastIndexOf('a'));
		//equals는 대소문자도 확인한다.
		System.out.println("str1.length=>"+str1.length());
		System.out.println("str1.equlas(\"java programming\")=>"+str1.equals("java programming"));
		System.out.println("str1.equlas(\"Java programming\")=>"+str1.equals("Java programming"));
		
		//문자열 비교 - 대소문자 비교안함
		System.out.println("str1.equals(\"java programming\")=>"+str1.equalsIgnoreCase("java programming"));
		System.out.println("str1.equals(\"java programming\")=>"+str1.equalsIgnoreCase("Java programming"));
		//문자열 비교 - prefix
		System.out.println("str1.starWith(\"java\")=>"+str1.startsWith("java"));
		System.out.println("str1.starWith(\"Java\")=>"+str1.startsWith("ming"));
		//문자열 비교 - suffix
		System.out.println("str1.endWith(\"ming\")=>"+str1.endsWith("ming"));
		
	}

}

class stringbuffer
{
public static void main(String args[])
{
StringBuffer sb1=new StringBuffer("hub");
System.out.println(sb1.capacity());
System.out.println(sb1.length());
System.out.println(sb1);
sb1.reverse();
System.out.println(sb1);
StringBuffer sb2=new StringBuffer("kgf");
sb2.setCharAt(2,'m');
System.out.println(sb2);
StringBuffer sb3=new StringBuffer("aditya");
sb3.append("engineering college");
System.out.println(sb3);
sb1.insert(1,"Technical");
System.out.println(sb1);
}
}

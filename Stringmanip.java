//peac9a
class Stringmanip
{
public static void main(String args[])
{
StringBuffer str= new StringBuffer("Object language");
System.out.println("original string is"+str);
//accessing character in a string
for (int i=0;i<str.length();i++)
{
System.out.println("character at position"+i+"in"+str.charAt(i));
}

//inserting a string in the middle
String astring=new String(str.toString());
int pos=astring.indexOf(" language");
str.insert(pos," oriented");
System.out.println("Modified string  "+str);

//modifying character
str.setCharAt(6,'-');
System.out.println(" string now  "+str);

//Appending a string at the end
str.append(" improves security");
System.out.println("Appended string  "+str);
}
}
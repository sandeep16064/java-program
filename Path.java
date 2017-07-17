
class Path
{
public static void main(String args[])
{
String cp=System.getProperty("java.class.path");
System.out.println(cp);

System.setProperty("java.class.path","C:\f1;");

String cp1=System.getProperty("java.class.path");
System.out.println(cp1);
}
}

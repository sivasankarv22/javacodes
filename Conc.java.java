class Conc	
{
public static void main(String[]args)
{
String str="Find out value";
int voc=0,conc=0;
for(int i=0;i<=str.length()-1;i++)
{
if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
{
voc++;
}
else if (str.charAt(i)>='a'&&str.charAt(i)<='z')
{
conc++;
}
}
System.out.print(voc);
System.out.print(conc);
}
}



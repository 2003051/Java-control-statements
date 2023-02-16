/*
// break statement in do-while loop
class breakstat
{
  public static void main(String [] args)
{
  
  for(int i=1;i<10;i++)
{

  if(i==5)
{
 break;
}

System.out.println(i);
}
}
}*/

//break statement in inner loop

class breakstat
{
 public static void main(String []args)
{
 for(int i=1;i<5;i++)
{
  for(int j=1;j<5;j++)
{
  if(i==2 && j==2)
{
  break;
}
System.out.println(i+ " " +j);
}
}
}
}
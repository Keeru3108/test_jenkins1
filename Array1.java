class Array1
{
public static int[] post4(int[] a) 
{
  for(int i=0;i<a.length;i++)
  {
    for(int j=i+1;j<a.length;j++)
    {
      if(a[i]==a[j])
      {
        a[j]=0;
      }
    }
  }
  
  printarray(a);
  
  return a;
}
public static void printarray(int a[])
{
  for(int i=0;i<a.length;i++)
  {
    System.out.println(a[i]);
  }
}
public static void main(String[] args) 
{
  int[] a1={1,1,1,4,2,4,5};
  post4(a1);
  System.out.println("Heeloworld");
}
}

package mypack.testpack;
public class Compare
{
public int greaterValue(int x,int y,int z)
{
if(x>y)
{
if(x>z)
  return x;
else 
 return z;
}
else 
{
if(y>z)
     return y;
else
    return z;
}
}
public int lesserValue(int x,int y,int z)
{
if(x<y)
{
  if(x<z)
   return x;
else 
    return z;
}
else 
{
   if(y<z)
      return y;
else
     return z;
}
}
}
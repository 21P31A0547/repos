class MyThread1 implements Runnable
{
public void run()
{
while(true)
{
System.out.println("good morning");
try
{
  Thread.sleep(1000);
}
catch(InterruptedException ie)
{
System.out.println("Thread is interrupted");
}
}
}
}
class MyThread2 implements Runnable
{
public void run()
{
while(true)
{
System.out.println("hello");
try
{
  Thread.sleep(2000);
}
catch(InterruptedException ie)
{
System.out.println("Thread is interrupted");
}
}
}
}
class MyThread3 implements Runnable
{
public void run()
{
while(true)
{
System.out.println("Welcome");
try
{
  Thread.sleep(3000);
}
catch(InterruptedException ie)
{
System.out.println("Thread is interrupted");
}
}
}
}
class Mainclass
{
    public static void main(String args[])
{
  Thread t1=new Thread( new MyThread1());
  Thread t2=new Thread( new MyThread2());
  Thread t3=new Thread( new MyThread3());
   System.out.println(Thread.currentThread().getPriority());
   System.out.println(t1.getPriority());
   System.out.println(t2.getPriority());
   System.out.println(t3.getPriority());
   t1.start();
   t2.start();
   t3.start();
}
}

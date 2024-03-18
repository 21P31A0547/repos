class DaemonThread extends Thread
{
public void run()
{
if(Thread.currentThread().isDaemon())
{
System.out.println("daemon is executing");
}
else
{
System.out.println("user thread executing");
}
}
public static void main(String args[])
{
DaemonThread t1=new DaemonThread();
DaemonThread t2=new DaemonThread();
System.out.println(t1.isAlive());
t1.setDaemon(true);
t1.start();
t2.start();
System.out.println(t1.isAlive());
}
} 
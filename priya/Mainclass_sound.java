abstract class Animal
{
public abstract void makesound();
public void eat()
{
System.out.println("Iam eating");
}
}
class Dog extends Animal
{
public void makesound()
{
System.out.println("Bark");
}
}
class Cat extends Animal
{
public void makesound()
{
System.out.println("Meow");
}
}
class Mainclass_sound
{
public static void main(String args[])
{
Dog d=new Dog();
d.makesound();
d.eat();
Cat c=new Cat();
c.makesound();
c.eat();
}
}
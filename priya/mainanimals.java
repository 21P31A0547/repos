class mainanimals()
{
 public static void main(String args[])
{
Animal a=new Animal();
a.eat();
Herbivores h=new Herbivorous();
h.eat();
Carnivores c=new Carnivores();
c.eat();
Omnivorous o=new Omnivorous();
o.eat();
}
}
class Animal()
{
public void eat()
{
 System.out.println("Eating food");
}
}
class Herbivores extends Animal()
{
public void eat()
{
 System.out.println("Eating plants only");
}
}
class  Carnivores extends Animal()
{
public void eat()
{
 System.out.println("Eating meat only");
}
}
class Omnivorous extends Animal()
{
public void eat()
{
 System.out.println("Eats both plants and meat ");
}
}

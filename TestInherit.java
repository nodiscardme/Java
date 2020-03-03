class Animal
{
 private boolean Vegetarian;
 private String Eats;
 private int noOflegs;

 public Animal(){}
 public Animal(boolean veg, String food, int legs)
  {
   this.Vegetarian=veg;
   this.Eats=food;
   this.noOflegs=legs;
  }
  public boolean isVegetarian()
   {
    return Vegetarian;
   }
  public String getEats()
   {
    return Eats;
   }
  public int noOflegs()
   {
    return noOflegs;
   }
}

class monkey extends Animal
{
 private String color;
 public monkey(boolean veg, String food, int legs, String color)
 {
  super(veg,food,legs);
  this.color=color;
 }
 public String getcolor()
  {
   return color;
  }
}
 public class TestInherit
  {
   public static void main(String args[])
    {
     monkey m = new monkey(false, "bananna", 2, "black");
     System.out.println("monkey is vegetarian= "+ m.isVegetarian());
     System.out.println("monkey eats "+ m.getEats());
     System.out.println("monkey has "+ m.noOflegs()+" legs");
     System.out.println("monkey color is "+ m.getcolor());
    }
  }






























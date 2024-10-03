/* Constructing Objects and Exercising Methods Challenge
   1. Construct one zero argument constructor Pet object.
   2. Construct three 6 argument constructor Pet objects.
   3. Make one of your pets sleep by exercising the sleep() method.
   4. Make one of your pets wake up by using the wakeUp() method.
   5. Age two of your pets by using the aging() method.
   6. Make one of your pets gain weight by exercising the changeWeight() method.
   7. Make one of your pets lose weight by exercising the changeWeight() method.
   Rules: You may not change ANYTHING about the Pet class file.
   You must do everything above by using the Pet class.
   Between each console output, place a System.out.println() to aid with readibility of your output.
   Place all of your code in the main method below.
*/

class Main {
  public static void main(String[] args) {
   // zero argument construct
   Pet pet1= new Pet();
   System.out.println(pet1);
   System.out.println();

   // three 6 arguement construct
   Pet pet2 = new Pet("cat","Bain",11,12.5,true,false);
   System.out.println(pet2);
   System.out.println();
   Pet pet3= new Pet("dog","Whiskey",8,32,true,false);
   System.out.println(pet3);
   System.out.println();
   Pet pet4 = new Pet("dog","Sunny",5,41,false,true);
   System.out.println(pet4);
  
   // put pet2 to sleep
   pet2.sleep();
   System.out.println();
   //wake pet4 up
   pet4.wakeUp();
   System.out.println();
   //time passing
   pet3.aging(1);
   pet4.aging(1);
   System.out.println();
   //weight changes
   pet4.changeWeight(2.5);
   pet3.changeWeight(-0.4);
  }
}
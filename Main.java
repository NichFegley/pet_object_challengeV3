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

   // three 6 arguement construct
   Pet pet2 = new Pet("cat","Bain",11,12.5,true,false);

   System.out.println(pet1);
   System.out.println(pet2);

  }
}
  public class day_4{
    /* 
When squirrels get together for a party, they like to have cigars. A squirrel party is successful when the number of 
cigars is between 40 and 60, inclusive. Unless it is the weekend, in which case there is no upper bound on the number 
of cigars.Return true if the party with the given values is successful, or false otherwise.

cigarParty(30, false) → false
cigarParty(50, false) → true
cigarParty(70, true) → true */


public class Demo5{
  public boolean cigarParty(int cigars, boolean isWeekend) {
      if(isWeekend){
          return cigars>=40;
      }
      else{
          return cigars>=40 && cigars<=60;
      }
  }

  public static void main(String[] args) {
    Demo5 demo = new Demo5();
    System.out.println(demo.cigarParty(30, false)); 
    System.out.println(demo.cigarParty(50, false)); 
    System.out.println(demo.cigarParty(70, true));
}
}



















  }  
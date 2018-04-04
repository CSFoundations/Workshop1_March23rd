//fizzbuzz
//print fizz if number is divisible by 3, buzz if number is divisible by 5 or
//fizzbuzz if number is divisible by 15

public static void fizzbuzz(int n){
  if(n%15 == 0){
    System.out.println("fizzbuzz");
  }else if(n%5 == 0){
    System.out.println("buzz");
  }else if(n%3 == 0){
    System.out.println("fizz");
  }
}

//print upside down right triangle of equal width and height of n
/* i.e.
***
**
*
*/

public static void printTriangle(int n){
  for(int i = 0; i < n; i++){
    for(int j = i; j < n; j++){
      System.out.println("*");
    }
  }
}

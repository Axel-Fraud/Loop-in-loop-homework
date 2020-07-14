class Main {
  public static void main(String[] args) {
   /*String input = "dog"; 
String output = "";
int n = 3;
for(int i = 0; i < input.length(); i++) { // loop through every character
    for (int j = 0; j < n; j++) { // add the current character to the string n times
        output += input.charAt(i);
    }
}
*/
String food = "boat";
System.out.println(lOop(food, 2));
 
 
  }


public static String lOop(String x, int y){
String output = "";
for(int i = 0; i < x.length(); i++) { 
    for (int j = 0; j < y; j++) { 
        output += x.charAt(i);
    }
    
}
return output;
}




}



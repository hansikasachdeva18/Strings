// using substring function 

public class Main {
    public static void main(String[] args) {
       String str = "abc";
       for(int i=0;i<str.length();i++){
           for(int j=i+1;j<=str.length();j++){
               System.out.println(str.substring(i,j));
           }
       }
    }
}

// using 3 loops 

public class Main{

    public static void printAllSubstrings(String str) {
        int n = str.length();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                // Print characters from i to j
                for (int k = i; k <= j; k++) {
                    System.out.print(str.charAt(k));
                }
                System.out.println(); 
            }
        }
    }

    public static void main(String[] args) {
        String input = "abc";
        printAllSubstrings(input);
    }
}

Output : 
a
ab
abc
b
bc
c


// Using Recursion 

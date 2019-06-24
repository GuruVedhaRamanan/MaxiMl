import java.io.*;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception 
    {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     String input = br.readLine();
     Set<Character>s = new HashSet<Character>();
     for(int i=0;i<input.length();i++)
     {
         s.add(input.charAt(i));
     }
     System.out.println(s.size());
    }
}

import java.util.ArrayList;
public class Main {
   public static void main(String args[]) {
       //String ArrayList
       ArrayList<String> al = new ArrayList<String>();
       al.add("hello");
       al.add("bat");
       al.add("cat");
       al.add("dog");
       al.add("bat");
       al.add("high");
       System.out.println("List before remove:");
       for(String var: al){
            System.out.println(var);
       }
       al.remove(0);
       al.remove(2);
       al.remove(2);
       System.out.println("List After remove:");
       for(String var2: al){
             System.out.println(var2);
       }
    }
}
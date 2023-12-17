import java.util.ArrayList;
import java.util.List;

public class GitCopilotMain {
    public  static  void  main(String[] args){
        System.out.println("GitCopilotMain---");
        List<Integer> list = new ArrayList();
        //add numbers to the list
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);
        int result = add(1, 2);
        System.out.println(result);
        System.out.println(add(list));
        }
  //static method that adds two numbers and returns the result
    public static int add(int num1, int num2) {
        return num1 + num2;
    }
    // static method that loops thru a list and adds the numbers and returns the result
    public static int add(List<Integer> list) {
        int result = 0;
        for (int i : list) {
            result += i;
        }
        return result;
    }

}

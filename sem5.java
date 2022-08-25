import java.util.Stack;
import java.util.Scanner;
 
public class sem5{
 
    public static void main(String[] args) {
      Stack<Integer> st = new Stack<>();
      Scanner scan = new Scanner(System.in);
      System.out.print("Введите строку: ");
      String cmd = scan.nextLine();
      char a;
      int i,k;
      boolean flag=true;
      for (i=0; i < cmd.length(); i++)
      {
          a=cmd.charAt(i);
          switch (a)
          {
              case '(':
                st.push(1);
                break;
              case '[':
                st.push(2);
                break;
              case '{':
                st.push(3);
                break;
              case ')':
                if (st.empty())
                {
                   flag=false;
                   break;
                }
                k=st.peek();
                st.pop();
                if (k!=1) flag=false;
                break;
              case ']':
                if (st.empty())
                {
                   flag=false;
                   break;
                }
                k=st.peek();
                st.pop();
                if (k!=2) flag=false;
                break;
              case '}':
                if (st.empty())
                {
                   flag=false;
                   break;
                }
                k=st.peek();
                st.pop();
                if (k!=3) flag=false;
                break;
              default:  
          }
          if (!flag) break;
      }
      
      if (flag && st.empty())
          System.out.println("true");
      else
          System.out.println("false");
    }
}
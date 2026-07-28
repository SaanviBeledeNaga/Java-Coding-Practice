import java.util.*;
class Solution {
    public int evaluatePostfix(String[] arr) 
    {
        Stack<Integer> st = new Stack<>();
        for (String s : arr) 
        {
            if (s.equals("+") || s.equals("-") || s.equals("*")
                    || s.equals("/") || s.equals("^")) 
                {
                int b = st.pop();
                int a = st.pop();
                switch (s) 
                {
                    case "+":
                        st.push(a + b);
                        break;
                    case "-":
                        st.push(a - b);
                        break;
                    case "*":
                        st.push(a * b);
                        break;
                    case "/":
                        st.push((int)Math.floor((double)a / b));
                        break;
                    case "^":
                        st.push((int)Math.pow(a, b));
                        break;
                }

            } 
            else 
            {
                st.push(Integer.parseInt(s));
            }
        }
        return st.pop();
    }
}
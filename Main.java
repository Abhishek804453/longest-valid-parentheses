import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static int findLongest(String s) {

        Stack<Integer> st = new Stack<>();
        st.push(-1);

        int ans = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                st.push(i);
            } else {

                if (!st.isEmpty()) {
                    st.pop();
                }

                if (st.isEmpty()) {
                    st.push(i);
                } else {
                    int len = i - st.peek();
                    if (len > ans) {
                        ans = len;
                    }
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(findLongest(str));

        sc.close();
    }
}
// Last updated: 7/14/2026, 12:14:57 PM
import java.util.*;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> st = new Stack<>();

        for(int asteroid : asteroids) {

            boolean destroyed = false;


            while(!st.isEmpty() && st.peek() > 0 && asteroid < 0) {


                if(Math.abs(st.peek()) < Math.abs(asteroid)) {

                    // top asteroid destroyed
                    st.pop();

                }

                else if(Math.abs(st.peek()) == Math.abs(asteroid)) {

                    // both destroyed
                    st.pop();
                    destroyed = true;
                    break;

                }

                else {

                    // current asteroid destroyed
                    destroyed = true;
                    break;
                }
            }


            if(!destroyed) {

                st.push(asteroid);

            }
        }


        int[] ans = new int[st.size()];


        for(int i = 0; i < st.size(); i++) {

            ans[i] = st.get(i);

        }


        return ans;
    }
}
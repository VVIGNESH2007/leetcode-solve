// Last updated: 7/14/2026, 12:14:51 PM
class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Stack<Double> st=new Stack<>();
        int n=speed.length;
        int [][]cars=new int[n][2];
        for(int i=0;i<n;i++){
            cars[i][0]=position[i];
            cars[i][1]=speed[i];
        }
        Arrays.sort(cars,(a,b)->b[0]-a[0]);
        for(int[]car:cars){
            int pos=car[0];
            int sp=car[1];
            double time=(double)(target-pos)/sp;
            if(st.isEmpty()||st.peek()<time){
                st.push(time);
            }
        }
        return st.size();
    }
}
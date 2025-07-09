class Solution {
    public String smallestNumber(String s) {
        Stack<Integer> stack=new Stack<>();
        StringBuilder str=new StringBuilder();
        int x=1;
        int n=s.length();
        for(int i=0;i<=n;i++){
            stack.push(x++);
            if(i==n||s.charAt(i)=='I'){
                while(!stack.isEmpty()){
                    str.append(stack.pop());
                }
            }
        }
        return str.toString();
    }
}

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stac=new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='[' || ch=='{' || ch=='('){
                stac.push(ch);
            }
            else{
                if(stac.isEmpty()){
                    return false;
                }
                if((stac.peek()=='(' && ch==')') || (stac.peek()=='[' && ch==']')
                || (stac.peek()=='{' && ch=='}')){
                    stac.pop();
                }
                else{
                    return false;
                }
            }
        }
        return stac.isEmpty();
    }
}

class Solution {
    List<List<String>> list ;
    public List<List<String>> partition(String s) {
        list=new ArrayList<>();

        List<String> sublist = new ArrayList<>();
        

        function(sublist,s,0);

        return list;
    }

    public void function(List<String> sublist,String s,int ind){
        if(ind==s.length()){
            list.add(new ArrayList<>(sublist));
            return;
        }

        for(int i=ind;i<s.length();i++){

            if(isPalindrome(s.substring(ind,i+1))){
                sublist.add(s.substring(ind,i+1));
                function(sublist,s,i+1);
                sublist.remove(sublist.size()-1);
            }

        }
    }
        public boolean isPalindrome(String s){
            int i=0;
            int j=s.length()-1;

            while(i<j){
                if(s.charAt(i)!=s.charAt(j)){
                    return false;
                }
                i++;
                j--;
            }
            return true;
        }
    
}

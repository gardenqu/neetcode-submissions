class Solution {
    public boolean isAnagram(String s, String t) {


        if(s.length() != t.length()){
            return false; 
        }

        HashMap<String,Integer> hold= new HashMap<>(); 

        for (int i = 0; i < s.length(); i++) {
            String character = String.valueOf(s.charAt(i)); // Convert char to String
             if (!hold.containsKey(character)) {
                hold.put(character, 1);
         } else {
            int count = hold.get(character);
            hold.put(character, count + 1); // Fixing the increment logic too
        }
    }

    for(int n=0; n<t.length();n++){
         String character = String.valueOf(t.charAt(n));

         if(!hold.containsKey(character)){
            return false;

         }else if( hold.get(character)<1){
            return false;
         }else{

            int count = hold.get(character);
             hold.put(character, count -1);

            
         }
         

    }
return true;
       
    }
}

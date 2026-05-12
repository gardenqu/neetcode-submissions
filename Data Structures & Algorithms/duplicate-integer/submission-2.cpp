
#include <map>
using namespace std;

class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {

        set<int> hold; 

        for (auto it:nums){
            if(hold.find(it)!= hold.end()){
                return true;
            }else{
                hold.insert(it);
            }
        }
        return false;
        
    }
};
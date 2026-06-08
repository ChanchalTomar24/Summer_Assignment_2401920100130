class Solution {
public:
    bool canConstruct(string ransomNote, string magazine) {

        for(char ch : ransomNote) {

            int pos = magazine.find(ch);

            if(pos == string::npos)
                return false;

            magazine.erase(pos, 1);
        }

        return true;
    }
};
class Solution(object):
    def lengthOfLastWord(self, s): 
        new = ""
        for i in range(len(s)-1,-1,-1):
            if(s[i] == " " and len(new) > 0):
                break
            if(s[i] != " "):
                new = new + s[i]
        return len(new)

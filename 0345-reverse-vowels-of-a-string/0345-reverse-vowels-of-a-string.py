class Solution(object):
    def reverseVowels(self, s):
        list = []
        for i in s:
            if (i == 'a' or i == 'e' or i == 'i' or i == 'o' or i == 'u' or i == 'A' or i == 'E' or i == 'I' or i == 'O' or i == 'U'):
                list.insert(0,i)
        n=0
        #print(list)
        new = ""
        for i in s:
            if (i == 'a' or i == 'e' or i == 'i' or i == 'o' or i == 'u' or i == 'A' or i == 'E' or i == 'I' or i == 'O' or i == 'U'):
                new += list[n]
                n+=1
            else:
                new += i
        
        return new



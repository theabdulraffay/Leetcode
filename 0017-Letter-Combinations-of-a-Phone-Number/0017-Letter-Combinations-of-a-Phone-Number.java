class Solution {
    static List<String> LetterCombinationsofaPhoneNumberList(String newString, String s) {
		if (s.isEmpty()) {
			  List<String> newstr = new ArrayList<String>();
        if(newString.isEmpty()) return newstr;
			  newstr.add(newString);
			  return newstr;
		}
		int first = Integer.parseInt(s.substring(0, 1));
		int rotations = 3;
		if (first == 7 || first == 9) {
			rotations = 4;
		}
    int c = 0;
    if(first > 7)c= 1;
		first = (first - 2) * 3;
		List<String> list = new ArrayList<String>();
		for(int i = 0; i < rotations; i++) {
			char temp = (char)('a' + first + i + c);
			List<String> returned = LetterCombinationsofaPhoneNumberList(newString + temp, s.substring(1));
			list.addAll(returned);
		}
		return list;
	}
    public List<String> letterCombinations(String digits) {
        return LetterCombinationsofaPhoneNumberList("", digits);
        
    }
}

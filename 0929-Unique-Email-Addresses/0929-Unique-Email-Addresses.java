class Solution {
    public int numUniqueEmails(String[] emails) {
        String[] temp = new String[emails.length];
		int count = 0;
		for(String i : emails) {
			int n = i.indexOf('@');
			String local = i.substring(0,n);
			String newstring = "";
			for(int j = 0;j<local.length();j++){
				if(local.charAt(j) == '.'){
					continue;
				}
				else if(local.charAt(j) == '+'){
					break;
				}
				else newstring += local.charAt(j);
			}
			String str = newstring + i.substring(n,i.length());
			temp[count++] = str;
		}
		Arrays.sort(temp);
		count = 1;
		for(int i = 0; i < temp.length -1 ; i++){
			if(!temp[i].equals(temp[i+1])){
				count++;
			}


		}
        return count;

        
    }
}

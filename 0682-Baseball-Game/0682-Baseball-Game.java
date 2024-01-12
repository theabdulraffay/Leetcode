class Solution {
    public int calPoints(String[] operations) {
    ArrayList<Integer> scores = new ArrayList<>();

		for(String i : operations) {
			switch(i){
			case "C": scores.remove(scores.size() - 1);break;
			case "D": scores.add(2 * scores.get(scores.size() - 1));break;
			case "+": scores.add(scores.get(scores.size() - 1) + scores.get(scores.size() - 2));break;
			default : scores.add(Integer.parseInt(i));
			}
		}
		int sum = 0;
		for(int i : scores) {
			sum += i;
		}
        return sum;
        
    }
}

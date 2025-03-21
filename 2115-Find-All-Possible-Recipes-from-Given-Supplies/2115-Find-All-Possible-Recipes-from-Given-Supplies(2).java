class Solution {
    boolean helper(List<String> ing, HashSet<String> set) {
        for(String i : ing) {
            if(!set.contains(i)) return false;
        }

        return true;
    }
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        List<String> toret = new ArrayList<>();
        HashSet<String> set = new HashSet<>(Arrays.asList(supplies));
        HashSet<String> set2 = new HashSet<>();
        // for(String i : supplies) set.add(i);


        int n = recipes.length;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(helper(ingredients.get(j), set)) {
                    set.add(recipes[j]);
                    set2.add(recipes[j]);
                }
            }
        }

        return new ArrayList<>(set2);


    }
}

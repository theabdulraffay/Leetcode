class Solution {

    boolean BFS(HashSet<String> set, List<String> ing, String recipe, HashMap<String, Boolean> map, HashMap<String, List<String>> list, HashSet<String> visited) {
        if (map.containsKey(recipe)) return map.get(recipe);
        if (visited.contains(recipe)) return false;
        visited.add(recipe);
        if (!list.containsKey(recipe)) {
            map.put(recipe, false);
            return false;
        }

        for (String i : ing) {
            if (!set.contains(i)) {
                if (BFS(set, list.get(i), i, map, list, visited)) {
                    set.add(i);
                } else {
                    map.put(recipe, false);
                    return false;
                }

            }
        }

        map.put(recipe, true);
        set.add(recipe);
        return true;
    }

    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        HashMap<String, Boolean> visited = new HashMap<>();
        HashMap<String, List<String>> ing = new HashMap<>();
        for (int i = 0; i < recipes.length; i++) {
            ing.put(recipes[i], ingredients.get(i));
        }
        HashSet<String> set = new HashSet<>(Arrays.asList(supplies));
        HashSet<String> set2 = new HashSet<>();
        List<String> toret = new ArrayList<>();

        for (int i = 0; i < recipes.length; i++) {
            if (BFS(set, ingredients.get(i), recipes[i], visited, ing, set2)) {
                toret.add(recipes[i]);
            }
        }

        return toret;

    }
}

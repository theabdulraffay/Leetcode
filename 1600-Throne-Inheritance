class ThroneInheritance {
    HashSet<String> death = new HashSet<>();
    HashMap<String, List<String>> tree = new HashMap<>();
    String name;

    public ThroneInheritance(String kingName) {
        name = kingName;
    }
    
    public void birth(String parentName, String childName) {
        if(!tree.containsKey(parentName)) {
            tree.put(parentName, new ArrayList<>());
        }
        tree.get(parentName).add(childName);

    }
    
    public void death(String name) {
        death.add(name);
        
    }

    public List<String> getInheritanceOrder() {
         List<String> inheritanceOrder = new ArrayList<>();
        Stack<String> stack = new Stack<>();
        stack.push(name);

        while (!stack.isEmpty()) {
            String person = stack.pop();
            if (!death.contains(person)) {
                inheritanceOrder.add(person);
            }

            List<String> children = tree.getOrDefault(person, new ArrayList<>());
            for (int i = children.size() - 1; i >= 0; i--) {
                stack.push(children.get(i));
            }
        }

        return inheritanceOrder;
    }
}

/**
 * Your ThroneInheritance object will be instantiated and called as such:
 * ThroneInheritance obj = new ThroneInheritance(kingName);
 * obj.birth(parentName,childName);
 * obj.death(name);
 * List<String> param_3 = obj.getInheritanceOrder();
 */

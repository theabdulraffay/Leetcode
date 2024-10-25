class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        List<String> list = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        for (String s : folder) {
            int index = s.indexOf('/', 1);
            int i = 0;
            boolean toadd = true;
            String temp = "";
            while (index != -1) {
                temp += s.substring(i, index);
                if(set.contains(temp)) {
                    toadd = false;
                    break;
                }
                i = index;
                index = s.indexOf('/', index + 1);
            }
            set.add(s);

            if(toadd) {
                list.add(s);
            }

        }
        return list;

    }
}

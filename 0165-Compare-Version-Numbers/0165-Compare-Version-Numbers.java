class Solution {
    public int compareVersion(String version1, String version2) {
        String[] arrV1 = version1.split("\\.");
        String[] arrV2 = version2.split("\\.");

        int n = arrV1.length;
        int m = arrV2.length;
        int i = 0;
        for (i = 0; i < n && i < m; i++) {
            int v1 = Integer.parseInt(arrV1[i]);
            int v2 = Integer.parseInt(arrV2[i]);
            if(v1 < v2) { return -1; } 
            else if (v1 > v2) { return 1; }
        }
        while (i < n) if(Integer.parseInt(arrV1[i++]) > 0) return 1;

        while (i < m) if(Integer.parseInt(arrV2[i++]) > 0) return -1;

        return 0;
    }
}

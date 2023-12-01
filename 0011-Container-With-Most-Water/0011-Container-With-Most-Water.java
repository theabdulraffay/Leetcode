class Solution {
    public static int maxArea(int[] height) {
        int start = 0;
        int end = height.length-1;
        int max = 0;

        while(start < end){
        	int width = end - start;
        	int lambai = Math.min(height[start], height[end]);
            int prod = width * lambai;
            if(max<prod){
                max = prod;
            }

            if(height[start] < height[end]){
            	start++;
            }
            else{
            	end--;
            }
            

        }






        // for(int i = 0;i<height.length-1;i++){
        // 	for(int j = i+1;j<height.length;j++){
        // 		int width = j - i;
        // 		int lambai = Math.min(height[i], height[j]);
        //     	int prod = width * lambai;
        //     	if(max < prod){
        //         max = prod;
        //     	}

        // 	}
        // }
        
        return max;

        
    }
}

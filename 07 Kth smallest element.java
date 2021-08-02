class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        PriorityQueue<Integer> mxhp=new PriorityQueue<Integer>(k+1,Collections.reverseOrder());
        for(int num: arr){
            mxhp.add(num);
            if(mxhp.size()>k)
                mxhp.poll();
        }
        return mxhp.poll();
    }
}

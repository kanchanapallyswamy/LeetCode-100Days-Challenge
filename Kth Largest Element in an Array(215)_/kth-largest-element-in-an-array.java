class Solution {
    public int findKthLargest(int[] a, int k) {
        int size = a.length;
        build_heap(a,size);
        int ans = -1;
        while(k-->0){
            ans = a[0];
            a[0]=a[size-1];
            size--;
            heapify(a,0,size);
        }
        return ans;
    }
 void heapify(int a[], int bdx,int n){
        int mx=bdx;
        int lci=2*mx+1;
        int rci=2*mx+2;
        if(lci<n && a[lci]>a[mx])mx=lci;
        if(rci<n && a[rci]>a[mx])mx=rci;
        if(mx==bdx)return;
        swap(a,bdx,mx);
        heapify(a,mx,n);
    }
    void swap(int a[],int f,int s){
        int t=a[f];
        a[f]=a[s];
        a[s]=t;
    }
    void  build_heap(int a[], int n){
        for(int i=n/2-1;i>=0;i--){
            heapify(a,i,n);
        }
    }
}

class LeftIndex{ 

    static int leftIndex(int N, int arr[], int X)
    {
       
      int start = 0, end = N-1;
      while(start<=end) {
          int mid = (start+end)/2;
          if(arr[mid]>X) {
              end = mid-1;
          }
          else if(arr[mid]<X) {
              start = mid+1;
          }
          else {
              if(mid==0||arr[mid-1]!=arr[mid]) {
                  return mid;
              }
              else {
                  end = mid-1;
              }
          }
      }
       return -1;
   
    }
}

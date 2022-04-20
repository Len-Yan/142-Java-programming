public class fuck{
  

//public int maxSpan(int[] nums) {
//  int i = 0;
//  int max = 0;
// 
//  int l = nums.length;
//  
//  for (i=0; i<l; i++) {
//  
//    System.out.println(i);
//    for (;l > i + max; l--){
//    //   System.out.println("  l    " + l);
//       System.out.println("   "  + i);
//      if (nums[i] == nums[l-1]){
//        max = l -i;}}}
//  
//
//  return max;
//  
//}
  
  
  public int maxSpan(int[] nums) {
    if (nums.length > 0) {
        int maxSpan = 1;
        for (int i = 0; i < nums.length; i++)
            for (int j = nums.length - 1; j > i; j--)
                if (nums[j] == nums[i]) {
                    int count = (j - i) + 1;
                    if (count > maxSpan) maxSpan = count;
                    break;
                }
        return maxSpan;
    } else return 0;
}
  
  
  
  
 public static void main(String[] args) {
   fuck a = new fuck();
   int[] c = {1, 4, 2, 1, 4, 4, 4};
   a.maxSpan(c);
   System.out.print(a.maxSpan(c));
 }
}

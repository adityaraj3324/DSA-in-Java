package arrays;
public class PrefixSum{
    public static int[] prefixsum(int a[]){
        int pre[]=new int[a.length];
        pre[0]=a[0];
        for(int i=1;i<a.length;i++){
           pre[i]=pre[i-1]+a[i];

        }
        return pre;
    }
    public static void display(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static int[] withoutextraspace(int a[]){
        a[0]=a[0];
         for(int i=1;i<a.length;i++){
            a[i]=a[i-1]+a[i];

        }
        return a;
    }
    public static void main(String[] args){
        int a[]={1,2,3,4,5};
      //  int pre[]=prefixsum(a);
      int pre[]=withoutextraspace(a);
        display(pre);
    }
}
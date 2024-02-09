public class adding2array {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int f[] ={2,3,4,5,6};
        int h[] = new int[a.length + f.length];
        for (int i = 0;i<a.length;i++){
         h[i]=a[i];
        }
        for (int i=0;i<f.length;i++){
            h[a.length+i]=f[i];
        }
        for (int i:h){
            System.out.println(i);
        }
    }
}

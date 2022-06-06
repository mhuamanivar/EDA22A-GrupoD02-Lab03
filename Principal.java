package Pilas;
import java.util.Arrays;

public class Principal {
    //funcion que calcula maxima altura en comun
    static int equalStacks(int[] h1,int[] h2, int[] h3){
        int l1=h1.length-1;
        int l2=h2.length-1;
        int l3=h3.length-1;
        int t1=Arrays.stream(h1).sum();
        int t2=Arrays.stream(h2).sum();
        int t3=Arrays.stream(h3).sum();
        
        while (t1!=t2&&t1!=t3) {
            if (t1>t2) {
                if (t1>t3) {
                    t1-=h1[l1--];
                } else {
                    t3-=h3[l3--];
                }
            } else {
                if (t2>t3) {
                    t2-=h2[l2--];
                } else {
                    t3-=h3[l3--];
                }
            }
        }
        return t1;
    }
    
    
    public static void main(String[] args)
    {
        int[] h1={1,1,1,2,3};
        int[] h2={2,3,4};
        int[] h3={1,4,1,1};
        int a=equalStacks(h1,h2,h3);
        System.out.println(a);
    }
}

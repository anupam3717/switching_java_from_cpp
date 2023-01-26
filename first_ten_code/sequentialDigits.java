
import java.util.*;

class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
     Queue<Integer> q= new LinkedList<>();
        for(int i=1;i<10;i++)q.add(i);
        List<Integer> l=new ArrayList();
        while(!q.isEmpty()){
            int x=q.remove();
            if(x>=low && x<=high)l.add(x);
            if(x%10==9)continue;
            int f=(x*10)+(x%10)+1;
            q.add(f);
        }
        return l;
    }
}
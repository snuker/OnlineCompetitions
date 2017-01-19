

import java.util.HashMap;
import java.util.Scanner;

class interval{
    boolean even;
    public int from;
    public int to;
    public interval(int a,int b, boolean c){
        even=c;
        from=a;
        to=b;
    }
}

public class Timus1003 {

    public static HashMap<Integer,interval> tbl;
    public Timus1003(){
        tbl=new HashMap<>();

    }
    public void clear(){
        tbl.clear();
    }
    public boolean add(interval x){
        if (!tbl.containsKey(x.to)){
            tbl.put(x.to,x);
            return true;
        }
        interval old =tbl.get(x.to);
        if (x.from==old.from){
            return x.even==old.even;
        }
        boolean prev_bf=(x.even==old.even);

        if (x.from> old.from){
            return add(new interval(old.from,x.from-1,prev_bf));
        }
        return add(new interval(x.from,old.from-1,prev_bf));
    }
    public static void main(String[] args) {
        Timus1003 m = new Timus1003();
        Scanner sc=new Scanner(System.in);

        int to,from;
        boolean even;

        int sz;
        while ((sz=sc.nextInt())!=-1) {
            sc.nextLine();
            int cnt = sc.nextInt();
            sc.nextLine();
            int pos=0;
            tbl.clear();
            while (cnt > 0) {
                from =sc.nextInt();
                to = sc.nextInt();
                String s=sc.nextLine();

                even = s.equals(" even");
                if (m.add(new interval(from, to, even)))
                    pos++;
                else {
                    cnt--;
                    while (cnt>0){
                        sc.nextLine();
                        cnt--;
                    }
                    break;

                }
                cnt--;


            }
            System.out.println(pos);
        }




                    }
                    }

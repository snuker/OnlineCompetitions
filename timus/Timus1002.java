package org.snuker;

import java.io.StreamTokenizer;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by snuker on 18.01.17.
 */
public class Timus1002 {
    static char[] table;
    public static String convert(String src){
        StringBuilder res=new StringBuilder();
        for (char c:src.toCharArray())
            res.append(table[c]);
        return res.toString();
    }
    public static void init_table(){
        table =new char[256];
        table['i']=table['j']='1';
        table['a']=table['b']=table['c']='2';
        table['d']=table['e']=table['f']='3';
        table['g']=table['h']='4';
        table['k']=table['l']='5';
        table['m']=table['n']='6';
        table['p']=table['r']=table['s']='7';
        table['t']=table['u']=table['v']='8';
        table['w']=table['x']=table['y']='9';
        table['o']=table['q']=table['z']='0';
    }
    public static void main(String[] args) {
        init_table();
        String[] words;
        String[] converted;
        int dp[]=new int[250];
        int lens[];
        Scanner sc = new Scanner(System.in);
        String num;
        while (!(num=sc.nextLine()).equals("-1")){
        int num_len=num.length();


        for (int i=0;i<=num_len;i++)
            dp[i]=1<<10;
        int n_words;
        int[] res =new int[255];
        dp[0]=0;
            n_words=sc.nextInt();
            sc.nextLine();
            words = new String[n_words];
            converted = new String[n_words];
            lens = new int[n_words];
            for (int i = 0; i < n_words; i++) {
                String s=sc.nextLine();
                if (s.length()==0){
                    i--;
                    continue;
                }
                words[i] = s;
                converted[i] = convert(words[i]);
                lens[i] = words[i].length();
            }
            for (int i = 0; i < num.length(); i++) {
                for (int j = 0; j < words.length; j++) {

                    try {
                    if (i+lens[j]<=num_len&&num.substring(i,i+ lens[j]).equals(converted[j]) && dp[i] + 1 < dp[i + lens[j]]) {
                        dp[i + lens[j]] = dp[i] + 1;
                        res[i + lens[j]] = j;

                    }} catch (Exception e){
                        char x;
                    }



                }}

            if (dp[num.length()]==1<<10) {
                System.out.println("No solution.");
                continue;
            }
            int x=num.length();
            LinkedList<String> res_words=new LinkedList();
            while (x>0) {
                res_words.addFirst(words[res[x]]);
                x-=lens[res[x]];

            }
            for (String s:res_words) {
                System.out.print(s+" ");
            }
            System.out.println();
        }


        }

    }


import java.util.*;
import java.lang.*;

public class Graph {

    //-----------------------------------------SAM HATEM--------------------------------------------------
        public int n;
        public ArrayList<ArrayList<Integer>> AA  ;
        public String[] state;
        public int[] dfs_num;
        public int[] dfs_finish;
        public int[] comp;
        public int dfs_count;
        public int finish_count;
        public Stack<Integer> Ostack;
        public Stack<Integer> Rstack;

        // Default constructor
        public Graph(int s) {

            state = new String[s];
            dfs_num = new int[s];
            dfs_finish = new int [s];
            comp = new int[s];
            this.AA = new ArrayList<>();
             for (int i = 0; i <s; i++) {
                 AA.add(new ArrayList<>());
                 state[i] = "new";
                 dfs_num[i] = -1;
                 comp[i] = -1;
                 finish_count=1;
                 //-----------------------------------------CEDRA REEDAN--------------------------------------------------
             }
            this.dfs_count = 1;
            this.Ostack = new Stack<>();
            this.Rstack = new Stack<>();
        }


        public void setState (int i, String x){
         state[i]= x;
            }
        public String fetchState (int q){
         return (this.state [q]);
             }

         public void addEdge(int s ,int d) {
            this.AA.get(s).add(d);
              }

 }

public class DFS {

    //-----------------------------------------SOHA AL-KHATIB--------------------------------------------------
    public int [][] TE ;
    public int [][] BE ;
    int [] parent ;
    boolean visited [];

    void addTE (int i, int j) { this.TE = new int [i][j];}
    void addBE (int i, int j) { this.BE = new int [i][j];}



    public void activate(Graph g, int i) {
        g.setState(i, "active");
        this.parent = new int [g.AA.size()];
        g.dfs_num[i] = g.dfs_count;
        g.dfs_count++;
        g.finish_count = 0;
        g.Ostack.push(i);
        g.Rstack.push(i);
        //-----------------------------------------LOUJAIN SAIMOUAH & AMER AZIZ--------------------------------------------------
        for (int j = 0; j < g.AA.get(i).size(); j++) {

            if (g.fetchState(g.AA.get(i).get(j)).equals("new")) {
                this.parent [g.AA.get(i).get(j)]=i;
                this.addTE(i, g.AA.get(i).get(j));
                this.activate(g, g.AA.get(i).get(j));
            } else if (g.Ostack.contains(g.AA.get(i).get(j))) {
                while (g.dfs_num[g.AA.get(i).get(j)] < g.dfs_num[g.Rstack.peek()])
                    g.Rstack.pop();
            } else if (g.dfs_num[g.AA.get(i).get(j)] < g.dfs_finish[i] && g.dfs_finish[g.AA.get(i).get(j)]< g.dfs_finish[i]) {
                this.addBE(i, g.AA.get(i).get(j));
            }


        }
        g.setState(i, "finished");
        g.dfs_finish[i]= g.finish_count;
        g.finish_count++;
        if (!g.Rstack.isEmpty()) {
            if (i == g.Rstack.peek()) {
                g.Rstack.pop();
                int xx = -100;
                while (xx != i) {
                    xx = g.Ostack.peek();
                    g.Ostack.pop();
                    g.comp[xx] = i;
                }
            }

        }
    }
}






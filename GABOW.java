public class GABOW {
    //-----------------------------------------JOUDY AZIZ & DIALA ALRHAIAH--------------------------------------------------

    public static void GAB(Graph am) {
        {
            DFS z = new DFS();
            for (int i = 0; i < am.AA.size(); i++) {
                if (am.fetchState(i) == "new")
               z.activate (am,i);

            }
        }

    }
}




public static void main(String[] args) {                                                                      
                                                                                                              
    //participants' names will be written throughtout the code.                                               
                                                                                                              
    /*                                                                                                        
    MEMBERS WHO PARTICIPATED:                                                                                 
    MOUHAMMED ESIKREAH                                                                                        
    MOUHAMMED ESIKREAH                                                                                        
    SAM HATEM                                                                                                 
    CEDRA REEDAN                                                                                              
    JOUDY AZIZ                                                                                                
    SOHA AL-KHATIB                                                                                            
    LOUJAIN SAIMOUAH                                                                                          
    AMER AZIZ                                                                                                 
    SARA DOWARAH                                                                                              
    DIALA ALRHAIAH                                                                                            
    MOHAMMED MOLAZM                                                                                           
     */                                                                                                       
                                                                                                              
    //the code accepts a non-weighted directed graph consisting of 2 or more vertices.                        
    //each edge must be manually inserted.                                                                    
    //the code has no direct user input methods (scanners) ,so use Graph methods in main for input.           
    //code has been written and tested on intelliJ IDEA Community Edition 2024.1.2.                           
    //SDK used : 22 Oracle OpenJDK 22.0.1.                                                                    
                                                                                                              
                                                                                                              
    //-----------------------------------------MOUHAMMED ESIKREAH & MOHAMMAD ABO KANOON-----------------------
    Graph test = new Graph(9);                                                                                
                                                                                                              
    test.addEdge(0, 1);                                                                                       
    test.addEdge(1, 2);                                                                                       
    test.addEdge(2, 0);                                                                                       
    test.addEdge(3, 0);                                                                                       
    test.addEdge(6, 3);                                                                                       
    test.addEdge(5, 6);                                                                                       
    test.addEdge(4, 5);                                                                                       
    test.addEdge(3, 4);                                                                                       
    test.addEdge(7, 6);                                                                                       
    test.addEdge(7, 8);                                                                                       
    test.addEdge(8, 7);                                                                                       
                                                                                                              
                                                                                                              
    for (int i = 0; i < test.AA.size(); i++) {                                                                
        System.out.print(i + ":");                                                                            
        for (int j = 0; j < test.AA.get(i).size(); j++) {                                                     
            System.out.print(test.AA.get(i).get(j));}                                                         
        System.out.println();}                                                                                
                                                                                                              
    for (int l =0; l < 9 ; l++){                                                                              
        System.out.print(test.fetchState(l));                                                                 
        System.out.println();}                                                                                
                                                                                                              
                                                                                                              
                                                                                                              
    GABOW.GAB (test);                                                                                         
    for (int i = 0; i < test.AA.size(); i++) {                                                                
        System.out.println("vertix "+i+" is from component :"+test.comp[i]); }                                
                                                                                                              
                                                                                                              
                                                                                                              
}                                                                                                             
                                                                                                              
                                                                                                              
                                                                                                              
                                                                                                              
                                                                                                              
                                                                                                              

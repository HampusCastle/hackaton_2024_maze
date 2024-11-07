package org.example;

import org.example.Configuration.ApplicationInitializer;
import org.example.Configuration.RunApplication;

public class Main {

/*#####################################################################################

                            VÄLKOMMEN TILL LABYRINTEN

        Uppgiften här är att lösa vardera labyrint, hur ni gör det är upp till er.
    NI KOMMER INTE ATT SKRIVA KODEN HÄR, utan i MazeSolver, inom de angivna metoderna.
                        Som bor i paketet som heter Solution
            Om ni känner att mer behövs, kör på - inget hindrar er här.
            MÅLET ÄR: ta er från punkt A till punkt B, dvs från 2 till 3
             Ni har fyra labyrinter ni ska ta er igenom, lycka till...


                    DET FINNS VISSA REGLER SOM NI MÅSTE FÖLJA:
                         Ni kan inte gå igenom väggar
                       Ni måste börja vid 2 och sluta på 3

                När ni är klara kör ni testerna för att se hur det gick
            Vi föredrar en smart lösning över att alla tester har passerat

                    2 - Representerar startpunkten (GRÖN)
                    1 - Representerar väggar (GRÅ)
                    0 - Representerar utrymmen ni kan gå genom (VIT)
                    3 - Representerar slutet på labyrinten (RÖD)

                                 HAPPY CODING!
#####################################################################################*/


    public static void main(String[] args) {

        RunApplication runApplication = ApplicationInitializer.initializeApplication();
        runApplication.run();
    }
}
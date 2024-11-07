package org.example.Model;


/*#####################################################################################

                           VÄLKOMMEN TILL LABYRINTEN

        Uppgiften här är att lösa vardera labyrint, hur ni gör det är upp till er.
    NI KOMMER INTE ATT SKRIVA KODEN HÄR, utan i MazeSolver, inom de angivna metoderna.
            Om ni känner att mer behövs, kör på - inget hindrar er här.
        Ni kommer behöva ta er från punkt A till punkt B, dvs från 2 till 3
            Ni har fyra labyrinter ni ska ta er igenom, lycka till...


                    DET FINNS VISSA REGLER SOM NI MÅSTE FÖLJA:
                         Ni kan inte gå igenom väggar
                       Ni måste börja vid 2 och sluta på 3


                    2 - Representerar startpunkten
                    1 - Representerar väggar
                    0 - Representerar utrymmen ni kan gå genom
                    3 - Representerar slutet på labyrinten

                                 HAPPY CODING!
#####################################################################################*/


import lombok.Getter;

@Getter
public class Maze {


        public static int[][] getFirstMaze() {
                return new int[][] {
                        {2, 0, 1, 1, 1},
                        {1, 0, 1, 1, 1},
                        {1, 0, 0, 0, 1},
                        {1, 1, 1, 0, 1},
                        {1, 1, 1, 0, 3}
                };
        }

        public static int[][] getSecondMaze() {
                return new int[][] {
                        {2, 0, 1, 1, 1},
                        {1, 0, 0, 1, 1},
                        {1, 1, 0, 0, 1},
                        {1, 1, 1, 0, 0},
                        {1, 1, 1, 1, 3}
                };
        }

        public static int[][] getThirdMaze() {
                return new int[][] {
                        {2, 0, 0, 0, 1},
                        {1, 1, 1, 0, 1},
                        {1, 1, 1, 0, 0},
                        {1, 1, 1, 1, 0},
                        {1, 1, 1, 1, 3}
                };
        }

        public static int[][] getFourthMaze() {
                return new int[][] {
                        {2, 0, 1, 1, 1, 1, 1},
                        {1, 0, 1, 1, 1, 1, 1},
                        {1, 0, 1, 0, 0, 0, 1},
                        {1, 0, 1, 0, 1, 0, 1},
                        {1, 0, 1, 0, 1, 0, 1},
                        {1, 0, 0, 0, 1, 0, 1},
                        {1, 1, 1, 1, 1, 0, 3}
                };
        }

        public static int[][] getSampleMaze() {
                return new int[][] {
                        {2, 0, 1, 1, 1},
                        {1, 0, 1, 0, 1},
                        {1, 0, 1, 0, 1},
                        {0, 0, 0, 0, 1},
                        {1, 1, 1, 0, 3}
                };
        }

        public static int[][] getSampleMazeTwo() {
                return new int[][] {
                        {1, 1, 1, 1, 1},
                        {1, 1, 1, 0, 1},
                        {1, 0, 0, 0, 1},
                        {0, 0, 1, 0, 1},
                        {1, 1, 1, 0, 3}
                };
        }

        public static int[][] getSampleMazeThree() {
                return new int[][] {
                        {1, 1, 1, 1, 1},
                        {1, 1, 1, 0, 1},
                        {1, 2, 0, 0, 1},
                        {0, 0, 1, 0, 1},
                        {1, 1, 1, 0, 3}
                };
        }

        public static int[][] getInsaneMaze() {
                return new int[][] {
                        {2, 0, 1, 1, 1, 1, 1, 1, 1},
                        {1, 0, 1, 0, 0, 0, 1, 1, 1},
                        {1, 0, 1, 0, 1, 0, 1, 1, 1},
                        {1, 0, 0, 0, 1, 0, 1, 1, 1},
                        {1, 1, 1, 1, 1, 0, 1, 1, 1},
                        {1, 1, 1, 1, 1, 0, 1, 1, 1},
                        {1, 1, 1, 1, 1, 0, 0, 0, 1},
                        {1, 1, 1, 1, 1, 1, 1, 0, 0},
                        {1, 1, 1, 1, 1, 1, 1, 1, 3}
                };
        }

        public static int[][] getInsaneTwoMaze() {
                return new int[][] {
                        {2, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1},
                        {1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1},
                        {1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1},
                        {1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1},
                        {1, 1, 1, 0, 1, 0, 0, 0, 1, 0, 1, 1},
                        {1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1},
                        {1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 0, 0},
                        {1, 0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 0},
                        {1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0},
                        {1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1},
                        {1, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 3}
                };
        }

        public static int[][] getInsaneThreeMaze() {
                return new int[][] {
                        {2, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1},
                        {1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1},
                        {1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1},
                        {0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1},
                        {1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1},
                        {1, 1, 1, 0, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 1},
                        {1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1},
                        {1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0},
                        {1, 0, 0, 1, 0, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1},
                        {1, 1, 0, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1},
                        {1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1},
                        {1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1, 0, 0, 0},
                        {1, 1, 0, 1, 1, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0},
                        {1, 1, 0, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 0},
                        {1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 3}
                };
        }
}

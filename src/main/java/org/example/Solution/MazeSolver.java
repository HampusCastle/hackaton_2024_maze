package org.example.Solution;

import lombok.Getter;
import org.example.Model.Node;

import java.util.*;

/* =============================================================

    HÄR SKRIVER NI KODEN FÖR LÖSNINGEN -

    OBS DÖP EJ OM DESSA METODER:
    isValidMove
    solveTheMaze
    traverseTheMaze

  =============================================================  */



public class MazeSolver {


    private final int[][] maze;                     // 2D array för labyrinten, y and x koordinater
    private final int rows;                         // hur djup är labyrinten?
    private final int columns;                      // hur bred är labyrinten?
    @Getter private final List<Node> visitedNodes;  // Lagrar vägarna ni tar i labyrinten


    public MazeSolver(int[][] maze) {
        this.maze = maze;                            // lagrar labyrinten
        this.rows = maze.length;                     // Sparar djupet av labyrinten
        this.columns = maze[0].length;               // Sparar bredden av labyrinten
        this.visitedNodes = new ArrayList<>();       // initierar en ny arrayList
    }



    public boolean isValidMove(int row, int column) { // checking if valid move, else return false

    }


    public boolean traverseTheMaze(int row, int column, boolean[][] visited) {

    }


    public boolean solveTheMaze() {


    }



    private void visualizePath() {                      // to visualize the path taken when traversing the maze

    }

}

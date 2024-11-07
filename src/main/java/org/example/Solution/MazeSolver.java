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
    @Getter private final List<Node> visitedNodes;


    public MazeSolver(int[][] maze) {
        this.maze = maze;                            // lagrar labyrinten
        this.rows = maze.length;                     // Sparar djupet av labyrinten
        this.columns = maze[0].length;               // Sparar bredden av labyrinten
        this.visitedNodes = new ArrayList<>();       // initierar en ny arrayList
    }



    public boolean isValidMove(int row, int column) { // checking if valid move, else return false
        return true;
    }


    public boolean traverseTheMaze(int row, int column, boolean[][] visited) {
        return true;
    }


    public boolean solveTheMaze() {
        visualizePath();
        return true;
    }



    private void visualizePath() {
        char[][] pathMaze = new char[rows][columns];


        for (Node node : visitedNodes) {
            int row = node.getRow();
            int column = node.getColumn();
            pathMaze[row][column] = 'X';
        }


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(pathMaze[i][j] == 'X' ? 'X' : ' ');
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}



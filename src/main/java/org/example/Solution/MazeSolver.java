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
    @Getter
    private final List<Node> visitedNodes;


    public MazeSolver(int[][] maze) {
        this.maze = maze;                            // lagrar labyrinten
        this.rows = maze.length;                     // Sparar djupet av labyrinten
        this.columns = maze[0].length;               // Sparar bredden av labyrinten
        this.visitedNodes = new ArrayList<>();       // initierar en ny arrayList
    }

    public boolean isValidMove(int row, int column, boolean[][] visited) {
        return row >= 0 && row < rows && column >= 0 && column < columns
                && maze[row][column] != 1 && !visited[row][column];
    }

    public boolean traverseTheMaze(int row, int column, boolean[][] visited) {
        if (!isValidMove(row, column, visited)) {
            return false;
        }
        if (maze[row][column] == 3) {
            visited[row][column] = true;
            visitedNodes.add(new Node(row, column, 3));
            return true;
        }
        visited[row][column] = true;
        visitedNodes.add(new Node(row, column, 0));

        if (traverseTheMaze(row - 1, column, visited)
                || traverseTheMaze(row + 1, column, visited)
                || traverseTheMaze(row, column - 1, visited)
                || traverseTheMaze(row, column + 1, visited)) {
            return true;
        }
        visited[row][column] = false;
        visitedNodes.remove(visitedNodes.size() - 1);
        return false;
    }


    public boolean solveTheMaze() {
        Node startNode = findStart();
        boolean[][] visited = new boolean[rows][columns];

        if (traverseTheMaze(startNode.getRow(), startNode.getColumn(), visited)) {
            visualizePath();
            return true;
        } else {
            return false;
        }
    }
    private Node findStart() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (maze[i][j] == 2) {
                    return new Node(i, j, 2);
                }
            }
        }
        return null;
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



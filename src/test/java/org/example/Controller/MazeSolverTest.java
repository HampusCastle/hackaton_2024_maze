package org.example.Controller;

import org.example.Model.Maze;
import org.example.Model.Node;
import org.example.Solution.MazeSolver;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


// hitta ett sätt att trigga en OK om alla test är körda och klara? Därifrån trigga API call?


class MazeSolverTest {

    private int[][] getFirstMaze() {
        return new int[][] {
                {2, 0, 1, 1, 1},
                {1, 0, 1, 1, 1},
                {1, 0, 0, 0, 1},
                {1, 1, 1, 0, 1},
                {1, 1, 1, 0, 3}
        };
    }

    private int[][] getSampleMaze() {
        return new int[][] {
                {2, 0, 1, 1, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 1, 0, 1},
                {0, 0, 0, 0, 1},
                {1, 1, 1, 0, 3}
        };
    }

    private int[][] getSampleTwoMaze() {
        return new int[][] {
                {1, 1, 1, 1, 1},
                {1, 1, 1, 0, 1},
                {1, 0, 0, 0, 1},
                {0, 0, 1, 0, 1},
                {1, 1, 1, 0, 3}
        };
    }


    private boolean mazeSolverValidMove(int[][] maze,int row, int column){
        return new MazeSolver(maze).isValidMove(row, column);
    }


    private MazeSolver generateMazeSolver(int[][] maze) {
        return new MazeSolver(maze);
    }


    private List<Node> solvingMazeAndGetVisitedNodes(int[][] maze) {
        MazeSolver mazeSolver = generateMazeSolver(maze);
        mazeSolver.solveTheMaze();
        return mazeSolver.getVisitedNodes();
    }


    private void assertAlgorithmForPositionInMaze(boolean foundEntrance) {
        assertTrue(foundEntrance);
    }




    @Test @DisplayName("Check if start position is found by algorithm")
    void testForCheckingForFirstPositionAlgoritm() {
        assertAlgorithmForPositionInMaze(generateMazeSolver(getFirstMaze()).solveTheMaze());
    }


    @Test @DisplayName("Check if participant doing valid move and passing")
    void testIfMoveIsValidOrNot() {
        assertTrue(mazeSolverValidMove(getSampleMaze(), 0,1));
    }


    @Test @DisplayName("Check if participant doing invalid move and passing")
    void testIfParticipantIsDoingInvalidMovesOverTheMaze() {
        assertFalse(mazeSolverValidMove(getSampleMaze(), 1, 0));
    }


    @Test @DisplayName("Check if array is not empty")
    void testIfPlayerNodeArrayIsNotNullOrEmpty() {
        List<Node> sampleArray = solvingMazeAndGetVisitedNodes(getSampleMaze());
        assertFalse(sampleArray.isEmpty());
    }


    @Test @DisplayName("Check if array is bigger than three")
    void testIfPlayerNodeArrayIsBiggerThanThree() {
        List<Node> sampleArray = solvingMazeAndGetVisitedNodes(getSampleMaze());
        assertTrue(sampleArray.size() > 4);
    }


    @Test @DisplayName("check if player reached middle")
    void testIfPlayersHaveReachedMiddleOfMaze() {
        List<Node> sampleArray = solvingMazeAndGetVisitedNodes(getSampleMaze());
        assertEquals(sampleArray.get(4).getValue(), getSampleMaze()[3][2]);
    }


    @Test @DisplayName("Testing new method - for checking middle")
    void testExperimentalMiddle() {
        List<Node> sampleArray = solvingMazeAndGetVisitedNodes(getSampleMaze());
        assertTrue(sampleArray.stream().anyMatch(node -> node.getRow() == 3 && node.getColumn() == 2));
    }


    @Test @DisplayName("Testing for no entrance algorithm")
    void testIfNoEntranceIsFound() {
        assertFalse(generateMazeSolver(getSampleTwoMaze()).solveTheMaze());
    }


    @Test @DisplayName("Testing for found entrance algorithm")
    void testIfEntranceIsFound() {
        assertTrue(generateMazeSolver(getSampleMaze()).solveTheMaze());
    }


}
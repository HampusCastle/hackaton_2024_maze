package org.example.Controller;

import org.example.Model.Node;
import org.example.Solution.MazeSolver;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


// hitta ett sätt att trigga en OK om alla test är körda och klara? Därifrån trigga API call?


class MazeSolverTest {


    private int[][] returnMaze(String param) {
        HackathonController hackathonController = new HackathonController();
        return hackathonController.mazeEndpointBuilder(param);
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
        assertAlgorithmForPositionInMaze(generateMazeSolver(returnMaze("first")).solveTheMaze());
    }


    @Test @DisplayName("Check if participant doing valid move and passing")
    void testIfMoveIsValidOrNot() {
        assertTrue(mazeSolverValidMove(returnMaze("sample"), 0,1));
    }


    @Test @DisplayName("Check if participant doing invalid move and passing")
    void testIfParticipantIsDoingInvalidMovesOverTheMaze() {
        assertFalse(mazeSolverValidMove(returnMaze("sample"), 1, 0));
    }


    @Test @DisplayName("Check if array is not empty")
    void testIfPlayerNodeArrayIsNotNullOrEmpty() {
        List<Node> sampleArray = solvingMazeAndGetVisitedNodes(returnMaze("sample"));
        assertFalse(sampleArray.isEmpty());
    }


    @Test @DisplayName("Check if array is bigger than three")
    void testIfPlayerNodeArrayIsBiggerThanThree() {
        List<Node> sampleArray = solvingMazeAndGetVisitedNodes(returnMaze("sample"));
        assertTrue(sampleArray.size() > 4);
    }


    @Test @DisplayName("check if player reached middle")
    void testIfPlayersHaveReachedMiddleOfMaze() {
        List<Node> sampleArray = solvingMazeAndGetVisitedNodes(returnMaze("sample"));
        assertEquals(sampleArray.get(4).getValue(), returnMaze("sample")[3][2]);
    }


    @Test @DisplayName("Testing new method - for checking middle")
    void testExperimentalMiddle() {
        List<Node> sampleArray = solvingMazeAndGetVisitedNodes(returnMaze("sample"));
        assertTrue(sampleArray.stream().anyMatch(node -> node.getRow() == 3 && node.getColumn() == 2));
    }


    @Test @DisplayName("Testing for no entrance algorithm")
    void testIfNoEntranceIsFound() {
        assertFalse(generateMazeSolver(returnMaze("sampleTwo")).solveTheMaze());
    }


    @Test @DisplayName("Testing for found entrance algorithm")
    void testifEntranceIsFound() {
        assertTrue(generateMazeSolver(returnMaze("sample")).solveTheMaze());
    }


    @Test @DisplayName("Filling out to find best method to check right position for traversing")
    void testIfParticipantEndsUpInMiddleOfFirstMaze() {
        int mazeRowForTesting = returnMaze("first").length;
        int mazeColumnForTesting = returnMaze("first")[0].length;
        boolean storeVisitedPosition = generateMazeSolver(returnMaze("first")).traverseTheMaze(3,2,new boolean[mazeRowForTesting][mazeColumnForTesting]);
        assertTrue(storeVisitedPosition);
    }

}
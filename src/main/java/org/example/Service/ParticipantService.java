package org.example.Service;

import org.example.Controller.HackathonController;
import org.example.Controller.StringTextController;
import org.example.Model.Maze;
import org.example.Solution.MazeSolver;

import java.util.Scanner;

import static org.example.Model.Maze.*;

public class ParticipantService {


    private final StringTextController stringTextController;
    private final HackathonController hackathonController;


    public ParticipantService(StringTextController stringTextController, HackathonController hackathonController) {
        this.stringTextController = stringTextController;
        this.hackathonController = hackathonController;
    }


    public void solveMazeWithMazeSolver(int[][] maze) {
        MazeSolver mazeSolver = new MazeSolver(maze);
        mazeSolver.solveTheMaze();
    }



    public void presentParticipantWithOptions() {                    // presenterar menyn för användaren
                                                                     // bool för att kontrollera om vi bryter
        boolean continueTillParticipantQuit = true;
        while (continueTillParticipantQuit) {

            System.out.println(stringTextController.presentChoicesForParticipant());
            int userChoiceInput = new Scanner(System.in).nextInt();

            switch (userChoiceInput) {
                case 1 -> chooseMazeToSolve();
                case 2 -> insaneMazesToSolve();
                case 3 -> continueTillParticipantQuit = false;
                default -> System.out.println("Använd rätt input");
            }
        }
    }


    public void chooseMazeToSolve()  {
        Maze maze = new Maze();
        boolean continueTillParticipantQuit = true;
        while (continueTillParticipantQuit) {

            System.out.println(stringTextController.solveTheMazeByParticipant());
            int userChoiceInput = new Scanner(System.in).nextInt();
            switch (userChoiceInput) {

                case 1 -> solveMazeWithMazeSolver(getFirstMaze());
                case 2 -> solveMazeWithMazeSolver(getSecondMaze());
                case 3 -> solveMazeWithMazeSolver(getThirdMaze());
                case 4 -> continueTillParticipantQuit = false;
                default -> System.out.println("Använd rätt input");
            }
        }
    }


    public void insaneMazesToSolve() {
        boolean continueTillParticipantQuit = true;
        while (continueTillParticipantQuit) {

            System.out.println(stringTextController.solveTheInsaneMazeByParticipant());
            int userChoiceInput = new Scanner(System.in).nextInt();
            switch (userChoiceInput) {

                case 1 -> solveMazeWithMazeSolver(getFourthMaze());
                case 2 -> solveMazeWithMazeSolver(getInsaneMaze());
                case 3 -> solveMazeWithMazeSolver(getInsaneTwoMaze());
                case 4 -> solveMazeWithMazeSolver(getInsaneThreeMaze());
                case 5 -> continueTillParticipantQuit = false;
                default -> System.out.println("Använd rätt input");
            }
        }
    }
}

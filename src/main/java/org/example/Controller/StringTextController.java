package org.example.Controller;

public class StringTextController {

    public String presentWelcomeToParticipant() {
        return """
                      
                      GRATULERAR TILL ATT HA KLARAT DE FÖRSTA.
                EFTER ATT NI HAR HÄMTAT NYCKELN, ÄR NI NU FAST I LABYRINTEN
                       ...HÄR KOMMER NI BEHÖVA ATT SÖKA \033[3mDJUPT\033[1m...
                
                """;
    }


    public String presentChoicesForParticipant() {
        return """
                ----------------------------------<
                1. SOLVE THE MAZES
                2. SOLVE INSANE MAZES
                3. QUIT
                ----------------------------------<
                """;
    }


    public String solveTheMazeByParticipant() {
        return """
                ----------------------------------<
                1. SOLVE MAZE ONE
                2. SOLVE MAZE TWO
                3. SOLVE MAZE THREE
                4. QUIT
                ----------------------------------<
                """;
    }

    public String solveTheInsaneMazeByParticipant() {
        return """
                ----------------------------------<
                1. SOLVE MAZE FOUR
                2. SOLVE INSANE MAZE ONE
                3. SOLVE INSANE MAZE TWO
                4. SOLVE INSANE MAZE THREE
                5. QUIT
                ----------------------------------<
                """;
    }




    public String printOutLostArtifactText() {
        return """
                
                
                  @     @@@    @@@   @@@@@         @      @@@@   @@@@@  @@@  @@@@@     @         @@@@  @@@@@
                  @    @   @   @       @          @ @     @   @    @     @   @        @ @       @        @ 
                  @    @   @   @@@     @         @@@@@    @@@@     @     @   @@@     @@@@@     @         @ 
                  @    @   @     @     @        @     @   @  @     @     @   @      @     @     @        @  
                  @@@@  @@@    @@@     @       @       @  @   @    @    @@@  @     @       @     @@@@    @

                
                  press enter to continue...
                """;
    }
}

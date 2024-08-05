package org.example.Configuration;

import org.example.Controller.StringTextController;
import org.example.Service.ParticipantService;

import java.util.Scanner;

public class RunApplication {


    private final ParticipantService participantService;
    private final StringTextController stringTextController;


    public RunApplication(ParticipantService participantService, StringTextController stringTextController) {
        this.stringTextController = stringTextController;
        this.participantService = participantService;
    }


    public void run() {
        System.out.println(stringTextController.printOutLostArtifactText());

        if (new Scanner(System.in).hasNextLine()) {

            System.out.println(stringTextController.presentWelcomeToParticipant());
            participantService.presentParticipantWithOptions();
        }
    }

}

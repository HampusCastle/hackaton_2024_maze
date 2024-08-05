package org.example.Configuration;

import org.example.Controller.HackathonController;
import org.example.Controller.StringTextController;
import org.example.Service.ParticipantService;


public class ApplicationInitializer {


    public static RunApplication initializeApplication() {

        HackathonController hackathonController = new HackathonController();
        StringTextController stringTextController = new StringTextController();
        ParticipantService participantService = new ParticipantService(stringTextController, hackathonController);
        return new RunApplication(participantService, stringTextController);

    }
}

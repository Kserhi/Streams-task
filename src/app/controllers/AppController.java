package app.controllers;

import app.model.DataHendler;
import app.model.DataProvider;
import app.view.AppView;

public class AppController {
    public AppController() {
        run();
    }

    private void run() {
        AppView view = new AppView();
        DataProvider dataProvider = new DataProvider();
        DataHendler dataHendler = new DataHendler();

        switch (view.getMenu()) {
            case "1" -> view.getAllItems(
                    dataHendler.hendelData(dataProvider.getData(), "123"));
            case "2" -> System.exit(0);
            default -> view.getOutput("Invalid comand");
        }

    }
}

package app.controllers;

import app.model.AppModel;
import app.view.AppView;

public class AppController {
    public AppController() {
        run();
    }

    private void run() {
        AppView view = new AppView();
        AppModel appModel=new AppModel();

        switch (view.getMenu()) {
            case "1" -> view.getAllItems(appModel.getData());
            case "2" -> view.getAllItems(appModel.hendelData(appModel.getData(),"123"));
            case "3" -> System.exit(0);
            default -> view.getOutput("Invalid comand");
        }

    }
}

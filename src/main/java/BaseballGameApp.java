import controller.GameController;

public class BaseballGameApp {

    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        GameController gameController = appConfig.gameController();
        gameController.Init();
    }
}

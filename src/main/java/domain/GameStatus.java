package domain;

public enum GameStatus {
    START("1"), END("2");

    private String status;
    GameStatus(String status) {
        this.status = status;
    }
}

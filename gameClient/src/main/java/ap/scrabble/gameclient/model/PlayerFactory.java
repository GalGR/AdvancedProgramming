package ap.scrabble.gameclient.model;

import ap.scrabble.gameclient.model.recipient.GameRecipient;

public class PlayerFactory {
    private static PlayerFactory inst;

    private PlayerFactory() {}

    public static PlayerFactory GetInstance() {
        if (inst == null) {
            inst = new PlayerFactory();
        }
        return inst;
    }

    public Player CreatePlayer(GameRecipient requester, String playerName) {
        // TODO: Return player type based on local/remote requester
    }
}
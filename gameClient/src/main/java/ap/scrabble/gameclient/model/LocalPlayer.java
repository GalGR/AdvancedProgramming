package ap.scrabble.gameclient.model;

import ap.scrabble.gameclient.model.board.Tile;
import ap.scrabble.gameclient.model.board.Word;

import java.util.List;

public class LocalPlayer extends Player{

    public LocalPlayer(String playerName, boolean isLocal) {
        super(playerName, isLocal);
    }

    @Override
    public Integer PlayNextTurn() {
        Integer score = 0;
        while (score == 0){
            Word word = GetPlayerWord();
            score = GameManager.getInstance().game.placePlayerTurn(word,this.PlayerName);
            //if failed create output message

        }
        return score;
    }

    @Override
    public List<Tile> GetMissingTiles() {
        Integer neededTiles = MAXIMUM_TILES_PER_PLAYER - this.playersTiles.size();
        List<Tile> newTiles = GameManager.getInstance().game.GetTiles(neededTiles);
        return newTiles;

    }
}

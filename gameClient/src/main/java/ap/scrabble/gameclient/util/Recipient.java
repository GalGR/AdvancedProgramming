package ap.scrabble.gameclient.util;

public interface Recipient<MessageType> {
    public enum Type {
        LOCAL,
        REMOTE,
        HOST,
        HOST_AND_SELF,
        ALL
    }

    Type getType();
    void sendMessage(MessageType type, Object arg);
}

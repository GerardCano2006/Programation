package AEA3.Mastermind;

public class Player {
    protected int codeLength;

    public Player(int codeLength) {
        this.codeLength = codeLength;
    }

    public String makeGuess() {
        return "";
    }

    public int getCodeLength() {
        return codeLength;
    }
}
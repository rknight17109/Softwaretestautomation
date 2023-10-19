package game;

public class TicTacToeRules {
  private final static int SIZE = 3;
  private Peg[][] pegs = new Peg[SIZE][SIZE];

  private Peg nextPegToPlace = Peg.FIRST;

  public TicTacToeRules() {
    for (int i = 0; i < SIZE; i++) {
      for (int j = 0; j < SIZE; j++) {
        pegs[i][j] = Peg.EMPTY;
      }
    }
  }

  public void placePeg(int row, int column) {
//    pegs[row][column] = nextPegToPlace;
//
//    nextPegToPlace = nextPegToPlace == Peg.FIRST ? Peg.SECOND : Peg.FIRST;

    if(pegs[row][column] != Peg.EMPTY) {
      throw new TicTacToeRulesException("Position Occupied");
    }

    pegs[row][column] = nextPegToPlace;

    toggleNextPegToPlace();
  }

  private void toggleNextPegToPlace() {
    nextPegToPlace = nextPegToPlace == Peg.FIRST ? Peg.SECOND : Peg.FIRST;
  }

  public Peg pegAtPosition(int row, int column) {
    return pegs[row][column];
  }
}

package game;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TicTacToeRulesTest {
  private TicTacToeRules ticTacToeRules;

  @BeforeEach
  void init() {
    ticTacToeRules = new TicTacToeRules();
  }

  @Test
  void canary(){
    assertTrue(true);
  }

  @Test
  void firstPlayerPlacesFirstpeg(){
//    Player player = new Player(new Peg("X"));
//
//    tictactoeRule.placePeg(new Cell(1, 1), player);

    //WDYT?
    //a good start?

    //It is a lot of work to get moving forward. We need a Peg, a Player, a Cell, before
    //even getting to the essence of this test.

    //What is the purpose of a player? The player does not really have much significance
    //within the game. At the best the GUI may show their information, but we don't need
    //that here. YAGNI

//    Peg peg = new Peg("X");
//
//    tictactoeRule.placePeg(new Cell(1, 1), peg);
//
    //Do we need the cell?

//    Peg peg = new Peg("X");
//
//    tictactoeRule.placePeg(1, 1, peg);

    //If we have X, we may have O, but what if someone places a peg "W"?
    //we have to check for that error.

    //What if in the future we decide to use chicken and goat rather than X and O?

    //After all X and O are really visual and don't mean a whole lot. So what is it really?

    //It is not about X or O, it is really about first peg and second peg that takes turn
    //to appear.

    ticTacToeRules.placePeg(1, 1);

    assertEquals(Peg.FIRST, ticTacToeRules.pegAtPosition(1, 1));

    //WDYT? How does that feel?

    //What did we do? Write test? Is that what we were doing?
    //Kent Beck: "Unit testing is more of an act of design than an act of verification"
  }

  @Test
  void secondPlayerPlayesTheirFirstPeg(){
    ticTacToeRules.placePeg(1, 2);

    ticTacToeRules.placePeg(0, 1);

    assertEquals(Peg.SECOND, ticTacToeRules.pegAtPosition(0, 1));
  }

  @Test
  void firstPlayerPlacesThirdPeg(){
    ticTacToeRules.placePeg(1, 2);
    ticTacToeRules.placePeg(0, 1);

    ticTacToeRules.placePeg(0, 2);

    assertEquals(Peg.FIRST, ticTacToeRules.pegAtPosition(1, 2));
    assertEquals(Peg.SECOND, ticTacToeRules.pegAtPosition(0, 1));
    assertEquals(Peg.FIRST, ticTacToeRules.pegAtPosition(0, 2));
  }

  @Test
  void doNotAllowPegToBePlaceAtAnOccupiedPosition(){
    //What should we do now?
    //1. Ignore, do not cause any effect
    //2. Throw an exception
    //3. Return a true or false from placePeg. No change if operation is invalid

    //Options 2 and 3 are better than 1.

    //Here we are choosing option 2.
    ticTacToeRules.placePeg(1, 2);

    var ex = assertThrows(TicTacToeRulesException.class, () -> ticTacToeRules.placePeg(1, 2));
    assertEquals("Position Occupied", ex.getMessage());
  }
}

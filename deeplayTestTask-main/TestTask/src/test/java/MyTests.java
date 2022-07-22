import org.example.GameLogic;
import org.junit.Assert;
import org.junit.Test;
import java.io.IOException;


public class MyTests {

    @Test
    public void testArraysValue() throws IOException {
        GameLogic TestGameLogic = new GameLogic("SSSSWWWWTTTTPPPP","Swamper");
        int[][] arr = TestGameLogic.fillArray();
        int[][] array = {{2,2,2,2}, {2,2,2,2}, {5,5,5,5},{2,2,2,2}};
        Assert.assertArrayEquals(arr,array);
        TestGameLogic = new GameLogic("SPTWSPTWSPTWSPTW","woodman");
        arr = TestGameLogic.fillArray();
        array = new int[][]{{3, 2, 2, 3}, {3, 2, 2, 3}, {3, 2, 2, 3}, {3, 2, 2, 3}};
        Assert.assertArrayEquals(arr,array);
    }
    @Test
    public void testInput() throws IOException {
        GameLogic testGameLogic = new GameLogic("swTPsPTWstwpPTSt","SwAmPEr");
        int[][] gameField = testGameLogic.fillArray();
        testGameLogic.solve(0,0,-1,gameField);
        testGameLogic.getResult();;
    }

   @Test
    public void mathTest() throws IOException {
        GameLogic testGameLogic = new GameLogic("STWSWTPPTPTTPWPP","Human");
        testGameLogic.solve(0,0,-1,testGameLogic.fillArray());
        Assert.assertEquals(testGameLogic.getBestSum(),10);
    }
}

package pkg;
import java.util.Scanner;
import org.apache.logging.log4j.*;

public class Main {
    private static final Logger logger = LogManager.getLogger();
    private static final Marker RHYME_MARKER = MarkerManager.getMarker("RHYME_MARKER");
    private static final Marker GIBBERISH_MARKER = MarkerManager.getMarker("GIBBERISH_MARKER");

    public static void main(String[] args) throws InterruptedException {
	        
	System.out.println("Enter the number of Iterations: ");
	Scanner input = new Scanner(System.in);
    	int iteration = input.nextInt();
	input.close();

        for (int i = 1; i<=iteration; i++){
            ThreadContext.put("iteration", String.valueOf(i));

            logger.info(RHYME_MARKER, "Twinkle, twinkle, little star,");
            logger.debug(RHYME_MARKER, "How I wonder what you are.");
            logger.warn(GIBBERISH_MARKER, "Bram dam dala, Wogolala, bamba");
            logger.info("Up above the world so high,");
            logger.debug(RHYME_MARKER, " Like a diamond in the sky.");
            logger.fatal(GIBBERISH_MARKER, "Hickory, dickory, dock.");
            logger.debug(RHYME_MARKER, "When the blazing sun is gone,");
            logger.info(RHYME_MARKER, "When he nothing shines upon,");
            logger.warn(GIBBERISH_MARKER, "Domdom, lalala.");
            logger.debug("Twinkle, twinkle, all the night.");
            Thread.sleep(3000);

            ThreadContext.clearMap();
        }
    }
}

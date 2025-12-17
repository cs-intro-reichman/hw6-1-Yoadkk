import java.awt.Color;

public class Editor4 {
    public static void main(String[] args) {

        String image = args[0];
        int n = Integer.parseInt(args[1]);

        Color[][] coImage = Runigram.read(image);
        Color[][] bwImage = Runigram.grayScaled(coImage);


        Runigram.setCanvas(coImage);
        Runigram.morph(coImage, bwImage, n);
    }
}

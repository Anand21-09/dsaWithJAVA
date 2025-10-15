
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.Random;

public class SortingVisualizer extends Application {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 400;
    private static final int BAR_COUNT = 50;
    private double[] bars = new double[BAR_COUNT];
    private GraphicsContext gc;

    @Override
    public void start(Stage stage) {
        Canvas canvas = new Canvas(WIDTH, HEIGHT);
        gc = canvas.getGraphicsContext2D();

        Button bubbleBtn = new Button("Bubble Sort");
        Button selectionBtn = new Button("Selection Sort");
        Button resetBtn = new Button("Reset");

        bubbleBtn.setOnAction(e -> new Thread(this::bubbleSort).start());
        selectionBtn.setOnAction(e -> new Thread(this::selectionSort).start());
        resetBtn.setOnAction(e -> {
            generateBars();
            drawBars();
        });

        generateBars();
        drawBars();

        HBox buttons = new HBox(10, bubbleBtn, selectionBtn, resetBtn);
        BorderPane root = new BorderPane(canvas, null, null, buttons, null);
        Scene scene = new Scene(root, WIDTH, HEIGHT + 50);

        stage.setTitle("Sorting Visualizer");
        stage.setScene(scene);
        stage.show();
    }

    private void generateBars() {
        Random rand = new Random();
        for (int i = 0; i < BAR_COUNT; i++) {
            bars[i] = rand.nextDouble() * HEIGHT;
        }
    }

    private void drawBars() {
        gc.clearRect(0, 0, WIDTH, HEIGHT);
        double barWidth = WIDTH / (double) BAR_COUNT;
        for (int i = 0; i < BAR_COUNT; i++) {
            gc.setFill(Color.CORNFLOWERBLUE);
            gc.fillRect(i * barWidth, HEIGHT - bars[i], barWidth - 2, bars[i]);
        }
    }

    private void bubbleSort() {
        try {
            for (int i = 0; i < bars.length - 1; i++) {
                for (int j = 0; j < bars.length - i - 1; j++) {
                    if (bars[j] > bars[j + 1]) {
                        double temp = bars[j];
                        bars[j] = bars[j + 1];
                        bars[j + 1] = temp;
                    }
                    drawBars();
                    Thread.sleep(30);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void selectionSort() {
        try {
            for (int i = 0; i < bars.length - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < bars.length; j++) {
                    if (bars[j] < bars[minIndex]) {
                        minIndex = j;
                    }
                }
                double temp = bars[minIndex];
                bars[minIndex] = bars[i];
                bars[i] = temp;

                drawBars();
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}


/* Richa Patel
*  CIS 2212 Tuesdays Fall 2018
*  Lab 10 - JavaFX – Course Score GUI
*  Due November 13, 2018 
*/
package JavaFX;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

@SuppressWarnings("restriction")
public class CourseScoreGUI extends Application
{
	// most our JavaFX coding goes in the start method
	@SuppressWarnings("restriction")
	@Override
	public void start(Stage primaryStage) throws Exception {
	
		// create GridPane & set properties
		GridPane gridP = new GridPane();
		gridP.setAlignment(Pos.CENTER);
		gridP.setPadding(new Insets(11,13,11,13));
		gridP.setHgap(10);
		gridP.setVgap(15);	
		gridP.setBackground(new Background(new BackgroundFill(Color.rgb(240,255,240), null, null)));

		// create labels & text fields  
		Label label = new Label("Score 1: ");
		label.setFont(new Font(16));
		TextField tfEarned = new TextField();
		TextField tfMax = new TextField();

		Label label1 = new Label("Score 2: ");
		label1.setFont(new Font(16));
		TextField tfEarned2 = new TextField();
		TextField tfMax2 = new TextField();

		Label label2 = new Label("Score 3: ");
		label2.setFont(new Font(16));
		TextField tfEarned3 = new TextField();
		TextField tfMax3 = new TextField();

		Label label3 = new Label("Score 4: ");
		label3.setFont(new Font(16));
		TextField tfEarned4 = new TextField();
		TextField tfMax4 = new TextField();

		Label label4 = new Label("Score 5: ");
		label4.setFont(new Font(16));
		TextField tfEarned5 = new TextField();
		TextField tfMax5 = new TextField();

		Label label5 = new Label("Score 6: ");
		label5.setFont(new Font(16));
		TextField tfEarned6 = new TextField();
		TextField tfMax6 = new TextField();

		
		Label earned = new Label("Earned Score ");
		earned.setFont(new Font(24));
		gridP.add(earned, 1, 0);
		GridPane.setHalignment(earned, HPos.CENTER);

		Label max = new Label("Max Possible ");
		max.setFont(new Font(24));
		gridP.add(max, 2, 0);
		GridPane.setHalignment(max, HPos.CENTER);

		// add label on grid pane
		gridP.add(label, 0, 1);   // columnIndex, rowIndex  - opposite of arrays
		GridPane.setHalignment(label, HPos.CENTER);
		gridP.add(tfEarned, 1, 1);					// col 1 & row 1
		gridP.add(tfMax, 2, 1);

		gridP.add(label1, 0, 2);   // columnIndex, rowIndex  - opposite of arrays
		GridPane.setHalignment(label1, HPos.CENTER);
		gridP.add(tfEarned2, 1, 2);					// col 1 & row 2
		gridP.add(tfMax2, 2, 2);

		gridP.add(label2, 0, 3);   // columnIndex, rowIndex  - opposite of arrays
		GridPane.setHalignment(label2, HPos.CENTER);
		gridP.add(tfEarned3, 1, 3);					// col 1 & row 3
		gridP.add(tfMax3, 2, 3);

		gridP.add(label3, 0, 4);   // columnIndex, rowIndex  - opposite of arrays
		GridPane.setHalignment(label3, HPos.CENTER);
		gridP.add(tfEarned4, 1, 4);					// col 1 & row 4
		gridP.add(tfMax4, 2, 4);

		gridP.add(label4, 0, 5);   // columnIndex, rowIndex  - opposite of arrays
		GridPane.setHalignment(label4, HPos.CENTER);
		gridP.add(tfEarned5, 1, 5);					// col 1 & row 5
		gridP.add(tfMax5, 2, 5);

		gridP.add(label5, 0, 6);   // columnIndex, rowIndex  - opposite of arrays
		GridPane.setHalignment(label5, HPos.CENTER);
		gridP.add(tfEarned6, 1, 6);					// col 1 & row 6
		gridP.add(tfMax6, 2, 6);


		//gridP.add(new Label("TOTAL: "), 0, 8);   // columnIndex, rowIndex  - opposite of arrays
		TextField tfTotal = new TextField();
		tfTotal.setBackground(new Background(new BackgroundFill(Color.rgb(232,232,232), null, null)));
		tfTotal.setDisable(true);
		// gridP.add(tfTotal, 1, 8);					

		TextField tfTotal2 = new TextField();
		tfTotal2.setBackground(new Background(new BackgroundFill(Color.rgb(232,232,232), null, null)));
		tfTotal2.setDisable(true);
		// gridP.add(tfTotal2, 2, 8);


		TextField tfFinalScore = new TextField();
		tfFinalScore.setBackground(new Background(new BackgroundFill(Color.rgb(232,232,232), null, null)));
		tfFinalScore.setDisable(true);
		//gridP.add(new Label("FINAL SCORE: "), 0, 9);  
		//gridP.add(tfFinalScore, 1, 9);	

		TextField tfFinalGrade = new TextField();
		tfFinalGrade.setBackground(new Background(new BackgroundFill(Color.rgb(232,232,232), null, null)));
		tfFinalGrade.setDisable(true);
		//gridP.add(new Label("FINAL GRADE: "), 0, 10);  
		//gridP.add(tfFinalGrade, 1, 10);


		Label perfectScore = new Label("Perfect Score! ");
		perfectScore.setTextFill(Color.FIREBRICK);
		perfectScore.setFont(new Font("Cambria", 24));
		gridP.add(perfectScore, 1, 11);

		// create button and set properties
		Button btn1 = new Button("Calculate");
		btn1.setBackground(new Background(new BackgroundFill(Color.rgb(178,34,34), null, null)));
		btn1.setFont(new Font("Papyrus", 15.5));
		btn1.setTextFill(Color.WHITE);

		Button btn2 = new Button("Start Over");
		btn2.setBackground(new Background(new BackgroundFill(Color.rgb(47,79,79), null, null)));
		btn2.setFont(new Font("Papyrus", 13.5));
		btn2.setTextFill(Color.YELLOW);

		// add button on grid pane
		gridP.add(btn1, 2, 11);
		GridPane.setHalignment(btn1, HPos.RIGHT);

		gridP.add(btn2, 2,12);
		GridPane.setHalignment(btn2, HPos.RIGHT);

		// create Scene & put pane on the scene
		Scene scene1 = new Scene(gridP);

		// set scene on stage & set properties of stage
		primaryStage.setScene(scene1);
		primaryStage.setTitle("Calculate Course Score");
		primaryStage.setResizable(false);
		primaryStage.show();
	} 

	public static void main(String[] args) {


		Application.launch(args);  // import library

	}// end main
}

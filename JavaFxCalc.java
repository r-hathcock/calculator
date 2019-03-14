/* 
 * PURPOSE: This is a basic calculator. Used to perform simple arithmetic. 
 */
package JavaFxCalc;
import java.text.DecimalFormat;
import java.util.Scanner;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Border;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;

public class JavaFxCalc extends Application 
{
	// variables
	String opChosen = "";
	boolean opPressed = false;
	double num1 = 0;
	double num2 = 0;
	double result = 0;
	DecimalFormat formatter = new DecimalFormat("#");
	
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) throws Exception
	{	
		// Create a scene and place a button in the scene.
		Pane pane = new Pane();
		
		// text field
		TextField textfield = new TextField();
		textfield.setLayoutX(10);
		textfield.setLayoutY(10);
		textfield.setPrefSize(100,20);
		textfield.setAlignment(Pos.BOTTOM_RIGHT);
		textfield.setEditable(false);
		textfield.setStyle("-fx-border-color: black;");
		
		// Buttons
		Button bt0 = new Button("0");
			bt0.setPrefSize(35, 35);
			bt0.setOnAction(new EventHandler<ActionEvent> () 
				{
					@Override
					public void handle(ActionEvent arg0) 
					{
						if (opPressed == true)
						{
							opPressed = false;
							textfield.clear();
						}
						textfield.setText(textfield.getText() + "0");
					}
				}
			);
			
		Button bt1 = new Button("1");
			bt1.setPrefSize(35, 35);
			bt1.setOnAction(new EventHandler<ActionEvent> () 
				{
					@Override
					public void handle(ActionEvent arg0) 
					{
						if (opPressed == true)
						{
							opPressed = false;
							textfield.clear();
						}
						textfield.setText(textfield.getText() + "1");
					}
				}
			);
			
		Button bt2 = new Button("2");
			bt2.setPrefSize(35, 35);
			bt2.setOnAction(new EventHandler<ActionEvent> () 
				{
					@Override
					public void handle(ActionEvent arg0) 
					{
						if (opPressed == true)
						{
							opPressed = false;
							textfield.clear();
						}
						textfield.setText(textfield.getText() + "2");
					}
				}
			);
			
		Button bt3 = new Button("3");
			bt3.setPrefSize(35, 35);
			bt3.setOnAction(new EventHandler<ActionEvent> () 
				{
					@Override
					public void handle(ActionEvent arg0) 
					{
						if (opPressed == true)
						{
							opPressed = false;
							textfield.clear();
						}
						textfield.setText(textfield.getText() + "3");
					}
				}
			);
			
		Button bt4 = new Button("4");
			bt4.setPrefSize(35, 35);
			bt4.setOnAction(new EventHandler<ActionEvent> () 
				{
					@Override
					public void handle(ActionEvent arg0) 
					{
						if (opPressed == true)
						{
							opPressed = false;
							textfield.clear();
						}
						textfield.setText(textfield.getText() + "4");
					}
				}
			);
			
		Button bt5 = new Button("5");
			bt5.setPrefSize(35, 35);
			bt5.setOnAction(new EventHandler<ActionEvent> () 
				{
					@Override
					public void handle(ActionEvent arg0) 
					{
						if (opPressed == true)
						{
							opPressed = false;
							textfield.clear();
						}
						textfield.setText(textfield.getText() + "5");
					}
				}
			);
			
		Button bt6 = new Button("6");
			bt6.setPrefSize(35, 35);
			bt6.setOnAction(new EventHandler<ActionEvent> () 
				{
					@Override
					public void handle(ActionEvent arg0) 
					{
						if (opPressed == true)
						{
							opPressed = false;
							textfield.clear();
						}
						textfield.setText(textfield.getText() + "6");
					}
				}
			);
			
		Button bt7 = new Button("7");
			bt7.setPrefSize(35, 35);
			bt7.setOnAction(new EventHandler<ActionEvent> () 
				{
					@Override
					public void handle(ActionEvent arg0) 
					{
						if (opPressed == true)
						{
							opPressed = false;
							textfield.clear();
						}
						textfield.setText(textfield.getText() + "7");
					}
				}
			);
			
		Button bt8 = new Button("8");
			bt8.setPrefSize(35, 35);
			bt8.setOnAction(new EventHandler<ActionEvent> () 
				{
					@Override
					public void handle(ActionEvent arg0) 
					{
						if (opPressed == true)
						{
							opPressed = false;
							textfield.clear();
						}
						textfield.setText(textfield.getText() + "8");
					}
				}
			);
			
		Button bt9 = new Button("9");
			bt9.setPrefSize(35, 35);
			bt9.setOnAction(new EventHandler<ActionEvent> () 
				{
					@Override
					public void handle(ActionEvent arg0) 
					{
						if (opPressed == true)
						{
							opPressed = false;
							textfield.clear();
						}
						textfield.setText(textfield.getText() + "9");
					}
				}
			);
			
		Button btEq = new Button("=");
			btEq.setPrefSize(35, 35);
			btEq.setOnAction(new EventHandler<ActionEvent> () 
				{
					@Override
					public void handle(ActionEvent arg0) 
					{
						String textOutput;
						num2 = Integer.parseInt(textfield.getText()); // store second number
						
						// output results depending on the operation pressed
						switch (opChosen)
						{
							case "+":
								result = num1 + num2;
								textOutput = Double.toString(result);
								textfield.setText(textOutput); break;
							case "-":
								result = num1 - num2;
								textOutput = Double.toString(result);
								textfield.setText(textOutput); break;
							case "*":
								result = num1 * num2;
								textOutput = Double.toString(result);
								textfield.setText(textOutput); break;
							case "/":
								result = num1 / num2;
								textOutput = Double.toString(result);
								textfield.setText(textOutput); break;
						}	
					}
				}
			);
			
		Button btAdd = new Button("+");
			btAdd.setPrefSize(35, 35);
			btAdd.setOnAction(new EventHandler<ActionEvent> () 
				{
					@Override
					public void handle(ActionEvent arg0) 
					{
						opChosen = "+";
						opPressed = true;
						num1 = Double.parseDouble(textfield.getText());
					}
				}
			);
			
		Button btSub = new Button("-");
			btSub.setPrefSize(35, 35);
			btSub.setOnAction(new EventHandler<ActionEvent> () 
				{
					@Override
					public void handle(ActionEvent arg0) 
					{
						opChosen = "-";
						opPressed = true;
						num1 = Double.parseDouble(textfield.getText());
					}
				}
			);
			
		Button btMult = new Button("x");
			btMult.setPrefSize(35, 35);
			btMult.setOnAction(new EventHandler<ActionEvent> () 
				{
					@Override
					public void handle(ActionEvent arg0) 
					{
						opChosen = "*";
						opPressed = true;
						num1 = Double.parseDouble(textfield.getText());
					}
				}
			);
			
		Button btDiv = new Button("/");
			btDiv.setPrefSize(35, 35);
			btDiv.setOnAction(new EventHandler<ActionEvent> () 
				{
					@Override
					public void handle(ActionEvent arg0) 
					{
						opChosen = "/";
						opPressed = true;
						num1 = Double.parseDouble(textfield.getText());
					}
				}
			);
			
		Button btClr = new Button("Clr");
		btClr.setPrefSize(35, 35);
		btClr.setOnAction(new EventHandler<ActionEvent> () 
			{
				@Override
				public void handle(ActionEvent arg0) 
				{
					textfield.clear();
					opChosen = "";
					opPressed = false;
				}
			}
		);
		
		// add buttons to grid	
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setVgap(3);
		grid.setHgap(3);
		grid.add(bt7, 0, 0);
		grid.add(bt4, 0, 1);
		grid.add(bt1, 0, 2);
		grid.add(bt8, 1, 0);
		grid.add(bt5, 1, 1);
		grid.add(bt2, 1, 2);
		grid.add(bt9, 2, 0);
		grid.add(bt6, 2, 1);
		grid.add(bt3, 2, 2);
		grid.add(bt0, 1, 3);
		grid.add(btDiv, 3, 0);
		grid.add(btMult, 3, 1);
		grid.add(btSub, 3, 2);
		grid.add(btAdd, 3, 3);
		grid.add(btEq, 2, 3);
		grid.add(btClr, 0, 3);
		
		// add grid and label to a vBox
		VBox vBox = new VBox(8);
		vBox.getChildren().addAll(textfield, grid);
		vBox.setPrefSize(200, 200);
		vBox.setAlignment(Pos.CENTER);
		
		// add vBox to pane
		pane.getChildren().add(vBox);
		pane.autosize();
		
		// create scene and add pane
		Scene scene = new Scene(pane,200,200);
		primaryStage.setTitle("MyJavaFX"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
		
	} // end of Start method

	public static void main(String[] args)
	{
		launch(args);		
	}
}

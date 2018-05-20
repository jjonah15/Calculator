/*
 * Jonah Moon
 * CS/IS 139
 * Assignment 11
 * 
 */

package Assignment11;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Border;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class Calculator extends Application 
{
	protected Pane getPane()
	{
		Text number = new Text();
		Text number2 = new Text();
		Text op = new Text();
		
		Pane pane = new Pane();
		Button equal = new Button("=");
		pane.getChildren().add(equal);
		equal.setLayoutX(320);
		equal.setLayoutY(370);
		
		Button add = new Button("+");
		pane.getChildren().add(add);
		add.setLayoutX(320);
		add.setLayoutY(340);
		
		Button minus = new Button("- ");
		pane.getChildren().add(minus);
		minus.setLayoutX(320);
		minus.setLayoutY(310);
		
		Button mult = new Button("* ");
		pane.getChildren().add(mult);
		mult.setLayoutX(320);
		mult.setLayoutY(280);
		
		Button divide = new Button("/ ");
		pane.getChildren().add(divide);
		divide.setLayoutX(320);
		divide.setLayoutY(250);
		
		Button one = new Button("1");
		pane.getChildren().add(one);
		one.setLayoutX(50);
		one.setLayoutY(340);

		Button two = new Button("2");
		pane.getChildren().add(two);
		two.setLayoutX(75);
		two.setLayoutY(340);	
		
		Button three = new Button("3");
		pane.getChildren().add(three);
		three.setLayoutX(100);
		three.setLayoutY(340);		
		
		Button four = new Button("4");
		pane.getChildren().add(four);
		four.setLayoutX(50);
		four.setLayoutY(315);		
		
		Button five = new Button("5");
		pane.getChildren().add(five);
		five.setLayoutX(75);
		five.setLayoutY(315);		
		
		Button six = new Button("6");
		pane.getChildren().add(six);
		six.setLayoutX(100);
		six.setLayoutY(315);		
		
		Button seven = new Button("7");
		pane.getChildren().add(seven);
		seven.setLayoutX(50);
		seven.setLayoutY(290);		
		
		Button eight = new Button("8");
		pane.getChildren().add(eight);
		eight.setLayoutX(75);
		eight.setLayoutY(290);		
		
		Button nine = new Button("9");
		pane.getChildren().add(nine);
		nine.setLayoutX(100);
		nine.setLayoutY(290);		
		
		Button zero = new Button("0");
		pane.getChildren().add(zero);
		zero.setLayoutX(75);
		zero.setLayoutY(365);
		
		Label myLabel = new Label("Calculator");
		myLabel.setFont(Font.font("Courier",FontWeight.BOLD,FontPosture.REGULAR,20));
		myLabel.setStyle("-fx-border-color: blue;");
		myLabel.setAlignment(Pos.BASELINE_RIGHT); // align text to the right side of the label.
		myLabel.setLayoutX(10);       // set the x location of the label
		myLabel.setLayoutY(10);       // set the y location of the label
		myLabel.setPrefSize(250, 20); // set the width and height of the label
		//myLabel.setText("123456789"); // put some numbers into the label
		pane.getChildren().add(myLabel);
		//myLabel.setText(Double.toString(sum));
		
		add.setOnAction(e->	
		{
			
			myLabel.setText("");
			op.setText("+");
			
		});
		
		minus.setOnAction(e->		
		{
			myLabel.setText("");
			op.setText("-");
			
		});
		
		mult.setOnAction(e->	
		{
		
			myLabel.setText("");
			op.setText("*");
			
		});
		
		divide.setOnAction(e->
		{
			myLabel.setText("");
			op.setText("/");
			
		});
		
		equal.setOnAction(e->	
		{
			double value;
			if(op.getText().charAt(0) == '+')
			{
				value = 5;
				value = Integer.parseInt(number.getText()) + Integer.parseInt(number2.getText());
				myLabel.setText(String.valueOf(value));
				number.setText("");
				number2.setText("");
				op.setText("");
			}
			else if (op.getText().charAt(0) == '-')
			{
				value = Integer.parseInt(number.getText()) - Integer.parseInt(number2.getText());
				myLabel.setText(String.valueOf(value));
				number.setText("");
				number2.setText("");
				op.setText("");
			}
			else if (op.getText().charAt(0) == '*')
			{
				value = Integer.parseInt(number.getText()) * Integer.parseInt(number2.getText());
				myLabel.setText(String.valueOf(value));
				number.setText("");
				number2.setText("");
				op.setText("");
			}
			else if (op.getText().charAt(0) == '/')
			{
				value = Integer.parseInt(number.getText()) / Integer.parseInt(number2.getText());
				myLabel.setText(String.valueOf(value));
				number.setText("");
				number2.setText("");
				op.setText("");
			}
			
		});
		
		one.setOnAction(e->	
		{
			
				if(op.getText().length()== 0)
				{
					String x = number.getText() + "1";
					number.setText(x);
					myLabel.setText(number.getText());
				}
				else
				{
					String y = number2.getText() + "1";
					number2.setText(y);
					myLabel.setText(number2.getText());
					
				}
			
		});
		
		two.setOnAction(e->	
		{

				if(op.getText().length()== 0)
				{
					String x = number.getText() + "2";
					number.setText(x);
					myLabel.setText(number.getText());
				}
				else
				{
					String y = number2.getText() + "2";
					number2.setText(y);
					myLabel.setText(number2.getText());
					
				}
			
		});
		
		three.setOnAction(e->		
		{
			if(op.getText().length()== 0)
			{
				String x = number.getText() + "3";
				number.setText(x);
				myLabel.setText(number.getText());
			}
			else
			{
				String y = number2.getText() + "3";
				number2.setText(y);
				myLabel.setText(number2.getText());
					
			}
			
		});
		
		four.setOnAction(e->		
		{
			
			if(op.getText().length()== 0)
			{
				String x = number.getText() + "4";
				number.setText(x);
				myLabel.setText(number.getText());
			}
			else
			{
				String y = number2.getText() + "4";
				number2.setText(y);
				myLabel.setText(number2.getText());
					
			}
			
		});
		
		five.setOnAction(e->		
		{
			
			if(op.getText().length()== 0)
			{
				String x = number.getText() + "5";
				number.setText(x);
				myLabel.setText(number.getText());
			}
			else
			{
				String y = number2.getText() + "5";
				number2.setText(y);
				myLabel.setText(number2.getText());
					
			}
			
		});
		
		six.setOnAction(e->	
		{
			
				if(op.getText().length()== 0)
				{
					String x = number.getText() + "6";
					number.setText(x);
					myLabel.setText(number.getText());
				}
				else
				{
					String y = number2.getText() + "6";
					number2.setText(y);
					myLabel.setText(number2.getText());
					
				}
			
		});
		
		seven.setOnAction(e->	
		{
			
				if(op.getText().length()== 0)
				{
					String x = number.getText() + "7";
					number.setText(x);
					myLabel.setText(number.getText());
				}
				else
				{
					String y = number2.getText() + "7";
					number2.setText(y);
					myLabel.setText(number2.getText());
					
				}
			
		});
		
		eight.setOnAction(e->		
		{
			
				if(op.getText().length()== 0)
				{
					String x = number.getText() + "8";
					number.setText(x);
					myLabel.setText(number.getText());
				}
				else
				{
					String y = number2.getText() + "8";
					number2.setText(y);
					myLabel.setText(number2.getText());
					
				}
			
		});
		
		nine.setOnAction(e->		
		{
				if(op.getText().length()== 0)
				{
					String x = number.getText() + "9";
					number.setText(x);
					myLabel.setText(number.getText());
				}
				else
				{
					String y = number2.getText() + "9";
					number2.setText(y);
					myLabel.setText(number2.getText());
					
				}
			
		});
		
		zero.setOnAction(e->		
		{
		
				if (number.getText().length() == 0)
				{
					
				}
				else if(op.getText().length() == 0)
				{
					String x = number.getText() + "0";
					number.setText(x);
					myLabel.setText(number.getText());
				}
				else
				{
					String y = number2.getText() + "0";
					number2.setText(y);
					myLabel.setText(number2.getText());
				}
			
		});
		return pane;
		
	}
	@Override
	public void start(Stage primaryStage) throws Exception 
	{
		
		Scene scene = new Scene(getPane(), 350, 400);

		primaryStage.setTitle("Calculator");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	


	public static void main(String[] args)
	{
		
		launch(args);
	}
	



}


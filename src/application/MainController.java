package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MainController {
	
	@FXML
	private TextField display;
	private float number1 = 0;
	private String operator = "";
	private boolean start = true;
	private Model model = new Model();
	
	@FXML
	public void processNumbers(ActionEvent event) {
		if (start) {
			display.setText("");
			start = false;
		}
		String value = ((Button)event.getSource()).getText();
		display.setText(display.getText()+ value);
	}
	
	@FXML
	public void processOperators(ActionEvent event) {
		String value = ((Button)event.getSource()).getText();
			
			if(!value.equals("=")) {
				if(!operator.isEmpty())
					return;
				
				operator = value;
				number1 =Long.parseLong(display.getText());
				display.setText("");
			}else {
				if (operator.isEmpty())
					return;
				float number2 = Long.parseLong(display.getText());
				double output = model.calculate(number1, number2, operator);	
				display.setText(String.valueOf(output));
				operator = "";
				start = true;
				
			
			
			
			}
			}
		}

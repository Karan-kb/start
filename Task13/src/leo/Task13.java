package leo;

import Java.awt.*;

public class Task13 extends Frame{
	Label lbluser, lblpass;
	 
	TextField txtuser, txtpass;
	
	Button btnlogin;
}

public Task13() {
	setLayout(new FlowLayout());
	lbluser = new Label("username");
	lblpass = new Label("password");
	txtuser = new TextField(20);
	txtpass = new Button("Login");
	add(lbluser);
	add(txtuser);
	
	add(lblpass);
	add(textpass);
	add(btnlogin);
	
	setVisible(true);
	
			}


public static void main(String[] args) {
	Task13 T new Task13();

}

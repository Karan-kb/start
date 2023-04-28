package hello;
import Java.awt.*;
import leo.Button;
import leo.FlowLayout;
import leo.Label;
import leo.TextField;



public class Task14 extends Frame {
	Label lbluser, lblpass;
	 
	TextField txtuser, txtpass;
	
	Button btnlogin;
	
	public Task14() {
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
		
	}
	
}

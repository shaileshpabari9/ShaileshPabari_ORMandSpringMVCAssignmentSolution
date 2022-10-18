package Com.GL.CustomarService.Model;



public class Customar_LogIn {

	private String log_InString;
	private String passwordString;

	
	public Customar_LogIn() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customar_LogIn(String log_InString, String passwordString) {
		super();
		this.log_InString = log_InString;
		this.passwordString = passwordString;
	}

	public String getLog_InString() {
		return log_InString;
	}

	public void setLog_InString(String log_InString) {
		this.log_InString = log_InString;
	}

	public String getPasswordString() {
		return passwordString;
	}

	public void setPasswordString(String passwordString) {
		this.passwordString = passwordString;
	}
}

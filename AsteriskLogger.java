package Week05Project;

public class AsteriskLogger implements Logger {	

	private String log;
	private String error;
	
	
	@Override
	public void log(String log) {
		this.log = log;
		System.out.println("***" + log + "***");
		
	}


	@Override
	public void error(String error) {
		this.error = error;
		System.out.println("*******************\n" + "***ERROR: " + error + "***\n" 
			    + "*******************");
	}


	public String getLog() {
		return log;
	}


	public void setLog(String log) {
		this.log = log;
	}


	public String getError() {
		return error;
	}


	public void setError(String error) {
		this.error = error;
	}


	

	


}

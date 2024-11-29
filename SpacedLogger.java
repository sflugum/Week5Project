package Week05Project;

public class SpacedLogger implements Logger{

	private String log;
	private String error;	
	
	
	@Override
	public void log(String log) {
		this.log = log;
		StringBuilder space = new StringBuilder();		
		for(int i =0; i < log.length(); i++) {
			space.append(log.charAt(i));
			if(i < log.length() - 1) {
				space.append(" ");
			}
		}
		System.out.println(space.toString());		
	}

	@Override
	public void error(String error) {
		this.error = error;
		StringBuilder space = new StringBuilder();
		for(int i =0; i < error.length(); i++) {
			space.append(error.charAt(i));
			if(i < error.length() - 1) {
				space.append(" ");
			}
		}
		System.out.println("ERROR: " + space.toString());		
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

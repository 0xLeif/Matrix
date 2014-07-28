package mwhs.apcs.zeriksen787.matrix;

public class UndefinedMatrixOperationException extends Exception{
	private static final long serialVersionUID = 1L;
	
	/**
	 * Constucts an Exception using the specified message
	 * @param message Messgae for Exception
	 */
	public UndefinedMatrixOperationException(String message){
		//Call super class's constructor
		super(message);
	}
}

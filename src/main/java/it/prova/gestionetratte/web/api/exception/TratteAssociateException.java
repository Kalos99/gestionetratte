package it.prova.gestionetratte.web.api.exception;

public class TratteAssociateException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public TratteAssociateException (String message) {
		super(message);
	}
}
package co.com.choucair.certification.banitsmo.exceptions;

public class NombrePorDefectoNoEncontradoAssertionError extends AssertionError {
    public static final String INVALID_NAME = "El campo no contiene el valor esperado";
    public NombrePorDefectoNoEncontradoAssertionError(String message, Throwable cause) {
        super(message, cause);
    }
}

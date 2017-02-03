package id.punten.base_java.exception;

/**
 * Created by fathan on 04/02/17.
 */

public interface ErrorBundle {
    Exception getException();

    String getErrorMessage();
}
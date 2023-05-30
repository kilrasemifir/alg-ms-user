package fr.kira.foramation.alg.msuser.exceptions;

public class BadRequestException extends RuntimeException{

    public BadRequestException(String message) {
        super("Bad request: "+message);
    }
}

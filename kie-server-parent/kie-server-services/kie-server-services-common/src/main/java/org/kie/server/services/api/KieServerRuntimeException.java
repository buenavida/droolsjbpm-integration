package org.kie.server.services.api;

public class KieServerRuntimeException extends RuntimeException {

    public KieServerRuntimeException() {
    }

    public KieServerRuntimeException(String message) {
        super( message );
    }

    public KieServerRuntimeException(String message, Throwable cause) {
        super( message, cause );
    }

    public KieServerRuntimeException(Throwable cause) {
        super( cause );
    }

}

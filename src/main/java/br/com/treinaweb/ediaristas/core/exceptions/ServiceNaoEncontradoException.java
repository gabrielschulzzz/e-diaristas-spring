package br.com.treinaweb.ediaristas.core.exceptions;

import javax.persistence.EntityNotFoundException;

public class ServiceNaoEncontradoException extends EntityNotFoundException {

    public ServiceNaoEncontradoException(String message) {
        super(message);
    }

}

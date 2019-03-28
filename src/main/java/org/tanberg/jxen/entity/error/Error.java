package org.tanberg.jxen.entity.error;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.tanberg.jxen.entity.generic.GenericEntity;

public class Error {

    @JsonProperty("code")
    private String code;

    @JsonProperty("message")
    private String message;

    @JsonProperty("params")
    private GenericEntity params;

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public GenericEntity getParams() {
        return params;
    }
}

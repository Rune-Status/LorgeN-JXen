package org.tanberg.jxen.entity.generic;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Map;

public class GenericEntity {

    @JsonIgnore
    private Map<String, String> map;

    public GenericEntity() {
    }

    public GenericEntity(Map<String, String> map) {
        this.map = map;
    }

    @JsonAnyGetter
    public Map<String, String> getMap() {
        return map;
    }

    @JsonAnySetter
    public void setMap(String name, String value) {
        this.map.put(name, value);
    }
}

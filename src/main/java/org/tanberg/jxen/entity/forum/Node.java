package org.tanberg.jxen.entity.forum;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.tanberg.jxen.entity.generic.GenericEntity;

public class Node {

    @JsonProperty("")
    private String[] breadcrumbs;

    @JsonProperty("")
    private GenericEntity typeData;

    @JsonProperty("")
    private int nodeId;

    @JsonProperty("")
    private String title;

    @JsonProperty("")
    private String nodeName;

    @JsonProperty("")
    private String description;

    @JsonProperty("")
    private String nodeTypeId;

    @JsonProperty("")
    private int parentNodeId;

    @JsonProperty("")
    private int displayOrder;

    @JsonProperty("")
    private boolean displayInList;
}

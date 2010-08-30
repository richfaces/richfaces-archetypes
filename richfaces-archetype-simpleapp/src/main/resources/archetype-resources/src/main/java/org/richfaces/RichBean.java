package org.richfaces;

import org.richfaces.log.LogFactory;
import org.richfaces.log.Logger;

import java.io.Serializable;

public class RichBean implements Serializable {

    private static final long serialVersionUID = -2403138958014741653L;
    private Logger logger;
    private String name;

    public RichBean() {
        logger = LogFactory.getLogger(RichBean.class);
        logger.info("post construct: initialize");
        name = "John";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

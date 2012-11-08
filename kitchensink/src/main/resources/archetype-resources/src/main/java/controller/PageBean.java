#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/**
 * JBoss, Home of Professional Open Source
 * Copyright 2010, Red Hat, Inc. and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 **/
package ${package}.controller;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Model;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import java.io.Serializable;
import java.net.MalformedURLException;

/**
 * The PageBean maps the location hash from the browser into a jsf view-id
 *
 * @author <a href="http://community.jboss.org/people/bleathem">Brian Leathem</a>
 */
@Named
@SessionScoped
public class PageBean implements Serializable {
    private static final long serialVersionUID = 281964859634018452L;

    private String location;
    private String page;

    public String getPage() {
        return page;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
        ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
        String viewId = String.format("/mobile/%s.xhtml", location);
        try {
            if (context.getResource(viewId) != null) {
                this.page = viewId;
            }
        } catch (MalformedURLException e) {
            // do nothing
        }
    }
}

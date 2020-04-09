/*
 * Copyright (c) 2011, 2020 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0,
 * or the Eclipse Distribution License v. 1.0 which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: EPL-2.0 OR BSD-3-Clause
 */

package org.eclipse.persistence.jpa.rs.resources.unversioned;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.HttpHeaders;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.UriInfo;

import org.eclipse.persistence.jpa.rs.resources.common.AbstractQueryResource;

/**
 * PersistenceResource
 *
 * @deprecated Use {@link  org.eclipse.persistence.jpa.rs.resources.QueryResource} instead.
 *
 */
@Deprecated
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
@Path("/{context}/query/")
public class QueryResource extends AbstractQueryResource {

    @POST
    @Path("{name}")
    public Response namedQueryUpdate(@PathParam("context") String persistenceUnit, @PathParam("name") String name, @Context HttpHeaders hh, @Context UriInfo ui) {
        setRequestUniqueId();
        return namedQueryUpdateInternal(null, persistenceUnit, name, hh, ui);
    }

    @GET
    @Path("{name}")
    public Response namedQuery(@PathParam("context") String persistenceUnit, @PathParam("name") String name, @Context HttpHeaders hh, @Context UriInfo ui) {
        setRequestUniqueId();
        return namedQueryInternal(null, persistenceUnit, name, hh, ui);
    }
}

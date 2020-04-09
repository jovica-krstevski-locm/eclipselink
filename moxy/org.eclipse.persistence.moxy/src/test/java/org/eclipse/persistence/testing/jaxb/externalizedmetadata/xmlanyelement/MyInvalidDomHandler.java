/*
 * Copyright (c) 1998, 2020 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0,
 * or the Eclipse Distribution License v. 1.0 which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: EPL-2.0 OR BSD-3-Clause
 */

// Contributors:
// dmccann - October 27/2009 - 2.0 - Initial implementation
package org.eclipse.persistence.testing.jaxb.externalizedmetadata.xmlanyelement;

import jakarta.xml.bind.ValidationEventHandler;
import jakarta.xml.bind.annotation.DomHandler;
import jakarta.xml.bind.annotation.W3CDomHandler;
import javax.xml.transform.Result;
import javax.xml.transform.Source;

import org.w3c.dom.Element;

/**
 * This handler simply wraps a W3CDomHandler. It will be used to verify that
 * the DomHandler is being set properly.  This is done by returning the
 * String [XmlAnyElementTestCases.RETURN_STRING] in the getElement call.
 *
 */
public class MyInvalidDomHandler implements DomHandler {
    W3CDomHandler theHandler;

    public MyInvalidDomHandler() {
        theHandler = new W3CDomHandler();
    }

    public Result createUnmarshaller(ValidationEventHandler errorHandler) {
        return theHandler.createUnmarshaller(errorHandler);
    }

    public Object getElement(Result rt) {
        return "Giggity";
    }

    public Source marshal(Object n, ValidationEventHandler errorHandler) {
        if (n instanceof Element) {
            return theHandler.marshal((Element) n, errorHandler);
        }
        return null;
    }
}

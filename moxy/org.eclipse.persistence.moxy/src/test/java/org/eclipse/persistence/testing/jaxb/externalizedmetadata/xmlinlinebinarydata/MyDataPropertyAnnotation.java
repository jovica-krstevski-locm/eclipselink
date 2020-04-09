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

// Contributors:
// dmccann - January 13/2010 - 2.0 - Initial implementation
package org.eclipse.persistence.testing.jaxb.externalizedmetadata.xmlinlinebinarydata;

import java.util.Arrays;

import jakarta.activation.DataHandler;

@jakarta.xml.bind.annotation.XmlRootElement(name="my-data")
public class MyDataPropertyAnnotation {
    private DataHandler myDataHandler;

    @jakarta.xml.bind.annotation.XmlInlineBinaryData
    public byte[] bytes;

    @jakarta.xml.bind.annotation.XmlInlineBinaryData
    public DataHandler getData() { return myDataHandler; }
    public void setData(DataHandler data) { myDataHandler = data; }

    public boolean equals(Object obj) {
        MyDataPropertyAnnotation mdObj;
        try {
            mdObj = (MyDataPropertyAnnotation) obj;
        } catch (ClassCastException cce) {
            return false;
        }
        return Arrays.equals(bytes, mdObj.bytes);
    }
}

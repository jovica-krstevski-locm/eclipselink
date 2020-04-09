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
//     Denise Smith - September 2013
package org.eclipse.persistence.testing.jaxb.annotations.xmlelementdecl.xsitype;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import org.eclipse.persistence.platform.xml.XMLComparer;
import org.w3c.dom.Node;

@XmlType(name = "ExampleType")
public class ExampleType {

    @XmlElement(name = "Content")
    public Object content;

    public boolean equals(Object obj) {
        if(obj instanceof ExampleType){
            if(content != null && content instanceof Node){
                XMLComparer comparer = new XMLComparer();
                return comparer.isNodeEqual((Node)content,(Node) ((ExampleType)obj).content);
            }
            return (content == null && ((ExampleType)obj).content == null)
             || (content != null && content.equals(((ExampleType)obj).content));
        }
        return false;
    }
}



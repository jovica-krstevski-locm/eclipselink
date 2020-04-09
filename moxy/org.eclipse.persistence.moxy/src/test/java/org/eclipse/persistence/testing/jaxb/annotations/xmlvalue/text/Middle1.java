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
//     Blaise Doughan - 2.3.3 - initial implementation
package org.eclipse.persistence.testing.jaxb.annotations.xmlvalue.text;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlValue;

import org.eclipse.persistence.oxm.annotations.XmlInverseReference;

public class Middle1 {

    @XmlInverseReference(mappedBy="middle1")
    public Top top;

    @XmlAttribute
    public String middle1Attr;

    @XmlValue
    public Middle2 middle2;

    @Override
    public boolean equals(Object obj) {
        if(null == obj || obj.getClass() != this.getClass()) {
            return false;
        }
        Middle1 test = (Middle1) obj;
        if(!equals(top == null, test.top == null)) {
            return false;
        }
        if(!equals(middle1Attr, test.middle1Attr)) {
            return false;
        }
        if(!equals(middle2, test.middle2)) {
            return false;
        }
        return true;
    }

    private boolean equals(Object control, Object test) {
        if(null == control) {
            return null == test;
        }
        return control.equals(test);
    }

}

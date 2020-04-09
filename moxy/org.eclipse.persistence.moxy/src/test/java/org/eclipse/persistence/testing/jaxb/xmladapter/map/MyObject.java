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
//     Denise Smith - March 2, 2010
package org.eclipse.persistence.testing.jaxb.xmladapter.map;

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlList;

public class MyObject {
    @XmlList
    List<String> keys;
    @XmlList
    List<String> values;

    public MyObject(){
        keys = new ArrayList<String>();
        values = new ArrayList<String>();
    }

    public List<String> getKeys() {
        return keys;
    }

    public void setKeys(List<String> keys) {
        this.keys = keys;
    }

    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> values) {
        this.values = values;
    }
}

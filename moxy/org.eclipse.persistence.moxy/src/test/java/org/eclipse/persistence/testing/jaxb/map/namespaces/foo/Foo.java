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
//     Denise Smith  February, 2013
package org.eclipse.persistence.testing.jaxb.map.namespaces.foo;

import java.util.*;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Foo {

    public Map<String, String> map = new HashMap<String, String>();

    public boolean equals(Object obj){
        if(obj instanceof Foo){
            return map.equals(((Foo)obj).map);
        }
        return false;
    }
}

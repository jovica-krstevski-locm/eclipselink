/*
 * Copyright (c) 2014, 2020 Oracle and/or its affiliates. All rights reserved.
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
//     Blaise Doughan - 2.5.1 - initial implementation
package org.eclipse.persistence.testing.jaxb.cycle.inverse;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Root {

    public Foo foo;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Root root = (Root) o;

        if (foo != null ? !foo.equals(root.foo) : root.foo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return foo != null ? foo.hashCode() : 0;
    }
}

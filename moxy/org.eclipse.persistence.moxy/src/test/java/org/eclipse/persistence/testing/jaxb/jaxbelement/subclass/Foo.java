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
//    Denise Smith - April 2013
package org.eclipse.persistence.testing.jaxb.jaxbelement.subclass;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Foo
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("", "foo");

    public Foo(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public Foo() {
        super(NAME, ((Class) Object.class), null, null);
    }

}

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
//     Oracle - initial API and implementation from Oracle TopLink
package org.eclipse.persistence.testing.jaxb.schemagen.customizedmapping.xmltype;

import jakarta.xml.bind.annotation.*;

/**
 * Mapping: Class to Complex Type Definition
 * {base type definition} Component
 * if the class contains a mapped property or field
 * annotated with @XmlValue, then the schema
 * type to which mapped property or field's type is mapped.
 */
@XmlRootElement
public class BaseType001c {
    @XmlValue
    public boolean b01;

    public BaseType001c() {}
}

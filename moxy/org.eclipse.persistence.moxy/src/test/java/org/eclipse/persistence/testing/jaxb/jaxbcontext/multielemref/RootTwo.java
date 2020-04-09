/*
 * Copyright (c) 2013, 2020 Oracle and/or its affiliates. All rights reserved.
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
//  - rbarkhouse - 08 March 2013 - 2.4.2 - Initial implementation
package org.eclipse.persistence.testing.jaxb.jaxbcontext.multielemref;

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;

@XmlRootElement
public class RootTwo {

    @XmlElementRef
    public Data data;

    @XmlElementRef
    public Parent thing;

}

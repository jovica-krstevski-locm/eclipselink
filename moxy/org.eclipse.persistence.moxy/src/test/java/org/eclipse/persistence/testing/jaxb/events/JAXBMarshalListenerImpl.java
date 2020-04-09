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
package org.eclipse.persistence.testing.jaxb.events;

import java.util.ArrayList;

import jakarta.xml.bind.*;


public class JAXBMarshalListenerImpl extends Marshaller.Listener {
    static Integer EMPLOYEE_BEFORE_MARSHAL = new Integer(0);
    static Integer ADDRESS_BEFORE_MARSHAL = new Integer(1);
    static Integer PHONE_BEFORE_MARSHAL = new Integer(2);
    static Integer EMPLOYEE_AFTER_MARSHAL = new Integer(3);
    static Integer ADDRESS_AFTER_MARSHAL = new Integer(4);
    static Integer PHONE_AFTER_MARSHAL = new Integer(5);

    public ArrayList events = null;

    public JAXBMarshalListenerImpl() {
        events = new ArrayList();
    }
    public void beforeMarshal(Object obj) {
        if(obj instanceof Employee) {
            events.add(EMPLOYEE_BEFORE_MARSHAL);
        } else if(obj instanceof Address) {
            events.add(ADDRESS_BEFORE_MARSHAL);
        } else if(obj instanceof PhoneNumber) {
            events.add(PHONE_BEFORE_MARSHAL);
        }
    }
    public void afterMarshal(Object obj) {
        if(obj instanceof Employee) {
            events.add(EMPLOYEE_AFTER_MARSHAL);
        } else if(obj instanceof Address) {
            events.add(ADDRESS_AFTER_MARSHAL);
        } else if(obj instanceof PhoneNumber) {
            events.add(PHONE_AFTER_MARSHAL);
        }
    }
}


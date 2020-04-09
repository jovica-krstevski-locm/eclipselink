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
//     Blaise Doughan - 2.5.2 - initial implementation
package org.eclipse.persistence.testing.jaxb.typevariable;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="root")
public class ExtendedList10Root implements ExtendedList8Interface {



        public ExtendedList10<Integer, ExtendedList10Root, Float> foo;

        @Override
        public boolean equals(Object obj) {

            if(null == obj || obj.getClass() != this.getClass()) {
                return false;
            }
            ExtendedList10Root test = (ExtendedList10Root) obj;
            if(null == foo) {
                return null == test.foo;
            } else {
                return foo.equals(test.foo);
            }
        }
    }

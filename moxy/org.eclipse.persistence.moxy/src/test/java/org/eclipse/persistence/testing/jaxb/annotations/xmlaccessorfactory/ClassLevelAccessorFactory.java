/*
 * Copyright (c) 2012, 2020 Oracle and/or its affiliates. All rights reserved.
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
//     Matt MacIvor - 2.4 - Initial Implementation
package org.eclipse.persistence.testing.jaxb.annotations.xmlaccessorfactory;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import jakarta.xml.bind.JAXBException;

import com.sun.xml.bind.AccessorFactory;
import com.sun.xml.bind.api.AccessorException;
import com.sun.xml.bind.v2.runtime.reflect.Accessor;

public class ClassLevelAccessorFactory implements AccessorFactory {

    public Accessor createFieldAccessor(Class beanClass, Field field, boolean isReadOnly) throws JAXBException {
        return new ClassLevelAccessorFactory.MyCustomFieldAccessor(beanClass);
    }

    public Accessor createPropertyAccessor(Class beanClass, Method getMethod, Method setMethod) throws JAXBException {
        return new ClassLevelAccessorFactory.MyCustomPropertyAccessor(beanClass);
    }


    public static class MyCustomFieldAccessor extends Accessor {

        protected MyCustomFieldAccessor(Class valueType) {
            super(valueType);
        }

        public Object get(Object arg0) throws AccessorException {
            CustomerClassOverride cust = (CustomerClassOverride)arg0;
            return "class:field:" + cust.fieldProperty;
        }

        public void set(Object arg0, Object arg1) throws AccessorException {
            String value = (String)arg1;
            value = value.substring(value.lastIndexOf(":") + 1);
            ((CustomerClassOverride)arg0).fieldProperty = value;
        }
    }

    public class MyCustomPropertyAccessor extends Accessor{

        protected MyCustomPropertyAccessor(Class valueType) {
            super(valueType);
        }

        public Object get(Object arg0) throws AccessorException {
            CustomerClassOverride cust = (CustomerClassOverride)arg0;
            return "class:prop:" + cust.getProperty();
        }

        public void set(Object arg0, Object arg1) throws AccessorException {
            String value = (String)arg1;
            value = value.substring(value.lastIndexOf(":") + 1);
            ((CustomerClassOverride)arg0).setProperty(value);
        }
    }
}

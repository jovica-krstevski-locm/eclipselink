/*
 * Copyright (c) 2016, 2020 Oracle and/or its affiliates. All rights reserved.
 * Copyright (c) 2016 IBM Corporation. All rights reserved.
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
//     12/05/2016-2.6 Jody Grassel
//       - 443546: Converter autoApply does not work for primitive types

package org.eclipse.persistence.jpa.converter.model.autoapply;

import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ConvertEntityIW2S {
    @Id
    private long id;
    
    private Integer valueConvert;
    
    @Convert(disableConversion=true)
    private Integer valueNoConvert;
    
    public ConvertEntityIW2S() {
        
    }
    
    public ConvertEntityIW2S(long id) {
        this.id = id;
    }
    
    public ConvertEntityIW2S(long id, Integer valueConvert, Integer valueNoConvert) {
        this.id = id;
        this.valueConvert = valueConvert;
        this.valueNoConvert = valueNoConvert;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Integer getValueConvert() {
        return valueConvert;
    }

    public void setValueConvert(Integer valueConvert) {
        this.valueConvert = valueConvert;
    }

    public Integer getValueNoConvert() {
        return valueNoConvert;
    }

    public void setValueNoConvert(Integer valueNoConvert) {
        this.valueNoConvert = valueNoConvert;
    }

    @Override
    public String toString() {
        return "ConvertEntityIw2S [id=" + id + ", valueConvert=" + valueConvert + ", valueNoConvert=" + valueNoConvert + "]";
    }
    
    
}

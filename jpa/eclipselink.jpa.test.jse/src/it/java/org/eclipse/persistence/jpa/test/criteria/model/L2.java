/*
 * Copyright (c) 2018, 2020 Oracle and/or its affiliates. All rights reserved.
 * Copyright (c) 2018 IBM Corporation. All rights reserved.
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
//     10/01/2018: Will Dazey
//       - #253: Add support for embedded constructor results with CriteriaBuilder
package org.eclipse.persistence.jpa.test.criteria.model;

import jakarta.persistence.*;

@Entity
public class L2 {

    @Id @Column(name="ID")
    private Integer id;

    @Column(name="NAME")
    private String name;

    public L2() {}

    public L2(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}

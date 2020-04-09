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
package org.eclipse.persistence.testing.models.jpa.inheritance;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumns;
import jakarta.persistence.Table;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@Table(name="CMP3_DESKTOP")
@PrimaryKeyJoinColumns({
    @PrimaryKeyJoinColumn(name="DT_MFR", referencedColumnName="MFR"),
    @PrimaryKeyJoinColumn(name="DT_SNO", referencedColumnName="SNO")
})
public class Desktop extends Computer {
    public Desktop() {}

    public Desktop(ComputerPK computerPK) {
        super(computerPK);
    }
}

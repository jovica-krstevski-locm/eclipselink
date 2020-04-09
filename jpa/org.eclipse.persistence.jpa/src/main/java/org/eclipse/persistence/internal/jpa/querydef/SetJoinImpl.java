/*
 * Copyright (c) 2011, 2020 Oracle and/or its affiliates. All rights reserved.
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
//     Gordon Yorke - Initial development
//

package org.eclipse.persistence.internal.jpa.querydef;

import jakarta.persistence.criteria.Expression;
import jakarta.persistence.criteria.JoinType;
import jakarta.persistence.criteria.Path;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.SetJoin;
import jakarta.persistence.metamodel.Bindable;
import jakarta.persistence.metamodel.ManagedType;
import jakarta.persistence.metamodel.Metamodel;

/**
 * <p>
 * <b>Purpose</b>: Contains the implementation of the Join interface of the JPA
 * criteria API.
 * <p>
 * <b>Description</b>: This class represents a join of an attribute from a "From"element.
 * <p>
 *
 * @see jakarta.persistence.criteria ListJoin
 *
 * @author gyorke
 * @since EclipseLink 1.2
 */

public class SetJoinImpl<Z, X>  extends JoinImpl<Z, X> implements SetJoin<Z, X>{

    public <T> SetJoinImpl(Path<Z> parentPath, ManagedType managedType, Metamodel metamodel, Class<X> javaClass, org.eclipse.persistence.expressions.Expression expressionNode, Bindable<T> modelArtifact){
        this(parentPath, managedType, metamodel, javaClass, expressionNode, modelArtifact,JoinType.INNER);
    }

    public <T> SetJoinImpl(Path<Z> parentPath, ManagedType managedType, Metamodel metamodel, Class<X> javaClass, org.eclipse.persistence.expressions.Expression expressionNode, Bindable<T> modelArtifact, JoinType joinType){
        super(parentPath, managedType, metamodel, javaClass, expressionNode, modelArtifact, joinType);
    }

    public <T> SetJoinImpl(Path<Z> parentPath, ManagedType managedType, Metamodel metamodel, Class<X> javaClass, org.eclipse.persistence.expressions.Expression expressionNode, Bindable<T> modelArtifact, JoinType joinType, FromImpl correlatedParent){
        super(parentPath, managedType, metamodel, javaClass, expressionNode, modelArtifact, joinType, correlatedParent);
    }

    /**
    * Return the metamodel representation for the collection.
    * @return metamodel type representing the Collection that is
    * the target of the join
    */
    @Override
    public jakarta.persistence.metamodel.SetAttribute<? super Z, X> getModel(){
        return (jakarta.persistence.metamodel.SetAttribute<? super Z, X>)this.modelArtifact;
    }

    @Override
    public SetJoinImpl<Z, X> on(Expression<Boolean> restriction) {
        return (SetJoinImpl<Z, X>)super.on(restriction);
    }

    @Override
    public SetJoinImpl<Z, X> on(Predicate... restrictions) {
        return (SetJoinImpl<Z, X>)super.on(restrictions);
    }
}

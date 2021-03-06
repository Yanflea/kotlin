/*
 * Copyright 2010-2012 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package org.jetbrains.jet.di;

import org.jetbrains.jet.lang.types.expressions.ExpressionTypingServices;
import com.intellij.openapi.project.Project;
import org.jetbrains.jet.lang.resolve.calls.CallResolver;
import org.jetbrains.jet.lang.resolve.DescriptorResolver;
import org.jetbrains.jet.lang.resolve.AnnotationResolver;
import org.jetbrains.jet.lang.resolve.TypeResolver;
import org.jetbrains.jet.lang.resolve.QualifiedExpressionResolver;
import org.jetbrains.jet.lang.resolve.calls.OverloadingConflictResolver;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;

/* This file is generated by org.jetbrains.jet.di.AllInjectorsGenerator. DO NOT EDIT! */
public class InjectorForMacros {

    private ExpressionTypingServices expressionTypingServices;
    private final Project project;

    public InjectorForMacros(
        @NotNull Project project
    ) {
        this.expressionTypingServices = new ExpressionTypingServices();
        this.project = project;
        CallResolver callResolver = new CallResolver();
        DescriptorResolver descriptorResolver = new DescriptorResolver();
        AnnotationResolver annotationResolver = new AnnotationResolver();
        TypeResolver typeResolver = new TypeResolver();
        QualifiedExpressionResolver qualifiedExpressionResolver = new QualifiedExpressionResolver();
        OverloadingConflictResolver overloadingConflictResolver = new OverloadingConflictResolver();

        this.expressionTypingServices.setCallResolver(callResolver);
        this.expressionTypingServices.setDescriptorResolver(descriptorResolver);
        this.expressionTypingServices.setProject(project);
        this.expressionTypingServices.setTypeResolver(typeResolver);

        callResolver.setDescriptorResolver(descriptorResolver);
        callResolver.setExpressionTypingServices(expressionTypingServices);
        callResolver.setOverloadingConflictResolver(overloadingConflictResolver);
        callResolver.setTypeResolver(typeResolver);

        descriptorResolver.setAnnotationResolver(annotationResolver);
        descriptorResolver.setExpressionTypingServices(expressionTypingServices);
        descriptorResolver.setTypeResolver(typeResolver);

        annotationResolver.setCallResolver(callResolver);
        annotationResolver.setExpressionTypingServices(expressionTypingServices);

        typeResolver.setAnnotationResolver(annotationResolver);
        typeResolver.setDescriptorResolver(descriptorResolver);
        typeResolver.setQualifiedExpressionResolver(qualifiedExpressionResolver);

    }

    public ExpressionTypingServices getExpressionTypingServices() {
        return this.expressionTypingServices;
    }

    public Project getProject() {
        return this.project;
    }

}

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

/*
 * @author max
 */
package org.jetbrains.jet.plugin.highlighter;

import com.intellij.lang.ASTNode;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.psi.PsiElement;
import com.intellij.psi.impl.source.tree.LeafPsiElement;
import org.jetbrains.jet.lang.psi.*;
import org.jetbrains.jet.lexer.JetTokens;

class SoftKeywordsHighlightingVisitor extends HighlightingVisitor {
    SoftKeywordsHighlightingVisitor(AnnotationHolder holder) {
        super(holder);
    }

    @Override
    public void visitElement(PsiElement element) {
        if (element instanceof LeafPsiElement) {
            if (JetTokens.SOFT_KEYWORDS.contains(((LeafPsiElement) element).getElementType())) {
                holder.createInfoAnnotation(element, null).setTextAttributes(JetHighlightingColors.KEYWORD);
            }
        }
    }

    @Override
    public void visitFunctionLiteralExpression(JetFunctionLiteralExpression expression) {
        if (ApplicationManager.getApplication().isUnitTestMode()) return;
        JetFunctionLiteral functionLiteral = expression.getFunctionLiteral();
        holder.createInfoAnnotation(functionLiteral.getOpenBraceNode(), null).setTextAttributes(JetHighlightingColors.FUNCTION_LITERAL_BRACES);
        ASTNode closingBraceNode = functionLiteral.getClosingBraceNode();
        if (closingBraceNode != null) {
            holder.createInfoAnnotation(closingBraceNode, null).setTextAttributes(JetHighlightingColors.FUNCTION_LITERAL_BRACES);
        }
        ASTNode arrowNode = functionLiteral.getArrowNode();
        if (arrowNode != null) {
            holder.createInfoAnnotation(arrowNode, null).setTextAttributes(JetHighlightingColors.FUNCTION_LITERAL_BRACES);
        }
    }
}

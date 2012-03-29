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

package org.jetbrains.jet.plugin.highlighter;

import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.SyntaxHighlighterColors;
import com.intellij.openapi.editor.colors.CodeInsightColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.editor.markup.EffectType;
import com.intellij.openapi.editor.markup.TextAttributes;

import java.awt.*;

public class JetHighlightingColors {
    public final static TextAttributesKey KEYWORD = TextAttributesKey.createTextAttributesKey(
        "KOTLIN_KEYWORD",
        SyntaxHighlighterColors.KEYWORD.getDefaultAttributes()
    );

    public static final TextAttributesKey SOFT_KEYWORD = TextAttributesKey.createTextAttributesKey(
        "KOTLIN_SOFT_KEYWORD",
        SyntaxHighlighterColors.KEYWORD.getDefaultAttributes()
    );

    public static final TextAttributesKey NUMBER = TextAttributesKey.createTextAttributesKey(
        "KOTLIN_NUMBER",
        SyntaxHighlighterColors.NUMBER.getDefaultAttributes()
    );

    public static final TextAttributesKey STRING = TextAttributesKey.createTextAttributesKey(
        "KOTLIN_STRING",
        SyntaxHighlighterColors.STRING.getDefaultAttributes()
    );

    public static final TextAttributesKey VALID_STRING_ESCAPE = TextAttributesKey.createTextAttributesKey(
        "KOTLIN_VALID_STRING_ESCAPE",
        SyntaxHighlighterColors.VALID_STRING_ESCAPE.getDefaultAttributes()
    );

    public static final TextAttributesKey INVALID_STRING_ESCAPE = TextAttributesKey.createTextAttributesKey(
        "KOTLIN_INVALID_STRING_ESCAPE",
        SyntaxHighlighterColors.INVALID_STRING_ESCAPE.getDefaultAttributes()
    );

    public static final TextAttributesKey OPERATOR_SIGN = TextAttributesKey.createTextAttributesKey(
        "KOTLIN_OPERATION_SIGN",
        SyntaxHighlighterColors.OPERATION_SIGN.getDefaultAttributes()
    );

    public static final TextAttributesKey PARENTHESIS = TextAttributesKey.createTextAttributesKey(
        "KOTLIN_PARENTHESIS",
        SyntaxHighlighterColors.PARENTHS.getDefaultAttributes()
    );

    public static final TextAttributesKey BRACES = TextAttributesKey.createTextAttributesKey(
        "KOTLIN_BRACES",
        SyntaxHighlighterColors.BRACES.getDefaultAttributes()
    );

    public static final TextAttributesKey BRACKETS = TextAttributesKey.createTextAttributesKey(
        "KOTLIN_BRACKETS",
        SyntaxHighlighterColors.BRACKETS.getDefaultAttributes()
    );

    public static final TextAttributesKey FUNCTION_LITERAL_BRACES = TextAttributesKey.createTextAttributesKey(
        "KOTLIN_FUNCTION_LITERAL_BRACES",
        new TextAttributes(null, null, null, null, Font.BOLD)
    );

    public static final TextAttributesKey COMMA = TextAttributesKey.createTextAttributesKey(
        "KOTLIN_COMMA",
        SyntaxHighlighterColors.COMMA.getDefaultAttributes()
    );

    public static final TextAttributesKey SEMICOLON = TextAttributesKey.createTextAttributesKey(
        "KOTLIN_SEMICOLON",
        SyntaxHighlighterColors.JAVA_SEMICOLON.getDefaultAttributes()
    );

    public static final TextAttributesKey DOT = TextAttributesKey.createTextAttributesKey(
        "KOTLIN_DOT",
        SyntaxHighlighterColors.DOT.getDefaultAttributes()
    );

    public static final TextAttributesKey SAFE_ACCESS = TextAttributesKey.createTextAttributesKey(
        "KOTLIN_SAFE_ACCESS",
        SyntaxHighlighterColors.DOT.getDefaultAttributes()
    );

    public static final TextAttributesKey ARROW = TextAttributesKey.createTextAttributesKey(
        "KOTLIN_ARROW",
        SyntaxHighlighterColors.PARENTHS.getDefaultAttributes()
    );

    public static final TextAttributesKey LINE_COMMENT = TextAttributesKey.createTextAttributesKey(
        "KOTLIN_LINE_COMMENT",
        SyntaxHighlighterColors.LINE_COMMENT.getDefaultAttributes()
    );

    public static final TextAttributesKey BLOCK_COMMENT = TextAttributesKey.createTextAttributesKey(
        "KOTLIN_BLOCK_COMMENT",
        SyntaxHighlighterColors.JAVA_BLOCK_COMMENT.getDefaultAttributes()
    );

    public static final TextAttributesKey DOC_COMMENT = TextAttributesKey.createTextAttributesKey(
        "KOTLIN_DOC_COMMENT",
        SyntaxHighlighterColors.DOC_COMMENT.getDefaultAttributes()
    );

    public static final TextAttributesKey DOC_COMMENT_TAG = TextAttributesKey.createTextAttributesKey(
        "KOTLIN_DOC_COMMENT_TAG",
        SyntaxHighlighterColors.DOC_COMMENT_TAG.getDefaultAttributes()
    );

    public static final TextAttributesKey DOC_COMMENT_TAG_VALUE = TextAttributesKey.createTextAttributesKey(
        "KOTLIN_DOC_COMMENT_TAG_VALUE",
        CodeInsightColors.DOC_COMMENT_TAG_VALUE.getDefaultAttributes()
    );

    public static final TextAttributesKey DOC_COMMENT_MARKUP = TextAttributesKey.createTextAttributesKey(
        "KOTLIN_DOC_COMMENT_MARKUP",
        SyntaxHighlighterColors.DOC_COMMENT_MARKUP.getDefaultAttributes()
    );

    // TODO review: is it needed?
    public static final TextAttributesKey WRAPPED_INTO_REF = TextAttributesKey.createTextAttributesKey(
        "KOTLIN_WRAPPED_INTO_REF",
        new TextAttributes(null, null, Color.BLACK, EffectType.LINE_UNDERSCORE, Font.PLAIN)
    );

    public static final TextAttributesKey INSTANCE_PROPERTY_WITH_BACKING_FIELD = TextAttributesKey.createTextAttributesKey(
        "KOTLIN_INSTANCE_PROPERTY_WITH_BACKING_FIELD",
        CodeInsightColors.INSTANCE_FIELD_ATTRIBUTES.getDefaultAttributes()
    );

    public static final TextAttributesKey INSTANCE_BACKING_FIELD_ACCESS = TextAttributesKey.createTextAttributesKey(
        "KOTLIN_INSTANCE_BACKING_FIELD_ACCESS",
        CodeInsightColors.INSTANCE_FIELD_ATTRIBUTES.getDefaultAttributes()
    );

    public static final TextAttributesKey FUNCTION_LITERAL_DEFAULT_PARAMETER = TextAttributesKey.createTextAttributesKey(
        "KOTLIN_CLOSURE_DEFAULT_PARAMETER",
        new TextAttributes(null, null, null, null, Font.BOLD)
    );

    public static final TextAttributesKey BAD_CHARACTER = TextAttributesKey.createTextAttributesKey(
        "KOTLIN_BAD_CHARACTER",
        HighlighterColors.BAD_CHARACTER.getDefaultAttributes()
    );

    public static final TextAttributesKey AUTO_CASTED_VALUE = TextAttributesKey.createTextAttributesKey(
        "KOTLIN_AUTO_CASTED_VALUE",
        new TextAttributes(STRING.getDefaultAttributes().getForegroundColor(), null, null, null, Font.PLAIN)
    );

    public static final TextAttributesKey LABEL = TextAttributesKey.createTextAttributesKey(
        "KOTLIN_LABEL",
        new TextAttributes(new Color(74, 134, 232), null, null, null, Font.PLAIN)
    );

    public static final TextAttributesKey DEBUG_INFO = TextAttributesKey.createTextAttributesKey(
        "KOTLIN_DEBUG_INFO",
        new TextAttributes(null, null, Color.BLACK, EffectType.ROUNDED_BOX, Font.PLAIN)
    );

    public static final TextAttributesKey RESOLVED_TO_ERROR = TextAttributesKey.createTextAttributesKey(
        "KOTLIN_RESOLVED_TO_ERROR",
        new TextAttributes(null, null, Color.RED, EffectType.ROUNDED_BOX, Font.PLAIN)
    );

    private JetHighlightingColors() {
    }
}

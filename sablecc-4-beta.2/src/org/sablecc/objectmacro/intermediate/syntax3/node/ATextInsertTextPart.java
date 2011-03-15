/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.objectmacro.intermediate.syntax3.node;

import org.sablecc.objectmacro.intermediate.syntax3.analysis.*;

@SuppressWarnings("nls")
public final class ATextInsertTextPart extends PTextPart
{
    private PTextInsert _textInsert_;

    public ATextInsertTextPart()
    {
        // Constructor
    }

    public ATextInsertTextPart(
        @SuppressWarnings("hiding") PTextInsert _textInsert_)
    {
        // Constructor
        setTextInsert(_textInsert_);

    }

    @Override
    public Object clone()
    {
        return new ATextInsertTextPart(
            cloneNode(this._textInsert_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATextInsertTextPart(this);
    }

    public PTextInsert getTextInsert()
    {
        return this._textInsert_;
    }

    public void setTextInsert(PTextInsert node)
    {
        if(this._textInsert_ != null)
        {
            this._textInsert_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._textInsert_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._textInsert_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._textInsert_ == child)
        {
            this._textInsert_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._textInsert_ == oldChild)
        {
            setTextInsert((PTextInsert) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}

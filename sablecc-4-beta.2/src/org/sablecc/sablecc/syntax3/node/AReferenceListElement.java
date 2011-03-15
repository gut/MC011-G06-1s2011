/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.syntax3.node;

import org.sablecc.sablecc.syntax3.analysis.*;

@SuppressWarnings("nls")
public final class AReferenceListElement extends PListElement
{
    private PElementReference _elementReference_;

    public AReferenceListElement()
    {
        // Constructor
    }

    public AReferenceListElement(
        @SuppressWarnings("hiding") PElementReference _elementReference_)
    {
        // Constructor
        setElementReference(_elementReference_);

    }

    @Override
    public Object clone()
    {
        return new AReferenceListElement(
            cloneNode(this._elementReference_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAReferenceListElement(this);
    }

    public PElementReference getElementReference()
    {
        return this._elementReference_;
    }

    public void setElementReference(PElementReference node)
    {
        if(this._elementReference_ != null)
        {
            this._elementReference_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._elementReference_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._elementReference_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._elementReference_ == child)
        {
            this._elementReference_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._elementReference_ == oldChild)
        {
            setElementReference((PElementReference) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}

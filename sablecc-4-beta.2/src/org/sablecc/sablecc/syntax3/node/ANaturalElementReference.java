/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.syntax3.node;

import org.sablecc.sablecc.syntax3.analysis.*;

@SuppressWarnings("nls")
public final class ANaturalElementReference extends PElementReference
{
    private TIdentifier _element_;

    public ANaturalElementReference()
    {
        // Constructor
    }

    public ANaturalElementReference(
        @SuppressWarnings("hiding") TIdentifier _element_)
    {
        // Constructor
        setElement(_element_);

    }

    @Override
    public Object clone()
    {
        return new ANaturalElementReference(
            cloneNode(this._element_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANaturalElementReference(this);
    }

    public TIdentifier getElement()
    {
        return this._element_;
    }

    public void setElement(TIdentifier node)
    {
        if(this._element_ != null)
        {
            this._element_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._element_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._element_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._element_ == child)
        {
            this._element_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._element_ == oldChild)
        {
            setElement((TIdentifier) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}

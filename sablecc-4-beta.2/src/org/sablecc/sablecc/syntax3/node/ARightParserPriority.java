/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.syntax3.node;

import java.util.*;
import org.sablecc.sablecc.syntax3.analysis.*;

@SuppressWarnings("nls")
public final class ARightParserPriority extends PParserPriority
{
    private TRightKeyword _rightKeyword_;
    private final LinkedList<TIdentifier> _identifiers_ = new LinkedList<TIdentifier>();

    public ARightParserPriority()
    {
        // Constructor
    }

    public ARightParserPriority(
        @SuppressWarnings("hiding") TRightKeyword _rightKeyword_,
        @SuppressWarnings("hiding") List<TIdentifier> _identifiers_)
    {
        // Constructor
        setRightKeyword(_rightKeyword_);

        setIdentifiers(_identifiers_);

    }

    @Override
    public Object clone()
    {
        return new ARightParserPriority(
            cloneNode(this._rightKeyword_),
            cloneList(this._identifiers_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseARightParserPriority(this);
    }

    public TRightKeyword getRightKeyword()
    {
        return this._rightKeyword_;
    }

    public void setRightKeyword(TRightKeyword node)
    {
        if(this._rightKeyword_ != null)
        {
            this._rightKeyword_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rightKeyword_ = node;
    }

    public LinkedList<TIdentifier> getIdentifiers()
    {
        return this._identifiers_;
    }

    public void setIdentifiers(List<TIdentifier> list)
    {
        this._identifiers_.clear();
        this._identifiers_.addAll(list);
        for(TIdentifier e : list)
        {
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._rightKeyword_)
            + toString(this._identifiers_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._rightKeyword_ == child)
        {
            this._rightKeyword_ = null;
            return;
        }

        if(this._identifiers_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._rightKeyword_ == oldChild)
        {
            setRightKeyword((TRightKeyword) newChild);
            return;
        }

        for(ListIterator<TIdentifier> i = this._identifiers_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((TIdentifier) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}

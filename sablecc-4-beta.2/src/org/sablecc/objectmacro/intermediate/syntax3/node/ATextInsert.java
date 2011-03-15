/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.objectmacro.intermediate.syntax3.node;

import java.util.*;
import org.sablecc.objectmacro.intermediate.syntax3.analysis.*;

@SuppressWarnings("nls")
public final class ATextInsert extends PTextInsert
{
    private TString _name_;
    private final LinkedList<PValue> _args_ = new LinkedList<PValue>();
    private final LinkedList<TString> _ancestorRefs_ = new LinkedList<TString>();

    public ATextInsert()
    {
        // Constructor
    }

    public ATextInsert(
        @SuppressWarnings("hiding") TString _name_,
        @SuppressWarnings("hiding") List<PValue> _args_,
        @SuppressWarnings("hiding") List<TString> _ancestorRefs_)
    {
        // Constructor
        setName(_name_);

        setArgs(_args_);

        setAncestorRefs(_ancestorRefs_);

    }

    @Override
    public Object clone()
    {
        return new ATextInsert(
            cloneNode(this._name_),
            cloneList(this._args_),
            cloneList(this._ancestorRefs_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATextInsert(this);
    }

    public TString getName()
    {
        return this._name_;
    }

    public void setName(TString node)
    {
        if(this._name_ != null)
        {
            this._name_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._name_ = node;
    }

    public LinkedList<PValue> getArgs()
    {
        return this._args_;
    }

    public void setArgs(List<PValue> list)
    {
        this._args_.clear();
        this._args_.addAll(list);
        for(PValue e : list)
        {
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
        }
    }

    public LinkedList<TString> getAncestorRefs()
    {
        return this._ancestorRefs_;
    }

    public void setAncestorRefs(List<TString> list)
    {
        this._ancestorRefs_.clear();
        this._ancestorRefs_.addAll(list);
        for(TString e : list)
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
            + toString(this._name_)
            + toString(this._args_)
            + toString(this._ancestorRefs_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._name_ == child)
        {
            this._name_ = null;
            return;
        }

        if(this._args_.remove(child))
        {
            return;
        }

        if(this._ancestorRefs_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._name_ == oldChild)
        {
            setName((TString) newChild);
            return;
        }

        for(ListIterator<PValue> i = this._args_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PValue) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        for(ListIterator<TString> i = this._ancestorRefs_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((TString) newChild);
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

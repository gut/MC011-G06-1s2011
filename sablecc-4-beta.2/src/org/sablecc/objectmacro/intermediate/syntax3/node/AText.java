/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.objectmacro.intermediate.syntax3.node;

import java.util.*;
import org.sablecc.objectmacro.intermediate.syntax3.analysis.*;

@SuppressWarnings("nls")
public final class AText extends PText
{
    private TString _name_;
    private final LinkedList<TString> _params_ = new LinkedList<TString>();
    private PBoolean _selfRef_;
    private final LinkedList<TString> _ancestorRefs_ = new LinkedList<TString>();
    private final LinkedList<PParamRef> _paramRefs_ = new LinkedList<PParamRef>();
    private final LinkedList<PTextPart> _textParts_ = new LinkedList<PTextPart>();

    public AText()
    {
        // Constructor
    }

    public AText(
        @SuppressWarnings("hiding") TString _name_,
        @SuppressWarnings("hiding") List<TString> _params_,
        @SuppressWarnings("hiding") PBoolean _selfRef_,
        @SuppressWarnings("hiding") List<TString> _ancestorRefs_,
        @SuppressWarnings("hiding") List<PParamRef> _paramRefs_,
        @SuppressWarnings("hiding") List<PTextPart> _textParts_)
    {
        // Constructor
        setName(_name_);

        setParams(_params_);

        setSelfRef(_selfRef_);

        setAncestorRefs(_ancestorRefs_);

        setParamRefs(_paramRefs_);

        setTextParts(_textParts_);

    }

    @Override
    public Object clone()
    {
        return new AText(
            cloneNode(this._name_),
            cloneList(this._params_),
            cloneNode(this._selfRef_),
            cloneList(this._ancestorRefs_),
            cloneList(this._paramRefs_),
            cloneList(this._textParts_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAText(this);
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

    public LinkedList<TString> getParams()
    {
        return this._params_;
    }

    public void setParams(List<TString> list)
    {
        this._params_.clear();
        this._params_.addAll(list);
        for(TString e : list)
        {
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
        }
    }

    public PBoolean getSelfRef()
    {
        return this._selfRef_;
    }

    public void setSelfRef(PBoolean node)
    {
        if(this._selfRef_ != null)
        {
            this._selfRef_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._selfRef_ = node;
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

    public LinkedList<PParamRef> getParamRefs()
    {
        return this._paramRefs_;
    }

    public void setParamRefs(List<PParamRef> list)
    {
        this._paramRefs_.clear();
        this._paramRefs_.addAll(list);
        for(PParamRef e : list)
        {
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
        }
    }

    public LinkedList<PTextPart> getTextParts()
    {
        return this._textParts_;
    }

    public void setTextParts(List<PTextPart> list)
    {
        this._textParts_.clear();
        this._textParts_.addAll(list);
        for(PTextPart e : list)
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
            + toString(this._params_)
            + toString(this._selfRef_)
            + toString(this._ancestorRefs_)
            + toString(this._paramRefs_)
            + toString(this._textParts_);
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

        if(this._params_.remove(child))
        {
            return;
        }

        if(this._selfRef_ == child)
        {
            this._selfRef_ = null;
            return;
        }

        if(this._ancestorRefs_.remove(child))
        {
            return;
        }

        if(this._paramRefs_.remove(child))
        {
            return;
        }

        if(this._textParts_.remove(child))
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

        for(ListIterator<TString> i = this._params_.listIterator(); i.hasNext();)
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

        if(this._selfRef_ == oldChild)
        {
            setSelfRef((PBoolean) newChild);
            return;
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

        for(ListIterator<PParamRef> i = this._paramRefs_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PParamRef) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        for(ListIterator<PTextPart> i = this._textParts_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PTextPart) newChild);
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

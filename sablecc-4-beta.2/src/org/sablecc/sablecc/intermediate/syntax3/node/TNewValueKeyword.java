/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.intermediate.syntax3.node;

import org.sablecc.sablecc.intermediate.syntax3.analysis.*;

@SuppressWarnings("nls")
public final class TNewValueKeyword extends Token
{
    public TNewValueKeyword()
    {
        super.setText("new_value");
    }

    public TNewValueKeyword(int line, int pos)
    {
        super.setText("new_value");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TNewValueKeyword(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTNewValueKeyword(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TNewValueKeyword text.");
    }
}

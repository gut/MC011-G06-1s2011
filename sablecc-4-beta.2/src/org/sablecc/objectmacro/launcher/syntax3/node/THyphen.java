/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.objectmacro.launcher.syntax3.node;

import org.sablecc.objectmacro.launcher.syntax3.analysis.*;

@SuppressWarnings("nls")
public final class THyphen extends Token
{
    public THyphen()
    {
        super.setText("-");
    }

    public THyphen(int line, int pos)
    {
        super.setText("-");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new THyphen(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTHyphen(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change THyphen text.");
    }
}

/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.objectmacro.syntax3.node;

import org.sablecc.objectmacro.syntax3.analysis.*;

@SuppressWarnings("nls")
public final class TEndCommand extends Token
{
    public TEndCommand()
    {
        super.setText("$end:");
    }

    public TEndCommand(int line, int pos)
    {
        super.setText("$end:");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TEndCommand(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTEndCommand(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TEndCommand text.");
    }
}

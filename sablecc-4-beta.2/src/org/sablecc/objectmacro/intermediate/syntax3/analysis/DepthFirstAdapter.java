/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.objectmacro.intermediate.syntax3.analysis;

import java.util.*;
import org.sablecc.objectmacro.intermediate.syntax3.node.*;

public class DepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    @Override
    public void caseStart(Start node)
    {
        inStart(node);
        node.getPIntermediateRepresentation().apply(this);
        node.getEOF().apply(this);
        outStart(node);
    }

    public void inAIntermediateRepresentation(AIntermediateRepresentation node)
    {
        defaultIn(node);
    }

    public void outAIntermediateRepresentation(AIntermediateRepresentation node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIntermediateRepresentation(AIntermediateRepresentation node)
    {
        inAIntermediateRepresentation(node);
        {
            List<PText> copy = new ArrayList<PText>(node.getTexts());
            for(PText e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<PMacro> copy = new ArrayList<PMacro>(node.getMacros());
            for(PMacro e : copy)
            {
                e.apply(this);
            }
        }
        outAIntermediateRepresentation(node);
    }

    public void inAText(AText node)
    {
        defaultIn(node);
    }

    public void outAText(AText node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAText(AText node)
    {
        inAText(node);
        if(node.getName() != null)
        {
            node.getName().apply(this);
        }
        {
            List<TString> copy = new ArrayList<TString>(node.getParams());
            for(TString e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getSelfRef() != null)
        {
            node.getSelfRef().apply(this);
        }
        {
            List<TString> copy = new ArrayList<TString>(node.getAncestorRefs());
            for(TString e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<PParamRef> copy = new ArrayList<PParamRef>(node.getParamRefs());
            for(PParamRef e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<PTextPart> copy = new ArrayList<PTextPart>(node.getTextParts());
            for(PTextPart e : copy)
            {
                e.apply(this);
            }
        }
        outAText(node);
    }

    public void inAMacro(AMacro node)
    {
        defaultIn(node);
    }

    public void outAMacro(AMacro node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMacro(AMacro node)
    {
        inAMacro(node);
        if(node.getName() != null)
        {
            node.getName().apply(this);
        }
        if(node.getIsPublic() != null)
        {
            node.getIsPublic().apply(this);
        }
        {
            List<TString> copy = new ArrayList<TString>(node.getParams());
            for(TString e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getSelfRef() != null)
        {
            node.getSelfRef().apply(this);
        }
        {
            List<TString> copy = new ArrayList<TString>(node.getAncestorRefs());
            for(TString e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<PParamRef> copy = new ArrayList<PParamRef>(node.getParamRefs());
            for(PParamRef e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<TString> copy = new ArrayList<TString>(node.getExpands());
            for(TString e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<PExpandedMacro> copy = new ArrayList<PExpandedMacro>(node.getExpandedMacros());
            for(PExpandedMacro e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<PMacroPart> copy = new ArrayList<PMacroPart>(node.getMacroParts());
            for(PMacroPart e : copy)
            {
                e.apply(this);
            }
        }
        outAMacro(node);
    }

    public void inAParamRef(AParamRef node)
    {
        defaultIn(node);
    }

    public void outAParamRef(AParamRef node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAParamRef(AParamRef node)
    {
        inAParamRef(node);
        if(node.getName() != null)
        {
            node.getName().apply(this);
        }
        if(node.getContext() != null)
        {
            node.getContext().apply(this);
        }
        outAParamRef(node);
    }

    public void inAExpandedMacro(AExpandedMacro node)
    {
        defaultIn(node);
    }

    public void outAExpandedMacro(AExpandedMacro node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpandedMacro(AExpandedMacro node)
    {
        inAExpandedMacro(node);
        if(node.getName() != null)
        {
            node.getName().apply(this);
        }
        {
            List<TString> copy = new ArrayList<TString>(node.getParams());
            for(TString e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<TString> copy = new ArrayList<TString>(node.getAncestorRefs());
            for(TString e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<TString> copy = new ArrayList<TString>(node.getExpands());
            for(TString e : copy)
            {
                e.apply(this);
            }
        }
        outAExpandedMacro(node);
    }

    public void inAStringTextPart(AStringTextPart node)
    {
        defaultIn(node);
    }

    public void outAStringTextPart(AStringTextPart node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStringTextPart(AStringTextPart node)
    {
        inAStringTextPart(node);
        if(node.getString() != null)
        {
            node.getString().apply(this);
        }
        outAStringTextPart(node);
    }

    public void inAEolTextPart(AEolTextPart node)
    {
        defaultIn(node);
    }

    public void outAEolTextPart(AEolTextPart node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEolTextPart(AEolTextPart node)
    {
        inAEolTextPart(node);
        outAEolTextPart(node);
    }

    public void inAParamInsertTextPart(AParamInsertTextPart node)
    {
        defaultIn(node);
    }

    public void outAParamInsertTextPart(AParamInsertTextPart node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAParamInsertTextPart(AParamInsertTextPart node)
    {
        inAParamInsertTextPart(node);
        if(node.getParamInsert() != null)
        {
            node.getParamInsert().apply(this);
        }
        outAParamInsertTextPart(node);
    }

    public void inATextInsertTextPart(ATextInsertTextPart node)
    {
        defaultIn(node);
    }

    public void outATextInsertTextPart(ATextInsertTextPart node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATextInsertTextPart(ATextInsertTextPart node)
    {
        inATextInsertTextPart(node);
        if(node.getTextInsert() != null)
        {
            node.getTextInsert().apply(this);
        }
        outATextInsertTextPart(node);
    }

    public void inAStringMacroPart(AStringMacroPart node)
    {
        defaultIn(node);
    }

    public void outAStringMacroPart(AStringMacroPart node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStringMacroPart(AStringMacroPart node)
    {
        inAStringMacroPart(node);
        if(node.getString() != null)
        {
            node.getString().apply(this);
        }
        outAStringMacroPart(node);
    }

    public void inAEolMacroPart(AEolMacroPart node)
    {
        defaultIn(node);
    }

    public void outAEolMacroPart(AEolMacroPart node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEolMacroPart(AEolMacroPart node)
    {
        inAEolMacroPart(node);
        outAEolMacroPart(node);
    }

    public void inAParamInsertMacroPart(AParamInsertMacroPart node)
    {
        defaultIn(node);
    }

    public void outAParamInsertMacroPart(AParamInsertMacroPart node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAParamInsertMacroPart(AParamInsertMacroPart node)
    {
        inAParamInsertMacroPart(node);
        if(node.getParamInsert() != null)
        {
            node.getParamInsert().apply(this);
        }
        outAParamInsertMacroPart(node);
    }

    public void inATextInsertMacroPart(ATextInsertMacroPart node)
    {
        defaultIn(node);
    }

    public void outATextInsertMacroPart(ATextInsertMacroPart node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATextInsertMacroPart(ATextInsertMacroPart node)
    {
        inATextInsertMacroPart(node);
        if(node.getTextInsert() != null)
        {
            node.getTextInsert().apply(this);
        }
        outATextInsertMacroPart(node);
    }

    public void inAExpandInsertMacroPart(AExpandInsertMacroPart node)
    {
        defaultIn(node);
    }

    public void outAExpandInsertMacroPart(AExpandInsertMacroPart node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpandInsertMacroPart(AExpandInsertMacroPart node)
    {
        inAExpandInsertMacroPart(node);
        if(node.getExpandInsert() != null)
        {
            node.getExpandInsert().apply(this);
        }
        outAExpandInsertMacroPart(node);
    }

    public void inAExpandInsert(AExpandInsert node)
    {
        defaultIn(node);
    }

    public void outAExpandInsert(AExpandInsert node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpandInsert(AExpandInsert node)
    {
        inAExpandInsert(node);
        if(node.getName() != null)
        {
            node.getName().apply(this);
        }
        if(node.getNone() != null)
        {
            node.getNone().apply(this);
        }
        if(node.getSeparator() != null)
        {
            node.getSeparator().apply(this);
        }
        if(node.getBeforeFirst() != null)
        {
            node.getBeforeFirst().apply(this);
        }
        if(node.getAfterLast() != null)
        {
            node.getAfterLast().apply(this);
        }
        if(node.getBeforeOne() != null)
        {
            node.getBeforeOne().apply(this);
        }
        if(node.getAfterOne() != null)
        {
            node.getAfterOne().apply(this);
        }
        if(node.getBeforeMany() != null)
        {
            node.getBeforeMany().apply(this);
        }
        if(node.getAfterMany() != null)
        {
            node.getAfterMany().apply(this);
        }
        outAExpandInsert(node);
    }

    public void inATextInsert(ATextInsert node)
    {
        defaultIn(node);
    }

    public void outATextInsert(ATextInsert node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATextInsert(ATextInsert node)
    {
        inATextInsert(node);
        if(node.getName() != null)
        {
            node.getName().apply(this);
        }
        {
            List<PValue> copy = new ArrayList<PValue>(node.getArgs());
            for(PValue e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<TString> copy = new ArrayList<TString>(node.getAncestorRefs());
            for(TString e : copy)
            {
                e.apply(this);
            }
        }
        outATextInsert(node);
    }

    public void inAInlineTextValue(AInlineTextValue node)
    {
        defaultIn(node);
    }

    public void outAInlineTextValue(AInlineTextValue node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAInlineTextValue(AInlineTextValue node)
    {
        inAInlineTextValue(node);
        {
            List<PInlineText> copy = new ArrayList<PInlineText>(node.getInlineTexts());
            for(PInlineText e : copy)
            {
                e.apply(this);
            }
        }
        outAInlineTextValue(node);
    }

    public void inAParamInsertValue(AParamInsertValue node)
    {
        defaultIn(node);
    }

    public void outAParamInsertValue(AParamInsertValue node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAParamInsertValue(AParamInsertValue node)
    {
        inAParamInsertValue(node);
        if(node.getParamInsert() != null)
        {
            node.getParamInsert().apply(this);
        }
        outAParamInsertValue(node);
    }

    public void inATextInsertValue(ATextInsertValue node)
    {
        defaultIn(node);
    }

    public void outATextInsertValue(ATextInsertValue node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATextInsertValue(ATextInsertValue node)
    {
        inATextInsertValue(node);
        if(node.getTextInsert() != null)
        {
            node.getTextInsert().apply(this);
        }
        outATextInsertValue(node);
    }

    public void inAStringInlineText(AStringInlineText node)
    {
        defaultIn(node);
    }

    public void outAStringInlineText(AStringInlineText node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStringInlineText(AStringInlineText node)
    {
        inAStringInlineText(node);
        if(node.getString() != null)
        {
            node.getString().apply(this);
        }
        outAStringInlineText(node);
    }

    public void inAEolInlineText(AEolInlineText node)
    {
        defaultIn(node);
    }

    public void outAEolInlineText(AEolInlineText node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEolInlineText(AEolInlineText node)
    {
        inAEolInlineText(node);
        outAEolInlineText(node);
    }

    public void inATrueBoolean(ATrueBoolean node)
    {
        defaultIn(node);
    }

    public void outATrueBoolean(ATrueBoolean node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATrueBoolean(ATrueBoolean node)
    {
        inATrueBoolean(node);
        outATrueBoolean(node);
    }

    public void inAFalseBoolean(AFalseBoolean node)
    {
        defaultIn(node);
    }

    public void outAFalseBoolean(AFalseBoolean node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFalseBoolean(AFalseBoolean node)
    {
        inAFalseBoolean(node);
        outAFalseBoolean(node);
    }
}

/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.java.macro;

public class MParamInsertPart {

    private final String pName;

    private final MParamInsertPart mParamInsertPart = this;

    public MParamInsertPart(
            String pName) {

        if (pName == null) {
            throw new NullPointerException();
        }
        this.pName = pName;
    }

    String pName() {

        return this.pName;
    }

    private String rName() {

        return this.mParamInsertPart.pName();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("    sb.append(r");
        sb.append(rName());
        sb.append("());");
        sb.append(System.getProperty("line.separator"));
        return sb.toString();
    }

}

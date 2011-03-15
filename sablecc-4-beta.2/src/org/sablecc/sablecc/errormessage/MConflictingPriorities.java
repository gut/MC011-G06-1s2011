/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.sablecc.errormessage;

public class MConflictingPriorities {

    private final String pLine;

    private final String pChar;

    private final String pHighToken;

    private final String pLowToken;

    private final String pContextLine;

    private final String pContextChar;

    private final MConflictingPriorities mConflictingPriorities = this;

    public MConflictingPriorities(
            String pLine,
            String pChar,
            String pHighToken,
            String pLowToken,
            String pContextLine,
            String pContextChar) {

        if (pLine == null) {
            throw new NullPointerException();
        }
        this.pLine = pLine;
        if (pChar == null) {
            throw new NullPointerException();
        }
        this.pChar = pChar;
        if (pHighToken == null) {
            throw new NullPointerException();
        }
        this.pHighToken = pHighToken;
        if (pLowToken == null) {
            throw new NullPointerException();
        }
        this.pLowToken = pLowToken;
        if (pContextLine == null) {
            throw new NullPointerException();
        }
        this.pContextLine = pContextLine;
        if (pContextChar == null) {
            throw new NullPointerException();
        }
        this.pContextChar = pContextChar;
    }

    String pLine() {

        return this.pLine;
    }

    String pChar() {

        return this.pChar;
    }

    String pHighToken() {

        return this.pHighToken;
    }

    String pLowToken() {

        return this.pLowToken;
    }

    String pContextLine() {

        return this.pContextLine;
    }

    String pContextChar() {

        return this.pContextChar;
    }

    private String rLine() {

        return this.mConflictingPriorities.pLine();
    }

    private String rChar() {

        return this.mConflictingPriorities.pChar();
    }

    private String rHighToken() {

        return this.mConflictingPriorities.pHighToken();
    }

    private String rLowToken() {

        return this.mConflictingPriorities.pLowToken();
    }

    private String rContextLine() {

        return this.mConflictingPriorities.pContextLine();
    }

    private String rContextChar() {

        return this.mConflictingPriorities.pContextChar();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(new MSemanticErrorHead().toString());
        sb.append(System.getProperty("line.separator"));
        sb.append("Line: ");
        sb.append(rLine());
        sb.append(System.getProperty("line.separator"));
        sb.append("Char: ");
        sb.append(rChar());
        sb.append(System.getProperty("line.separator"));
        sb.append("The priority of \"");
        sb.append(rHighToken());
        sb.append("\" over \"");
        sb.append(rLowToken());
        sb.append("\" conflicts with the reverse priority of line ");
        sb.append(rContextLine());
        sb.append(", char ");
        sb.append(rContextChar());
        sb.append(".");
        sb.append(System.getProperty("line.separator"));
        return sb.toString();
    }

}

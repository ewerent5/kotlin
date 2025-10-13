package ch.qos.logback.core.pattern;

/* loaded from: classes.dex */
public class SpacePadder {
    static final String[] SPACES = {" ", "  ", "    ", "        ", "                ", "                                "};

    public static final void leftPad(StringBuilder sb, String str, int i2) {
        int length = str != null ? str.length() : 0;
        if (length < i2) {
            spacePad(sb, i2 - length);
        }
        if (str != null) {
            sb.append(str);
        }
    }

    public static final void rightPad(StringBuilder sb, String str, int i2) {
        int length = str != null ? str.length() : 0;
        if (str != null) {
            sb.append(str);
        }
        if (length < i2) {
            spacePad(sb, i2 - length);
        }
    }

    public static final void spacePad(StringBuilder sb, int i2) {
        while (i2 >= 32) {
            sb.append(SPACES[5]);
            i2 -= 32;
        }
        for (int i3 = 4; i3 >= 0; i3--) {
            if (((1 << i3) & i2) != 0) {
                sb.append(SPACES[i3]);
            }
        }
    }
}
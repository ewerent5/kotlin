package ch.qos.logback.core.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class DatePatternToRegexUtil {
    final String datePattern;
    final int datePatternLength;
    final CharSequenceToRegexMapper regexMapper = new CharSequenceToRegexMapper();

    public DatePatternToRegexUtil(String str) {
        this.datePattern = str;
        this.datePatternLength = str.length();
    }

    private List<CharSequenceState> tokenize() {
        ArrayList arrayList = new ArrayList();
        CharSequenceState charSequenceState = null;
        for (int i2 = 0; i2 < this.datePatternLength; i2++) {
            char cCharAt = this.datePattern.charAt(i2);
            if (charSequenceState == null || charSequenceState.f3510c != cCharAt) {
                charSequenceState = new CharSequenceState(cCharAt);
                arrayList.add(charSequenceState);
            } else {
                charSequenceState.incrementOccurrences();
            }
        }
        return arrayList;
    }

    public String toRegex() {
        List<CharSequenceState> list = tokenize();
        StringBuilder sb = new StringBuilder();
        Iterator<CharSequenceState> it = list.iterator();
        while (it.hasNext()) {
            sb.append(this.regexMapper.toRegex(it.next()));
        }
        return sb.toString();
    }
}
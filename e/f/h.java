package e.f;

import java.io.IOException;
import java.io.Writer;

/* compiled from: CSVWriter.java */
/* loaded from: classes.dex */
public class h extends b {

    /* renamed from: h, reason: collision with root package name */
    protected final char f15634h;

    /* renamed from: i, reason: collision with root package name */
    protected final char f15635i;

    /* renamed from: j, reason: collision with root package name */
    protected final char f15636j;

    public h(Writer writer, char c2, char c3, char c4, String str) {
        super(writer, str);
        this.f15636j = c4;
        this.f15635i = c3;
        this.f15634h = c2;
    }

    private void d(boolean z, Appendable appendable, Boolean bool) throws IOException {
        char c2;
        if ((z || bool.booleanValue()) && (c2 = this.f15635i) != 0) {
            appendable.append(c2);
        }
    }

    @Override // e.f.b
    protected void c(String[] strArr, boolean z, Appendable appendable) throws IOException {
        if (strArr == null) {
            return;
        }
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (i2 != 0) {
                appendable.append(this.f15634h);
            }
            String str = strArr[i2];
            if (str != null) {
                Boolean boolValueOf = Boolean.valueOf(q(str));
                d(z, appendable, boolValueOf);
                if (boolValueOf.booleanValue()) {
                    j(str, appendable);
                } else {
                    appendable.append(str);
                }
                d(z, appendable, boolValueOf);
            }
        }
        appendable.append(this.f15591f);
        this.f15590e.write(appendable.toString());
    }

    protected boolean g(char c2) {
        char c3 = this.f15635i;
        if (c3 == 0) {
            if (c2 != c3 && c2 != this.f15636j && c2 != this.f15634h && c2 != '\n') {
                return false;
            }
        } else if (c2 != c3 && c2 != this.f15636j) {
            return false;
        }
        return true;
    }

    protected void i(Appendable appendable, char c2) throws IOException {
        if (this.f15636j != 0 && g(c2)) {
            appendable.append(this.f15636j);
        }
        appendable.append(c2);
    }

    protected void j(String str, Appendable appendable) throws IOException {
        for (int i2 = 0; i2 < str.length(); i2++) {
            i(appendable, str.charAt(i2));
        }
    }

    protected boolean q(String str) {
        return (str.indexOf(this.f15635i) == -1 && str.indexOf(this.f15636j) == -1 && str.indexOf(this.f15634h) == -1 && !str.contains("\n") && !str.contains("\r")) ? false : true;
    }
}
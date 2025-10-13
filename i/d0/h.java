package i.d0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Appendable.kt */
/* loaded from: classes3.dex */
public class h {
    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void a(Appendable appendable, T t, i.y.c.l<? super T, ? extends CharSequence> lVar) {
        i.y.d.l.d(appendable, "$this$appendElement");
        if (lVar != null) {
            appendable.append(lVar.invoke(t));
            return;
        }
        if (t != 0 ? t instanceof CharSequence : true) {
            appendable.append((CharSequence) t);
        } else if (t instanceof Character) {
            appendable.append(((Character) t).charValue());
        } else {
            appendable.append(String.valueOf(t));
        }
    }
}
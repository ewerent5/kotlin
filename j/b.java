package j;

/* compiled from: -Platform.kt */
/* loaded from: classes3.dex */
public final class b {
    public static final byte[] a(String str) {
        i.y.d.l.d(str, "$this$asUtf8ToByteArray");
        byte[] bytes = str.getBytes(i.d0.d.a);
        i.y.d.l.c(bytes, "(this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    public static final String b(byte[] bArr) {
        i.y.d.l.d(bArr, "$this$toUtf8String");
        return new String(bArr, i.d0.d.a);
    }
}
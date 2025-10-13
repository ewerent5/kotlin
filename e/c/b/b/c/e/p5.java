package e.c.b.b.c.e;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public final class p5 extends o5 {
    public static int a(int i2, int i3, int i4) {
        if (i3 <= 1073741823) {
            return Math.min(Math.max(i2, i3), 1073741823);
        }
        throw new IllegalArgumentException(s3.b("min (%s) must be less than or equal to max (%s)", Integer.valueOf(i3), 1073741823));
    }
}
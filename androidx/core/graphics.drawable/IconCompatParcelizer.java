package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(androidx.versionedparcelable.a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f907b = aVar.p(iconCompat.f907b, 1);
        iconCompat.f909d = aVar.j(iconCompat.f909d, 2);
        iconCompat.f910e = aVar.r(iconCompat.f910e, 3);
        iconCompat.f911f = aVar.p(iconCompat.f911f, 4);
        iconCompat.f912g = aVar.p(iconCompat.f912g, 5);
        iconCompat.f913h = (ColorStateList) aVar.r(iconCompat.f913h, 6);
        iconCompat.f915j = aVar.t(iconCompat.f915j, 7);
        iconCompat.l();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, androidx.versionedparcelable.a aVar) {
        aVar.x(true, true);
        iconCompat.m(aVar.f());
        int i2 = iconCompat.f907b;
        if (-1 != i2) {
            aVar.F(i2, 1);
        }
        byte[] bArr = iconCompat.f909d;
        if (bArr != null) {
            aVar.B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f910e;
        if (parcelable != null) {
            aVar.H(parcelable, 3);
        }
        int i3 = iconCompat.f911f;
        if (i3 != 0) {
            aVar.F(i3, 4);
        }
        int i4 = iconCompat.f912g;
        if (i4 != 0) {
            aVar.F(i4, 5);
        }
        ColorStateList colorStateList = iconCompat.f913h;
        if (colorStateList != null) {
            aVar.H(colorStateList, 6);
        }
        String str = iconCompat.f915j;
        if (str != null) {
            aVar.J(str, 7);
        }
    }
}
package com.google.android.gms.common.internal.w;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
public class c {
    private static <T extends Parcelable> void A(Parcel parcel, T t, int i2) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int iDataPosition2 = parcel.dataPosition();
        t.writeToParcel(parcel, i2);
        int iDataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(iDataPosition);
        parcel.writeInt(iDataPosition3 - iDataPosition2);
        parcel.setDataPosition(iDataPosition3);
    }

    public static int a(@RecentlyNonNull Parcel parcel) {
        return y(parcel, 20293);
    }

    public static void b(@RecentlyNonNull Parcel parcel, int i2) {
        z(parcel, i2);
    }

    public static void c(@RecentlyNonNull Parcel parcel, int i2, boolean z) {
        x(parcel, i2, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    public static void d(@RecentlyNonNull Parcel parcel, int i2, @RecentlyNonNull Boolean bool, boolean z) {
        if (bool != null) {
            x(parcel, i2, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z) {
            x(parcel, i2, 0);
        }
    }

    public static void e(@RecentlyNonNull Parcel parcel, int i2, @RecentlyNonNull Bundle bundle, boolean z) {
        if (bundle == null) {
            if (z) {
                x(parcel, i2, 0);
            }
        } else {
            int iY = y(parcel, i2);
            parcel.writeBundle(bundle);
            z(parcel, iY);
        }
    }

    public static void f(@RecentlyNonNull Parcel parcel, int i2, byte b2) {
        x(parcel, i2, 4);
        parcel.writeInt(b2);
    }

    public static void g(@RecentlyNonNull Parcel parcel, int i2, @RecentlyNonNull byte[] bArr, boolean z) {
        if (bArr == null) {
            if (z) {
                x(parcel, i2, 0);
            }
        } else {
            int iY = y(parcel, i2);
            parcel.writeByteArray(bArr);
            z(parcel, iY);
        }
    }

    public static void h(@RecentlyNonNull Parcel parcel, int i2, double d2) {
        x(parcel, i2, 8);
        parcel.writeDouble(d2);
    }

    public static void i(@RecentlyNonNull Parcel parcel, int i2, @RecentlyNonNull Double d2, boolean z) {
        if (d2 != null) {
            x(parcel, i2, 8);
            parcel.writeDouble(d2.doubleValue());
        } else if (z) {
            x(parcel, i2, 0);
        }
    }

    public static void j(@RecentlyNonNull Parcel parcel, int i2, float f2) {
        x(parcel, i2, 4);
        parcel.writeFloat(f2);
    }

    public static void k(@RecentlyNonNull Parcel parcel, int i2, @RecentlyNonNull Float f2, boolean z) {
        if (f2 != null) {
            x(parcel, i2, 4);
            parcel.writeFloat(f2.floatValue());
        } else if (z) {
            x(parcel, i2, 0);
        }
    }

    public static void l(@RecentlyNonNull Parcel parcel, int i2, @RecentlyNonNull IBinder iBinder, boolean z) {
        if (iBinder == null) {
            if (z) {
                x(parcel, i2, 0);
            }
        } else {
            int iY = y(parcel, i2);
            parcel.writeStrongBinder(iBinder);
            z(parcel, iY);
        }
    }

    public static void m(@RecentlyNonNull Parcel parcel, int i2, int i3) {
        x(parcel, i2, 4);
        parcel.writeInt(i3);
    }

    public static void n(@RecentlyNonNull Parcel parcel, int i2, @RecentlyNonNull int[] iArr, boolean z) {
        if (iArr == null) {
            if (z) {
                x(parcel, i2, 0);
            }
        } else {
            int iY = y(parcel, i2);
            parcel.writeIntArray(iArr);
            z(parcel, iY);
        }
    }

    public static void o(@RecentlyNonNull Parcel parcel, int i2, @RecentlyNonNull List<Integer> list, boolean z) {
        if (list == null) {
            if (z) {
                x(parcel, i2, 0);
                return;
            }
            return;
        }
        int iY = y(parcel, i2);
        int size = list.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeInt(list.get(i3).intValue());
        }
        z(parcel, iY);
    }

    public static void p(@RecentlyNonNull Parcel parcel, int i2, long j2) {
        x(parcel, i2, 8);
        parcel.writeLong(j2);
    }

    public static void q(@RecentlyNonNull Parcel parcel, int i2, @RecentlyNonNull Long l2, boolean z) {
        if (l2 != null) {
            x(parcel, i2, 8);
            parcel.writeLong(l2.longValue());
        } else if (z) {
            x(parcel, i2, 0);
        }
    }

    public static void r(@RecentlyNonNull Parcel parcel, int i2, @RecentlyNonNull Parcelable parcelable, int i3, boolean z) {
        if (parcelable == null) {
            if (z) {
                x(parcel, i2, 0);
            }
        } else {
            int iY = y(parcel, i2);
            parcelable.writeToParcel(parcel, i3);
            z(parcel, iY);
        }
    }

    public static void s(@RecentlyNonNull Parcel parcel, int i2, @RecentlyNonNull String str, boolean z) {
        if (str == null) {
            if (z) {
                x(parcel, i2, 0);
            }
        } else {
            int iY = y(parcel, i2);
            parcel.writeString(str);
            z(parcel, iY);
        }
    }

    public static void t(@RecentlyNonNull Parcel parcel, int i2, @RecentlyNonNull String[] strArr, boolean z) {
        if (strArr == null) {
            if (z) {
                x(parcel, i2, 0);
            }
        } else {
            int iY = y(parcel, i2);
            parcel.writeStringArray(strArr);
            z(parcel, iY);
        }
    }

    public static void u(@RecentlyNonNull Parcel parcel, int i2, @RecentlyNonNull List<String> list, boolean z) {
        if (list == null) {
            if (z) {
                x(parcel, i2, 0);
            }
        } else {
            int iY = y(parcel, i2);
            parcel.writeStringList(list);
            z(parcel, iY);
        }
    }

    public static <T extends Parcelable> void v(@RecentlyNonNull Parcel parcel, int i2, @RecentlyNonNull T[] tArr, int i3, boolean z) {
        if (tArr == null) {
            if (z) {
                x(parcel, i2, 0);
                return;
            }
            return;
        }
        int iY = y(parcel, i2);
        parcel.writeInt(tArr.length);
        for (T t : tArr) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                A(parcel, t, i3);
            }
        }
        z(parcel, iY);
    }

    public static <T extends Parcelable> void w(@RecentlyNonNull Parcel parcel, int i2, @RecentlyNonNull List<T> list, boolean z) {
        if (list == null) {
            if (z) {
                x(parcel, i2, 0);
                return;
            }
            return;
        }
        int iY = y(parcel, i2);
        int size = list.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            T t = list.get(i3);
            if (t == null) {
                parcel.writeInt(0);
            } else {
                A(parcel, t, 0);
            }
        }
        z(parcel, iY);
    }

    private static void x(Parcel parcel, int i2, int i3) {
        parcel.writeInt(i2 | (i3 << 16));
    }

    private static int y(Parcel parcel, int i2) {
        parcel.writeInt(i2 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    private static void z(Parcel parcel, int i2) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i2 - 4);
        parcel.writeInt(iDataPosition - i2);
        parcel.setDataPosition(iDataPosition);
    }
}
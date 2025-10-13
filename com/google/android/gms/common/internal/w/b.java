package com.google.android.gms.common.internal.w;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
public class b {

    /* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    public static class a extends RuntimeException {
        public a(@RecentlyNonNull String str, @RecentlyNonNull Parcel parcel) {
            int iDataPosition = parcel.dataPosition();
            int iDataSize = parcel.dataSize();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 41);
            sb.append(str);
            sb.append(" Parcel: pos=");
            sb.append(iDataPosition);
            sb.append(" size=");
            sb.append(iDataSize);
            super(sb.toString());
        }
    }

    public static int A(@RecentlyNonNull Parcel parcel) {
        int iT = t(parcel);
        int iY = y(parcel, iT);
        int iDataPosition = parcel.dataPosition();
        if (l(iT) != 20293) {
            String strValueOf = String.valueOf(Integer.toHexString(iT));
            throw new a(strValueOf.length() != 0 ? "Expected object header. Got 0x".concat(strValueOf) : new String("Expected object header. Got 0x"), parcel);
        }
        int i2 = iY + iDataPosition;
        if (i2 >= iDataPosition && i2 <= parcel.dataSize()) {
            return i2;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("Size read is invalid start=");
        sb.append(iDataPosition);
        sb.append(" end=");
        sb.append(i2);
        throw new a(sb.toString(), parcel);
    }

    private static void B(Parcel parcel, int i2, int i3) {
        int iY = y(parcel, i2);
        if (iY == i3) {
            return;
        }
        String hexString = Integer.toHexString(iY);
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
        sb.append("Expected size ");
        sb.append(i3);
        sb.append(" got ");
        sb.append(iY);
        sb.append(" (0x");
        sb.append(hexString);
        sb.append(")");
        throw new a(sb.toString(), parcel);
    }

    private static void C(Parcel parcel, int i2, int i3, int i4) {
        if (i3 == i4) {
            return;
        }
        String hexString = Integer.toHexString(i3);
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
        sb.append("Expected size ");
        sb.append(i4);
        sb.append(" got ");
        sb.append(i3);
        sb.append(" (0x");
        sb.append(hexString);
        sb.append(")");
        throw new a(sb.toString(), parcel);
    }

    @RecentlyNonNull
    public static Bundle a(@RecentlyNonNull Parcel parcel, int i2) {
        int iY = y(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iY == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iY);
        return bundle;
    }

    @RecentlyNonNull
    public static byte[] b(@RecentlyNonNull Parcel parcel, int i2) {
        int iY = y(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iY == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iY);
        return bArrCreateByteArray;
    }

    @RecentlyNonNull
    public static int[] c(@RecentlyNonNull Parcel parcel, int i2) {
        int iY = y(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iY == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iY);
        return iArrCreateIntArray;
    }

    @RecentlyNonNull
    public static ArrayList<Integer> d(@RecentlyNonNull Parcel parcel, int i2) {
        int iY = y(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iY == 0) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i3 = parcel.readInt();
        for (int i4 = 0; i4 < i3; i4++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(iDataPosition + iY);
        return arrayList;
    }

    @RecentlyNonNull
    public static <T extends Parcelable> T e(@RecentlyNonNull Parcel parcel, int i2, @RecentlyNonNull Parcelable.Creator<T> creator) {
        int iY = y(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iY == 0) {
            return null;
        }
        T tCreateFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iY);
        return tCreateFromParcel;
    }

    @RecentlyNonNull
    public static String f(@RecentlyNonNull Parcel parcel, int i2) {
        int iY = y(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iY == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iY);
        return string;
    }

    @RecentlyNonNull
    public static String[] g(@RecentlyNonNull Parcel parcel, int i2) {
        int iY = y(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iY == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + iY);
        return strArrCreateStringArray;
    }

    @RecentlyNonNull
    public static ArrayList<String> h(@RecentlyNonNull Parcel parcel, int i2) {
        int iY = y(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iY == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iY);
        return arrayListCreateStringArrayList;
    }

    @RecentlyNonNull
    public static <T> T[] i(@RecentlyNonNull Parcel parcel, int i2, @RecentlyNonNull Parcelable.Creator<T> creator) {
        int iY = y(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iY == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iY);
        return tArr;
    }

    @RecentlyNonNull
    public static <T> ArrayList<T> j(@RecentlyNonNull Parcel parcel, int i2, @RecentlyNonNull Parcelable.Creator<T> creator) {
        int iY = y(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iY == 0) {
            return null;
        }
        ArrayList<T> arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iY);
        return arrayListCreateTypedArrayList;
    }

    public static void k(@RecentlyNonNull Parcel parcel, int i2) {
        if (parcel.dataPosition() == i2) {
            return;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(i2);
        throw new a(sb.toString(), parcel);
    }

    public static int l(int i2) {
        return (char) i2;
    }

    public static boolean m(@RecentlyNonNull Parcel parcel, int i2) {
        B(parcel, i2, 4);
        return parcel.readInt() != 0;
    }

    @RecentlyNonNull
    public static Boolean n(@RecentlyNonNull Parcel parcel, int i2) {
        int iY = y(parcel, i2);
        if (iY == 0) {
            return null;
        }
        C(parcel, i2, iY, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static byte o(@RecentlyNonNull Parcel parcel, int i2) {
        B(parcel, i2, 4);
        return (byte) parcel.readInt();
    }

    public static double p(@RecentlyNonNull Parcel parcel, int i2) {
        B(parcel, i2, 8);
        return parcel.readDouble();
    }

    @RecentlyNonNull
    public static Double q(@RecentlyNonNull Parcel parcel, int i2) {
        int iY = y(parcel, i2);
        if (iY == 0) {
            return null;
        }
        C(parcel, i2, iY, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static float r(@RecentlyNonNull Parcel parcel, int i2) {
        B(parcel, i2, 4);
        return parcel.readFloat();
    }

    @RecentlyNonNull
    public static Float s(@RecentlyNonNull Parcel parcel, int i2) {
        int iY = y(parcel, i2);
        if (iY == 0) {
            return null;
        }
        C(parcel, i2, iY, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static int t(@RecentlyNonNull Parcel parcel) {
        return parcel.readInt();
    }

    @RecentlyNonNull
    public static IBinder u(@RecentlyNonNull Parcel parcel, int i2) {
        int iY = y(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iY == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iY);
        return strongBinder;
    }

    public static int v(@RecentlyNonNull Parcel parcel, int i2) {
        B(parcel, i2, 4);
        return parcel.readInt();
    }

    public static long w(@RecentlyNonNull Parcel parcel, int i2) {
        B(parcel, i2, 8);
        return parcel.readLong();
    }

    @RecentlyNonNull
    public static Long x(@RecentlyNonNull Parcel parcel, int i2) {
        int iY = y(parcel, i2);
        if (iY == 0) {
            return null;
        }
        C(parcel, i2, iY, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static int y(@RecentlyNonNull Parcel parcel, int i2) {
        return (i2 & (-65536)) != -65536 ? (char) (i2 >> 16) : parcel.readInt();
    }

    public static void z(@RecentlyNonNull Parcel parcel, int i2) {
        parcel.setDataPosition(parcel.dataPosition() + y(parcel, i2));
    }
}
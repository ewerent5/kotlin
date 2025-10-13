package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.gms.common.internal.o;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
public final class b extends com.google.android.gms.common.internal.w.a {

    /* renamed from: f */
    final int f4623f;

    /* renamed from: g */
    private final int f4624g;

    /* renamed from: h */
    private final PendingIntent f4625h;

    /* renamed from: i */
    private final String f4626i;

    /* renamed from: e */
    @RecentlyNonNull
    public static final b f4622e = new b(0);

    @RecentlyNonNull
    public static final Parcelable.Creator<b> CREATOR = new q();

    public b(int i2) {
        this(i2, null, null);
    }

    b(int i2, int i3, PendingIntent pendingIntent, String str) {
        this.f4623f = i2;
        this.f4624g = i3;
        this.f4625h = pendingIntent;
        this.f4626i = str;
    }

    static String M(int i2) {
        if (i2 == 99) {
            return "UNFINISHED";
        }
        if (i2 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i2) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i2) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case SyslogConstants.LOG_DAEMON /* 24 */:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i2);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    @RecentlyNullable
    public String I() {
        return this.f4626i;
    }

    @RecentlyNullable
    public PendingIntent J() {
        return this.f4625h;
    }

    public boolean K() {
        return (this.f4624g == 0 || this.f4625h == null) ? false : true;
    }

    public boolean L() {
        return this.f4624g == 0;
    }

    public int c() {
        return this.f4624g;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f4624g == bVar.f4624g && o.a(this.f4625h, bVar.f4625h) && o.a(this.f4626i, bVar.f4626i);
    }

    public int hashCode() {
        return o.b(Integer.valueOf(this.f4624g), this.f4625h, this.f4626i);
    }

    @RecentlyNonNull
    public String toString() {
        o.a aVarC = o.c(this);
        aVarC.a("statusCode", M(this.f4624g));
        aVarC.a("resolution", this.f4625h);
        aVarC.a("message", this.f4626i);
        return aVarC.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.w.c.a(parcel);
        com.google.android.gms.common.internal.w.c.m(parcel, 1, this.f4623f);
        com.google.android.gms.common.internal.w.c.m(parcel, 2, c());
        com.google.android.gms.common.internal.w.c.r(parcel, 3, J(), i2, false);
        com.google.android.gms.common.internal.w.c.s(parcel, 4, I(), false);
        com.google.android.gms.common.internal.w.c.b(parcel, iA);
    }

    public b(int i2, PendingIntent pendingIntent) {
        this(i2, pendingIntent, null);
    }

    public b(int i2, PendingIntent pendingIntent, String str) {
        this(1, i2, pendingIntent, str);
    }
}
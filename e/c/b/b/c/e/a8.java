package e.c.b.b.c.e;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* loaded from: classes.dex */
public class a8 extends IOException {

    /* renamed from: e, reason: collision with root package name */
    private b9 f14370e;

    public a8(String str) {
        super(str);
        this.f14370e = null;
    }

    static a8 a() {
        return new a8("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static a8 b() {
        return new a8("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static a8 c() {
        return new a8("Protocol message contained an invalid tag (zero).");
    }

    static z7 d() {
        return new z7("Protocol message tag had invalid wire type.");
    }

    static a8 e() {
        return new a8("Failed to parse the message.");
    }

    static a8 f() {
        return new a8("Protocol message had invalid UTF-8.");
    }
}
package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public class qj2 extends IOException {

    /* renamed from: e, reason: collision with root package name */
    private lk2 f8399e;

    public qj2(String str) {
        super(str);
        this.f8399e = null;
    }

    static qj2 b() {
        return new qj2("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static qj2 c() {
        return new qj2("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static qj2 d() {
        return new qj2("CodedInputStream encountered a malformed varint.");
    }

    static qj2 e() {
        return new qj2("Protocol message contained an invalid tag (zero).");
    }

    static qj2 f() {
        return new qj2("Protocol message end-group tag did not match expected tag.");
    }

    static pj2 g() {
        return new pj2("Protocol message tag had invalid wire type.");
    }

    static qj2 h() {
        return new qj2("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static qj2 i() {
        return new qj2("Failed to parse the message.");
    }

    static qj2 j() {
        return new qj2("Protocol message had invalid UTF-8.");
    }

    public final qj2 a(lk2 lk2Var) {
        this.f8399e = lk2Var;
        return this;
    }
}
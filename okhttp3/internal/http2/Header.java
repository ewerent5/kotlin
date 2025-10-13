package okhttp3.internal.http2;

import ch.qos.logback.core.joran.action.Action;
import i.y.d.g;
import i.y.d.l;
import j.i;

/* compiled from: Header.kt */
/* loaded from: classes3.dex */
public final class Header {
    public static final Companion Companion = new Companion(null);
    public static final i PSEUDO_PREFIX;
    public static final i RESPONSE_STATUS;
    public static final String RESPONSE_STATUS_UTF8 = ":status";
    public static final i TARGET_AUTHORITY;
    public static final String TARGET_AUTHORITY_UTF8 = ":authority";
    public static final i TARGET_METHOD;
    public static final String TARGET_METHOD_UTF8 = ":method";
    public static final i TARGET_PATH;
    public static final String TARGET_PATH_UTF8 = ":path";
    public static final i TARGET_SCHEME;
    public static final String TARGET_SCHEME_UTF8 = ":scheme";
    public final int hpackSize;
    public final i name;
    public final i value;

    /* compiled from: Header.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    static {
        i.a aVar = i.f16464f;
        PSEUDO_PREFIX = aVar.d(":");
        RESPONSE_STATUS = aVar.d(RESPONSE_STATUS_UTF8);
        TARGET_METHOD = aVar.d(TARGET_METHOD_UTF8);
        TARGET_PATH = aVar.d(TARGET_PATH_UTF8);
        TARGET_SCHEME = aVar.d(TARGET_SCHEME_UTF8);
        TARGET_AUTHORITY = aVar.d(TARGET_AUTHORITY_UTF8);
    }

    public Header(i iVar, i iVar2) {
        l.d(iVar, Action.NAME_ATTRIBUTE);
        l.d(iVar2, "value");
        this.name = iVar;
        this.value = iVar2;
        this.hpackSize = iVar.u() + 32 + iVar2.u();
    }

    public static /* synthetic */ Header copy$default(Header header, i iVar, i iVar2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            iVar = header.name;
        }
        if ((i2 & 2) != 0) {
            iVar2 = header.value;
        }
        return header.copy(iVar, iVar2);
    }

    public final i component1() {
        return this.name;
    }

    public final i component2() {
        return this.value;
    }

    public final Header copy(i iVar, i iVar2) {
        l.d(iVar, Action.NAME_ATTRIBUTE);
        l.d(iVar2, "value");
        return new Header(iVar, iVar2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Header)) {
            return false;
        }
        Header header = (Header) obj;
        return l.a(this.name, header.name) && l.a(this.value, header.value);
    }

    public int hashCode() {
        i iVar = this.name;
        int iHashCode = (iVar != null ? iVar.hashCode() : 0) * 31;
        i iVar2 = this.value;
        return iHashCode + (iVar2 != null ? iVar2.hashCode() : 0);
    }

    public String toString() {
        return this.name.x() + ": " + this.value.x();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Header(String str, String str2) {
        l.d(str, Action.NAME_ATTRIBUTE);
        l.d(str2, "value");
        i.a aVar = i.f16464f;
        this(aVar.d(str), aVar.d(str2));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(i iVar, String str) {
        this(iVar, i.f16464f.d(str));
        l.d(iVar, Action.NAME_ATTRIBUTE);
        l.d(str, "value");
    }
}
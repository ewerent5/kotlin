package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdRequest;
import j$.util.Spliterator;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public enum m21 implements gj2 {
    ERROR_ENCODE_SIZE_FAIL(1),
    ERROR_UNKNOWN(3),
    ERROR_NO_SIGNALS(5),
    ERROR_ENCRYPTION(7),
    ERROR_MEMORY(9),
    ERROR_SIMULATOR(11),
    ERROR_SERVICE(13),
    ERROR_THREAD(15),
    PSN_WEB64_FAIL(2),
    PSN_DECRYPT_SIZE_FAIL(4),
    PSN_MD5_CHECK_FAIL(8),
    PSN_MD5_SIZE_FAIL(16),
    PSN_MD5_FAIL(32),
    PSN_DECODE_FAIL(64),
    PSN_SALT_FAIL(128),
    PSN_BITSLICER_FAIL(256),
    PSN_REQUEST_TYPE_FAIL(AdRequest.MAX_CONTENT_URL_LENGTH),
    PSN_INVALID_ERROR_CODE(Spliterator.IMMUTABLE),
    PSN_TIMESTAMP_EXPIRED(2048),
    PSN_ENCODE_SIZE_FAIL(Spliterator.CONCURRENT),
    PSN_BLANK_VALUE(8192),
    PSN_INITIALIZATION_FAIL(16384),
    PSN_GASS_CLIENT_FAIL(32768),
    PSN_SIGNALS_TIMEOUT(65536),
    PSN_TINK_FAIL(131072);

    private static final hj2<m21> D = new hj2<m21>() { // from class: com.google.android.gms.internal.ads.l11
    };
    private final int F;

    m21(int i2) {
        this.F = i2;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + m21.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.F + " name=" + name() + '>';
    }

    public final int zza() {
        return this.F;
    }
}
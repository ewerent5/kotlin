package com.google.android.gms.internal.ads;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.net.SyslogConstants;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public enum y43 implements gj2 {
    UNKNOWN_EVENT_TYPE(0),
    AD_REQUEST(1),
    AD_LOADED(2),
    AD_IMPRESSION(5),
    AD_FIRST_CLICK(6),
    AD_SUBSEQUENT_CLICK(7),
    REQUEST_WILL_START(8),
    REQUEST_DID_END(9),
    REQUEST_WILL_UPDATE_SIGNALS(10),
    REQUEST_DID_UPDATE_SIGNALS(11),
    REQUEST_WILL_BUILD_URL(12),
    REQUEST_DID_BUILD_URL(13),
    REQUEST_WILL_MAKE_NETWORK_REQUEST(14),
    REQUEST_DID_RECEIVE_NETWORK_RESPONSE(15),
    REQUEST_WILL_PROCESS_RESPONSE(16),
    REQUEST_DID_PROCESS_RESPONSE(17),
    REQUEST_WILL_RENDER(18),
    REQUEST_DID_RENDER(19),
    AD_FAILED_TO_LOAD(3),
    AD_FAILED_TO_LOAD_NO_FILL(4),
    AD_FAILED_TO_LOAD_INVALID_REQUEST(100),
    AD_FAILED_TO_LOAD_NETWORK_ERROR(101),
    AD_FAILED_TO_LOAD_TIMEOUT(102),
    AD_FAILED_TO_LOAD_CANCELLED(103),
    AD_FAILED_TO_LOAD_NO_ERROR(SyslogConstants.LOG_AUDIT),
    AD_FAILED_TO_LOAD_NOT_FOUND(105),
    REQUEST_WILL_UPDATE_GMS_SIGNALS(CoreConstants.MILLIS_IN_ONE_SECOND),
    REQUEST_DID_UPDATE_GMS_SIGNALS(WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY),
    REQUEST_FAILED_TO_UPDATE_GMS_SIGNALS(1002),
    REQUEST_FAILED_TO_BUILD_URL(1003),
    REQUEST_FAILED_TO_MAKE_NETWORK_REQUEST(1004),
    REQUEST_FAILED_TO_PROCESS_RESPONSE(WebSocketProtocol.CLOSE_NO_STATUS_CODE),
    REQUEST_FAILED_TO_UPDATE_SIGNALS(1006),
    REQUEST_FAILED_TO_RENDER(1007),
    REQUEST_IS_PREFETCH(1100),
    REQUEST_SAVED_TO_CACHE(1101),
    REQUEST_LOADED_FROM_CACHE(1102),
    REQUEST_PREFETCH_INTERCEPTED(1103),
    REQUESTED_CACHE_KEY_FROM_SERVICE_SUCCEEDED(1104),
    REQUESTED_CACHE_KEY_FROM_SERVICE_FAILED(1105),
    NOTIFIED_CACHE_HIT_TO_SERVICE_SUCCEEDED(1106),
    NOTIFIED_CACHE_HIT_TO_SERVICE_FAILED(1107),
    REQUEST_FAILED_TO_LOAD_FROM_CACHE(1108),
    BANNER_SIZE_INVALID(10000),
    BANNER_SIZE_VALID(10001),
    ANDROID_WEBVIEW_CRASH(10002),
    OFFLINE_UPLOAD(10003),
    DELAY_PAGE_LOAD_CANCELLED_AD(10004);

    private static final hj2<y43> a0 = new hj2<y43>() { // from class: com.google.android.gms.internal.ads.x43
    };
    private final int c0;

    y43(int i2) {
        this.c0 = i2;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + y43.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.c0 + " name=" + name() + '>';
    }

    public final int zza() {
        return this.c0;
    }
}
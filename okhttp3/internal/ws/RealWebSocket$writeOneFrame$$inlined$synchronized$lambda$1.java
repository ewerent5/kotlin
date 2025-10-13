package okhttp3.internal.ws;

import i.y.d.s;
import i.y.d.u;
import j.i;
import okhttp3.internal.concurrent.Task;

/* compiled from: TaskQueue.kt */
/* loaded from: classes3.dex */
public final class RealWebSocket$writeOneFrame$$inlined$synchronized$lambda$1 extends Task {
    final /* synthetic */ boolean $cancelable;
    final /* synthetic */ u $messageOrClose$inlined;
    final /* synthetic */ String $name;
    final /* synthetic */ i $pong$inlined;
    final /* synthetic */ u $readerToClose$inlined;
    final /* synthetic */ s $receivedCloseCode$inlined;
    final /* synthetic */ u $receivedCloseReason$inlined;
    final /* synthetic */ u $streamsToClose$inlined;
    final /* synthetic */ WebSocketWriter $writer$inlined;
    final /* synthetic */ u $writerToClose$inlined;
    final /* synthetic */ RealWebSocket this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealWebSocket$writeOneFrame$$inlined$synchronized$lambda$1(String str, boolean z, String str2, boolean z2, RealWebSocket realWebSocket, WebSocketWriter webSocketWriter, i iVar, u uVar, s sVar, u uVar2, u uVar3, u uVar4, u uVar5) {
        super(str2, z2);
        str = str;
        z = z;
        realWebSocket = realWebSocket;
        webSocketWriter = webSocketWriter;
        iVar = iVar;
        uVar = uVar;
        sVar = sVar;
        uVar = uVar2;
        uVar = uVar3;
        uVar = uVar4;
        uVar = uVar5;
    }

    @Override // okhttp3.internal.concurrent.Task
    public long runOnce() {
        realWebSocket.cancel();
        return -1L;
    }
}
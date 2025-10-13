package ch.qos.logback.core.net.server;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
class RemoteReceiverServerRunner extends ConcurrentServerRunner<RemoteReceiverClient> {
    private final int clientQueueSize;

    public RemoteReceiverServerRunner(ServerListener<RemoteReceiverClient> serverListener, Executor executor, int i2) {
        super(serverListener, executor);
        this.clientQueueSize = i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ch.qos.logback.core.net.server.ConcurrentServerRunner
    public boolean configureClient(RemoteReceiverClient remoteReceiverClient) {
        remoteReceiverClient.setContext(getContext());
        remoteReceiverClient.setQueue(new ArrayBlockingQueue(this.clientQueueSize));
        return true;
    }
}
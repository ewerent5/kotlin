package com.androidplot.util;

import android.util.Log;
import com.androidplot.Plot;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class Redrawer implements Runnable {
    private static final int ONE_SECOND_MS = 1000;
    private static final String TAG = Redrawer.class.getName();
    private boolean keepAlive;
    private boolean keepRunning;
    private List<WeakReference<Plot>> plots;
    private long sleepTime;
    private Thread thread;

    public Redrawer(List<Plot> list, float f2, boolean z) {
        this.plots = new ArrayList(list.size());
        Iterator<Plot> it = list.iterator();
        while (it.hasNext()) {
            this.plots.add(new WeakReference<>(it.next()));
        }
        setMaxRefreshRate(f2);
        Thread thread = new Thread(this, "Androidplot Redrawer");
        this.thread = thread;
        thread.start();
        if (z) {
            start();
        }
    }

    public synchronized void finish() {
        this.keepRunning = false;
        this.keepAlive = false;
        notify();
    }

    public synchronized void pause() {
        this.keepRunning = false;
        notify();
        Log.d(TAG, "Redrawer paused.");
    }

    @Override // java.lang.Runnable
    public void run() {
        this.keepAlive = true;
        while (this.keepAlive) {
            try {
                if (this.keepRunning) {
                    Iterator<WeakReference<Plot>> it = this.plots.iterator();
                    while (it.hasNext()) {
                        it.next().get().redraw();
                    }
                    synchronized (this) {
                        wait(this.sleepTime);
                    }
                } else {
                    synchronized (this) {
                        wait();
                    }
                }
            } catch (InterruptedException unused) {
            } catch (Throwable th) {
                Log.d(TAG, "Redrawer thread exited.");
                throw th;
            }
        }
        Log.d(TAG, "Redrawer thread exited.");
    }

    public void setMaxRefreshRate(float f2) {
        this.sleepTime = (long) (1000.0f / f2);
        Log.d(TAG, "Set Redrawer refresh rate to " + f2 + "( " + this.sleepTime + " ms)");
    }

    public synchronized void start() {
        this.keepRunning = true;
        notify();
        Log.d(TAG, "Redrawer started.");
    }

    public Redrawer(Plot plot, float f2, boolean z) {
        this((List<Plot>) Collections.singletonList(plot), f2, z);
    }
}
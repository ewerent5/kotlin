package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Collection;

/* compiled from: DateSelector.java */
/* loaded from: classes.dex */
public interface d<S> extends Parcelable {
    void G(long j2);

    String e(Context context);

    Collection<c.h.k.d<Long, Long>> f();

    View n(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, a aVar, o<S> oVar);

    int r(Context context);

    boolean w();

    Collection<Long> x();

    S y();
}
package com.parizene.netmonitor.ui.test;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.parizene.netmonitor.R;
import com.parizene.netmonitor.m0.b0.k;
import com.parizene.netmonitor.m0.b0.l;
import com.parizene.netmonitor.m0.b0.m;
import com.parizene.netmonitor.m0.b0.n;
import com.parizene.netmonitor.m0.b0.q;
import com.parizene.netmonitor.m0.b0.y;
import com.parizene.netmonitor.m0.w;
import java.util.Iterator;

/* compiled from: TestItemViewHolder.java */
/* loaded from: classes3.dex */
public class h extends RecyclerView.d0 {
    private TextView x;

    public h(View view) {
        super(view);
        TextView textView = (TextView) view.findViewById(R.id.cells_state);
        this.x = textView;
        textView.setTypeface(Typeface.MONOSPACE);
    }

    private String O(boolean z, l lVar) {
        Object[] objArr = new Object[5];
        objArr[0] = z ? "S  " : "   ";
        objArr[1] = V(lVar.a().f13272b);
        objArr[2] = V(lVar.a().f13273c);
        objArr[3] = V(lVar.a().f13274d);
        objArr[4] = V(lVar.b().a);
        return String.format("\n%-3.3s %-5.5s %-5.5s %-5.5s %-4.4s", objArr);
    }

    private String P(g gVar) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        StringBuilder sb4 = new StringBuilder();
        com.parizene.netmonitor.m0.b0.b bVar = gVar.f14040d;
        y yVarC = bVar.c();
        String str = gVar.a + " " + gVar.a() + "\n\t" + yVarC.h() + "\n\tmcc:" + yVarC.d() + " mnc:" + yVarC.f() + "\n\tdata:" + w.h(yVarC.b()) + " voice:" + w.h(yVarC.m()) + "\n\troaming:" + yVarC.p() + "\n";
        X(sb, sb2, sb3, sb4, true, bVar.a());
        Iterator<k> it = bVar.b().iterator();
        while (it.hasNext()) {
            X(sb, sb2, sb3, sb4, false, it.next());
        }
        if (sb3.length() != 0) {
            str = (str + String.format("LTE\n%-3.3s %-3.3s %-3.3s %-5.5s %-9.9s %-3.3s %-6.6s %-4.4s %-4.4s %-2.2s", "SRV", "MCC", "MNC", "TAC", "CID", "PCI", "EARFCN", "RSRP", "RSRQ", "TA")) + sb3.toString();
        }
        if (sb4.length() != 0) {
            str = (str + String.format("WCDMA\n%-3.3s %-3.3s %-3.3s %-5.5s %-9.9s %-6.6s %-3.3s %-4.4s", "SRV", "MCC", "MNC", "LAC", "CID", "UARFCN", "PSC", "RSCP")) + sb4.toString();
        }
        if (sb2.length() != 0) {
            str = (str + String.format("GSM\n%-3.3s %-3.3s %-3.3s %-5.5s %-5.5s %-6.6s %-4.4s %-4.4s", "SRV", "MCC", "MNC", "LAC", "CID", "ARFCN", "BSIC", "RSSI")) + sb2.toString();
        }
        if (sb.length() == 0) {
            return str;
        }
        return (str + String.format("CDMA\n%-3.3s %-5.5s %-5.5s %-5.5s %-6.6s %-6.6s %-6.6s %-6.6s %-5.5s", "SRV", "SID", "NID", "BSID", "C-RSSI", "C-ECIO", "E-RSSI", "E-ECIO", "E-SNR")) + sb.toString();
    }

    private String Q(boolean z, m mVar) {
        Object[] objArr = new Object[8];
        objArr[0] = z ? "S  " : "   ";
        objArr[1] = W(mVar.a().a);
        objArr[2] = W(mVar.a().f13277b);
        objArr[3] = V(mVar.a().f13278c);
        objArr[4] = V(mVar.a().f13279d);
        objArr[5] = V(mVar.a().f13280e);
        objArr[6] = V(mVar.a().f13281f);
        objArr[7] = V(mVar.b().a);
        return String.format("\n%-3.3s %-3.3s %-3.3s %-5.5s %-5.5s %-6.6s %-4.4s %-4.4s", objArr);
    }

    private String S(boolean z, n nVar) {
        Object[] objArr = new Object[10];
        objArr[0] = z ? "S  " : "   ";
        objArr[1] = W(nVar.a().a);
        objArr[2] = W(nVar.a().f13282b);
        objArr[3] = V(nVar.a().f13283c);
        objArr[4] = V(nVar.a().f13284d);
        objArr[5] = V(nVar.a().f13285e);
        objArr[6] = V(nVar.a().f13286f);
        objArr[7] = V(nVar.b().a);
        objArr[8] = V(nVar.b().f13307c);
        objArr[9] = V(nVar.b().f13310f);
        return String.format("\n%-3.3s %-3.3s %-3.3s %-5.5s %-9.9s %-3.3s %-6.6s %-4.4s %-4.4s %-2.2s", objArr);
    }

    private String T(boolean z, q qVar) {
        Object[] objArr = new Object[8];
        objArr[0] = z ? "S  " : "   ";
        objArr[1] = W(qVar.a().a);
        objArr[2] = W(qVar.a().f13298b);
        objArr[3] = V(qVar.a().f13299c);
        objArr[4] = V(qVar.a().f13300d);
        objArr[5] = V(qVar.a().f13302f);
        objArr[6] = V(qVar.a().f13301e);
        objArr[7] = V(qVar.b().a);
        return String.format("\n%-3.3s %-3.3s %-3.3s %-5.5s %-9.9s %-6.6s %-3.3s %-4.4s", objArr);
    }

    private String V(int i2) {
        return i2 != Integer.MAX_VALUE ? Integer.toString(i2) : "";
    }

    private String W(String str) {
        return !TextUtils.isEmpty(str) ? str : "";
    }

    private void X(StringBuilder sb, StringBuilder sb2, StringBuilder sb3, StringBuilder sb4, boolean z, k kVar) {
        if (kVar instanceof n) {
            sb3.append(S(z, (n) kVar));
            return;
        }
        if (kVar instanceof q) {
            sb4.append(T(z, (q) kVar));
        } else if (kVar instanceof m) {
            sb2.append(Q(z, (m) kVar));
        } else if (kVar instanceof l) {
            sb.append(O(z, (l) kVar));
        }
    }

    public void N(g gVar) {
        this.x.setText(P(gVar));
    }
}
package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import ch.qos.logback.core.net.SyslogConstants;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class SearchView extends i0 implements c.a.o.c {
    static final n t;
    final ImageView A;
    final ImageView B;
    private final View C;
    private p D;
    private Rect E;
    private Rect F;
    private int[] G;
    private int[] H;
    private final ImageView I;
    private final Drawable J;
    private final int K;
    private final int L;
    private final Intent M;
    private final Intent N;
    private final CharSequence O;
    private l P;
    private k Q;
    View.OnFocusChangeListener R;
    private m S;
    private View.OnClickListener T;
    private boolean U;
    private boolean V;
    c.i.a.a W;
    private boolean a0;
    private CharSequence b0;
    private boolean c0;
    private boolean d0;
    private int e0;
    private boolean f0;
    private CharSequence g0;
    private CharSequence h0;
    private boolean i0;
    private int j0;
    SearchableInfo k0;
    private Bundle l0;
    private final Runnable m0;
    private Runnable n0;
    private final WeakHashMap<String, Drawable.ConstantState> o0;
    private final View.OnClickListener p0;
    View.OnKeyListener q0;
    private final TextView.OnEditorActionListener r0;
    private final AdapterView.OnItemClickListener s0;
    private final AdapterView.OnItemSelectedListener t0;
    final SearchAutoComplete u;
    private TextWatcher u0;
    private final View v;
    private final View w;
    private final View x;
    final ImageView y;
    final ImageView z;

    public static class SearchAutoComplete extends androidx.appcompat.widget.d {

        /* renamed from: h, reason: collision with root package name */
        private int f345h;

        /* renamed from: i, reason: collision with root package name */
        private SearchView f346i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f347j;

        /* renamed from: k, reason: collision with root package name */
        final Runnable f348k;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.c();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, c.a.a.p);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i2 = configuration.screenWidthDp;
            int i3 = configuration.screenHeightDp;
            if (i2 >= 960 && i3 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i2 >= 600) {
                return 192;
            }
            if (i2 < 640 || i3 < 480) {
                return SyslogConstants.LOG_LOCAL4;
            }
            return 192;
        }

        void a() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (Build.VERSION.SDK_INT < 29) {
                SearchView.t.c(this);
                return;
            }
            setInputMethodMode(1);
            if (enoughToFilter()) {
                showDropDown();
            }
        }

        boolean b() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        void c() {
            if (this.f347j) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f347j = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f345h <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.d, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f347j) {
                removeCallbacks(this.f348k);
                post(this.f348k);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z, int i2, Rect rect) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            super.onFocusChanged(z, i2, rect);
            this.f346i.Z();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i2, KeyEvent keyEvent) {
            if (i2 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f346i.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i2, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            super.onWindowFocusChanged(z);
            if (z && this.f346i.hasFocus() && getVisibility() == 0) {
                this.f347j = true;
                if (SearchView.M(getContext())) {
                    a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(CharSequence charSequence) {
        }

        void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f347j = false;
                removeCallbacks(this.f348k);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f347j = true;
                    return;
                }
                this.f347j = false;
                removeCallbacks(this.f348k);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        void setSearchView(SearchView searchView) {
            this.f346i = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i2) {
            super.setThreshold(i2);
            this.f345h = i2;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i2) {
            super(context, attributeSet, i2);
            this.f348k = new a();
            this.f345h = getThreshold();
        }
    }

    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            SearchView.this.Y(charSequence);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.f0();
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.i.a.a aVar = SearchView.this.W;
            if (aVar instanceof q0) {
                aVar.b(null);
            }
        }
    }

    class d implements View.OnFocusChangeListener {
        d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.R;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    class e implements View.OnLayoutChangeListener {
        e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            SearchView.this.B();
        }
    }

    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            SearchView searchView = SearchView.this;
            if (view == searchView.y) {
                searchView.V();
                return;
            }
            if (view == searchView.A) {
                searchView.R();
                return;
            }
            if (view == searchView.z) {
                searchView.W();
            } else if (view == searchView.B) {
                searchView.a0();
            } else if (view == searchView.u) {
                searchView.H();
            }
        }
    }

    class g implements View.OnKeyListener {
        g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i2, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.k0 == null) {
                return false;
            }
            if (searchView.u.isPopupShowing() && SearchView.this.u.getListSelection() != -1) {
                return SearchView.this.X(view, i2, keyEvent);
            }
            if (SearchView.this.u.b() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i2 != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.P(0, null, searchView2.u.getText().toString());
            return true;
        }
    }

    class h implements TextView.OnEditorActionListener {
        h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
            SearchView.this.W();
            return true;
        }
    }

    class i implements AdapterView.OnItemClickListener {
        i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
            SearchView.this.S(i2, 0, null);
        }
    }

    class j implements AdapterView.OnItemSelectedListener {
        j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
            SearchView.this.T(i2);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public interface k {
        boolean a();
    }

    public interface l {
        boolean a(String str);

        boolean b(String str);
    }

    public interface m {
        boolean a(int i2);

        boolean b(int i2);
    }

    private static class n {
        private Method a;

        /* renamed from: b, reason: collision with root package name */
        private Method f357b;

        /* renamed from: c, reason: collision with root package name */
        private Method f358c;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        n() throws NoSuchMethodException, SecurityException {
            this.a = null;
            this.f357b = null;
            this.f358c = null;
            d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f357b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f358c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        private static void d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        void a(AutoCompleteTextView autoCompleteTextView) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            d();
            Method method = this.f357b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        void b(AutoCompleteTextView autoCompleteTextView) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            d();
            Method method = this.a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        void c(AutoCompleteTextView autoCompleteTextView) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            d();
            Method method = this.f358c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    static class o extends c.j.a.a {
        public static final Parcelable.Creator<o> CREATOR = new a();

        /* renamed from: g, reason: collision with root package name */
        boolean f359g;

        class a implements Parcelable.ClassLoaderCreator<o> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public o createFromParcel(Parcel parcel) {
                return new o(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public o createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new o(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public o[] newArray(int i2) {
                return new o[i2];
            }
        }

        o(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f359g + "}";
        }

        @Override // c.j.a.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeValue(Boolean.valueOf(this.f359g));
        }

        public o(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f359g = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    private static class p extends TouchDelegate {
        private final View a;

        /* renamed from: b, reason: collision with root package name */
        private final Rect f360b;

        /* renamed from: c, reason: collision with root package name */
        private final Rect f361c;

        /* renamed from: d, reason: collision with root package name */
        private final Rect f362d;

        /* renamed from: e, reason: collision with root package name */
        private final int f363e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f364f;

        public p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f363e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f360b = new Rect();
            this.f362d = new Rect();
            this.f361c = new Rect();
            a(rect, rect2);
            this.a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f360b.set(rect);
            this.f362d.set(rect);
            Rect rect3 = this.f362d;
            int i2 = this.f363e;
            rect3.inset(-i2, -i2);
            this.f361c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z;
            boolean z2;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z3 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z2 = this.f364f;
                    if (z2 && !this.f362d.contains(x, y)) {
                        z3 = z2;
                        z = false;
                    }
                } else {
                    if (action == 3) {
                        z2 = this.f364f;
                        this.f364f = false;
                    }
                    z = true;
                    z3 = false;
                }
                z3 = z2;
                z = true;
            } else {
                if (this.f360b.contains(x, y)) {
                    this.f364f = true;
                    z = true;
                }
                z = true;
                z3 = false;
            }
            if (!z3) {
                return false;
            }
            if (!z || this.f361c.contains(x, y)) {
                Rect rect = this.f361c;
                motionEvent.setLocation(x - rect.left, y - rect.top);
            } else {
                motionEvent.setLocation(this.a.getWidth() / 2, this.a.getHeight() / 2);
            }
            return this.a.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        t = Build.VERSION.SDK_INT < 29 ? new n() : null;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private Intent C(String str, Uri uri, String str2, String str3, int i2, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.h0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.l0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i2 != 0) {
            intent.putExtra("action_key", i2);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.k0.getSearchActivity());
        return intent;
    }

    private Intent D(Cursor cursor, int i2, String str) {
        int position;
        String strP;
        try {
            String strP2 = q0.p(cursor, "suggest_intent_action");
            if (strP2 == null) {
                strP2 = this.k0.getSuggestIntentAction();
            }
            if (strP2 == null) {
                strP2 = "android.intent.action.SEARCH";
            }
            String str2 = strP2;
            String strP3 = q0.p(cursor, "suggest_intent_data");
            if (strP3 == null) {
                strP3 = this.k0.getSuggestIntentData();
            }
            if (strP3 != null && (strP = q0.p(cursor, "suggest_intent_data_id")) != null) {
                strP3 = strP3 + "/" + Uri.encode(strP);
            }
            return C(str2, strP3 == null ? null : Uri.parse(strP3), q0.p(cursor, "suggest_intent_extra_data"), q0.p(cursor, "suggest_intent_query"), i2, str);
        } catch (RuntimeException e2) {
            try {
                position = cursor.getPosition();
            } catch (RuntimeException unused) {
                position = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + position + " returned exception.", e2);
            return null;
        }
    }

    private Intent E(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.l0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    private Intent F(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    private void G() {
        this.u.dismissDropDown();
    }

    private void I(View view, Rect rect) {
        view.getLocationInWindow(this.G);
        getLocationInWindow(this.H);
        int[] iArr = this.G;
        int i2 = iArr[1];
        int[] iArr2 = this.H;
        int i3 = i2 - iArr2[1];
        int i4 = iArr[0] - iArr2[0];
        rect.set(i4, i3, view.getWidth() + i4, view.getHeight() + i3);
    }

    private CharSequence J(CharSequence charSequence) {
        if (!this.U || this.J == null) {
            return charSequence;
        }
        int textSize = (int) (this.u.getTextSize() * 1.25d);
        this.J.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.J), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private boolean K() {
        SearchableInfo searchableInfo = this.k0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = null;
        if (this.k0.getVoiceSearchLaunchWebSearch()) {
            intent = this.M;
        } else if (this.k0.getVoiceSearchLaunchRecognizer()) {
            intent = this.N;
        }
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    static boolean M(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private boolean N() {
        return (this.a0 || this.f0) && !L();
    }

    private void O(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException e2) {
            Log.e("SearchView", "Failed launch activity: " + intent, e2);
        }
    }

    private boolean Q(int i2, int i3, String str) {
        Cursor cursorC = this.W.c();
        if (cursorC == null || !cursorC.moveToPosition(i2)) {
            return false;
        }
        O(D(cursorC, i3, str));
        return true;
    }

    private void b0() {
        post(this.m0);
    }

    private void c0(int i2) {
        Editable text = this.u.getText();
        Cursor cursorC = this.W.c();
        if (cursorC == null) {
            return;
        }
        if (!cursorC.moveToPosition(i2)) {
            setQuery(text);
            return;
        }
        CharSequence charSequenceD = this.W.d(cursorC);
        if (charSequenceD != null) {
            setQuery(charSequenceD);
        } else {
            setQuery(text);
        }
    }

    private void e0() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.u.getText());
        if (!z2 && (!this.U || this.i0)) {
            z = false;
        }
        this.A.setVisibility(z ? 0 : 8);
        Drawable drawable = this.A.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    private void g0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.u;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(J(queryHint));
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(c.a.d.f2465g);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(c.a.d.f2466h);
    }

    private void h0() {
        this.u.setThreshold(this.k0.getSuggestThreshold());
        this.u.setImeOptions(this.k0.getImeOptions());
        int inputType = this.k0.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.k0.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.u.setInputType(inputType);
        c.i.a.a aVar = this.W;
        if (aVar != null) {
            aVar.b(null);
        }
        if (this.k0.getSuggestAuthority() != null) {
            q0 q0Var = new q0(getContext(), this, this.k0, this.o0);
            this.W = q0Var;
            this.u.setAdapter(q0Var);
            ((q0) this.W).y(this.c0 ? 2 : 1);
        }
    }

    private void i0() {
        this.x.setVisibility((N() && (this.z.getVisibility() == 0 || this.B.getVisibility() == 0)) ? 0 : 8);
    }

    private void j0(boolean z) {
        this.z.setVisibility((this.a0 && N() && hasFocus() && (z || !this.f0)) ? 0 : 8);
    }

    private void k0(boolean z) {
        this.V = z;
        int i2 = z ? 0 : 8;
        boolean z2 = !TextUtils.isEmpty(this.u.getText());
        this.y.setVisibility(i2);
        j0(z2);
        this.v.setVisibility(z ? 8 : 0);
        this.I.setVisibility((this.I.getDrawable() == null || this.U) ? 8 : 0);
        e0();
        l0(!z2);
        i0();
    }

    private void l0(boolean z) {
        int i2 = 8;
        if (this.f0 && !L() && z) {
            this.z.setVisibility(8);
            i2 = 0;
        }
        this.B.setVisibility(i2);
    }

    private void setQuery(CharSequence charSequence) {
        this.u.setText(charSequence);
        this.u.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    void B() {
        if (this.C.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.w.getPaddingLeft();
            Rect rect = new Rect();
            boolean zB = c1.b(this);
            int dimensionPixelSize = this.U ? resources.getDimensionPixelSize(c.a.d.f2463e) + resources.getDimensionPixelSize(c.a.d.f2464f) : 0;
            this.u.getDropDownBackground().getPadding(rect);
            this.u.setDropDownHorizontalOffset(zB ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
            this.u.setDropDownWidth((((this.C.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    void H() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 29) {
            this.u.refreshAutoCompleteResults();
            return;
        }
        n nVar = t;
        nVar.b(this.u);
        nVar.a(this.u);
    }

    public boolean L() {
        return this.V;
    }

    void P(int i2, String str, String str2) {
        getContext().startActivity(C("android.intent.action.SEARCH", null, null, str2, i2, str));
    }

    void R() {
        if (!TextUtils.isEmpty(this.u.getText())) {
            this.u.setText("");
            this.u.requestFocus();
            this.u.setImeVisibility(true);
        } else if (this.U) {
            k kVar = this.Q;
            if (kVar == null || !kVar.a()) {
                clearFocus();
                k0(true);
            }
        }
    }

    boolean S(int i2, int i3, String str) {
        m mVar = this.S;
        if (mVar != null && mVar.b(i2)) {
            return false;
        }
        Q(i2, 0, null);
        this.u.setImeVisibility(false);
        G();
        return true;
    }

    boolean T(int i2) {
        m mVar = this.S;
        if (mVar != null && mVar.a(i2)) {
            return false;
        }
        c0(i2);
        return true;
    }

    void U(CharSequence charSequence) {
        setQuery(charSequence);
    }

    void V() {
        k0(false);
        this.u.requestFocus();
        this.u.setImeVisibility(true);
        View.OnClickListener onClickListener = this.T;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    void W() {
        Editable text = this.u.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        l lVar = this.P;
        if (lVar == null || !lVar.b(text.toString())) {
            if (this.k0 != null) {
                P(0, null, text.toString());
            }
            this.u.setImeVisibility(false);
            G();
        }
    }

    boolean X(View view, int i2, KeyEvent keyEvent) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (this.k0 != null && this.W != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i2 == 66 || i2 == 84 || i2 == 61) {
                return S(this.u.getListSelection(), 0, null);
            }
            if (i2 == 21 || i2 == 22) {
                this.u.setSelection(i2 == 21 ? 0 : this.u.length());
                this.u.setListSelection(0);
                this.u.clearListSelection();
                this.u.a();
                return true;
            }
            if (i2 != 19 || this.u.getListSelection() == 0) {
                return false;
            }
        }
        return false;
    }

    void Y(CharSequence charSequence) {
        Editable text = this.u.getText();
        this.h0 = text;
        boolean z = !TextUtils.isEmpty(text);
        j0(z);
        l0(!z);
        e0();
        i0();
        if (this.P != null && !TextUtils.equals(charSequence, this.g0)) {
            this.P.a(charSequence.toString());
        }
        this.g0 = charSequence.toString();
    }

    void Z() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        k0(L());
        b0();
        if (this.u.hasFocus()) {
            H();
        }
    }

    void a0() {
        SearchableInfo searchableInfo = this.k0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                getContext().startActivity(F(this.M, searchableInfo));
            } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                getContext().startActivity(E(this.N, searchableInfo));
            }
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }

    @Override // c.a.o.c
    public void c() {
        if (this.i0) {
            return;
        }
        this.i0 = true;
        int imeOptions = this.u.getImeOptions();
        this.j0 = imeOptions;
        this.u.setImeOptions(imeOptions | 33554432);
        this.u.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.d0 = true;
        super.clearFocus();
        this.u.clearFocus();
        this.u.setImeVisibility(false);
        this.d0 = false;
    }

    public void d0(CharSequence charSequence, boolean z) {
        this.u.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.u;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.h0 = charSequence;
        }
        if (!z || TextUtils.isEmpty(charSequence)) {
            return;
        }
        W();
    }

    @Override // c.a.o.c
    public void f() {
        d0("", false);
        clearFocus();
        k0(true);
        this.u.setImeOptions(this.j0);
        this.i0 = false;
    }

    void f0() {
        int[] iArr = this.u.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.w.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.x.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public int getImeOptions() {
        return this.u.getImeOptions();
    }

    public int getInputType() {
        return this.u.getInputType();
    }

    public int getMaxWidth() {
        return this.e0;
    }

    public CharSequence getQuery() {
        return this.u.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.b0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.k0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.O : getContext().getText(this.k0.getHintId());
    }

    int getSuggestionCommitIconResId() {
        return this.L;
    }

    int getSuggestionRowLayout() {
        return this.K;
    }

    public c.i.a.a getSuggestionsAdapter() {
        return this.W;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.m0);
        post(this.n0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.i0, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        if (z) {
            I(this.u, this.E);
            Rect rect = this.F;
            Rect rect2 = this.E;
            rect.set(rect2.left, 0, rect2.right, i5 - i3);
            p pVar = this.D;
            if (pVar != null) {
                pVar.a(this.F, this.E);
                return;
            }
            p pVar2 = new p(this.F, this.E, this.u);
            this.D = pVar2;
            setTouchDelegate(pVar2);
        }
    }

    @Override // androidx.appcompat.widget.i0, android.view.View
    protected void onMeasure(int i2, int i3) {
        int i4;
        if (L()) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            int i5 = this.e0;
            size = i5 > 0 ? Math.min(i5, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.e0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i4 = this.e0) > 0) {
            size = Math.min(i4, size);
        }
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof o)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        o oVar = (o) parcelable;
        super.onRestoreInstanceState(oVar.a());
        k0(oVar.f359g);
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        o oVar = new o(super.onSaveInstanceState());
        oVar.f359g = L();
        return oVar;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        b0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i2, Rect rect) {
        if (this.d0 || !isFocusable()) {
            return false;
        }
        if (L()) {
            return super.requestFocus(i2, rect);
        }
        boolean zRequestFocus = this.u.requestFocus(i2, rect);
        if (zRequestFocus) {
            k0(false);
        }
        return zRequestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.l0 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            R();
        } else {
            V();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.U == z) {
            return;
        }
        this.U = z;
        k0(z);
        g0();
    }

    public void setImeOptions(int i2) {
        this.u.setImeOptions(i2);
    }

    public void setInputType(int i2) {
        this.u.setInputType(i2);
    }

    public void setMaxWidth(int i2) {
        this.e0 = i2;
        requestLayout();
    }

    public void setOnCloseListener(k kVar) {
        this.Q = kVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.R = onFocusChangeListener;
    }

    public void setOnQueryTextListener(l lVar) {
        this.P = lVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.T = onClickListener;
    }

    public void setOnSuggestionListener(m mVar) {
        this.S = mVar;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.b0 = charSequence;
        g0();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.c0 = z;
        c.i.a.a aVar = this.W;
        if (aVar instanceof q0) {
            ((q0) aVar).y(z ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.k0 = searchableInfo;
        if (searchableInfo != null) {
            h0();
            g0();
        }
        boolean zK = K();
        this.f0 = zK;
        if (zK) {
            this.u.setPrivateImeOptions("nm");
        }
        k0(L());
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.a0 = z;
        k0(L());
    }

    public void setSuggestionsAdapter(c.i.a.a aVar) {
        this.W = aVar;
        this.u.setAdapter(aVar);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.a.a.H);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.E = new Rect();
        this.F = new Rect();
        this.G = new int[2];
        this.H = new int[2];
        this.m0 = new b();
        this.n0 = new c();
        this.o0 = new WeakHashMap<>();
        f fVar = new f();
        this.p0 = fVar;
        this.q0 = new g();
        h hVar = new h();
        this.r0 = hVar;
        i iVar = new i();
        this.s0 = iVar;
        j jVar = new j();
        this.t0 = jVar;
        this.u0 = new a();
        w0 w0VarV = w0.v(context, attributeSet, c.a.j.i2, i2, 0);
        LayoutInflater.from(context).inflate(w0VarV.n(c.a.j.s2, c.a.g.r), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(c.a.f.D);
        this.u = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.v = findViewById(c.a.f.z);
        View viewFindViewById = findViewById(c.a.f.C);
        this.w = viewFindViewById;
        View viewFindViewById2 = findViewById(c.a.f.J);
        this.x = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(c.a.f.x);
        this.y = imageView;
        ImageView imageView2 = (ImageView) findViewById(c.a.f.A);
        this.z = imageView2;
        ImageView imageView3 = (ImageView) findViewById(c.a.f.y);
        this.A = imageView3;
        ImageView imageView4 = (ImageView) findViewById(c.a.f.E);
        this.B = imageView4;
        ImageView imageView5 = (ImageView) findViewById(c.a.f.B);
        this.I = imageView5;
        c.h.l.t.n0(viewFindViewById, w0VarV.g(c.a.j.t2));
        c.h.l.t.n0(viewFindViewById2, w0VarV.g(c.a.j.x2));
        int i3 = c.a.j.w2;
        imageView.setImageDrawable(w0VarV.g(i3));
        imageView2.setImageDrawable(w0VarV.g(c.a.j.q2));
        imageView3.setImageDrawable(w0VarV.g(c.a.j.n2));
        imageView4.setImageDrawable(w0VarV.g(c.a.j.z2));
        imageView5.setImageDrawable(w0VarV.g(i3));
        this.J = w0VarV.g(c.a.j.v2);
        y0.a(imageView, getResources().getString(c.a.h.f2517l));
        this.K = w0VarV.n(c.a.j.y2, c.a.g.q);
        this.L = w0VarV.n(c.a.j.o2, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.u0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.q0);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(w0VarV.a(c.a.j.r2, true));
        int iF = w0VarV.f(c.a.j.k2, -1);
        if (iF != -1) {
            setMaxWidth(iF);
        }
        this.O = w0VarV.p(c.a.j.p2);
        this.b0 = w0VarV.p(c.a.j.u2);
        int iK = w0VarV.k(c.a.j.m2, -1);
        if (iK != -1) {
            setImeOptions(iK);
        }
        int iK2 = w0VarV.k(c.a.j.l2, -1);
        if (iK2 != -1) {
            setInputType(iK2);
        }
        setFocusable(w0VarV.a(c.a.j.j2, true));
        w0VarV.w();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.M = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.N = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.C = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new e());
        }
        k0(this.U);
        g0();
    }
}
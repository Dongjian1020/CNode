package org.cnodejs.android.md.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import org.cnodejs.android.md.R;
import org.cnodejs.android.md.ui.base.StatusBarActivity;
import org.cnodejs.android.md.ui.util.ThemeUtils;

import butterknife.BindView;

/**
 * Created by jiangdongjian on 2017/6/14.
 */

public class CrashLogActivity extends StatusBarActivity implements Toolbar.OnMenuItemClickListener{
    private static final String EXTRA_E = "e";


    public static void start(@NonNull Context context,@NonNull Throwable e){
        Intent intent = new Intent(context,CrashLogActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        Bundle bundle = new Bundle();
        bundle.putSerializable(EXTRA_E,e);
        intent.putExtras(bundle);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        ThemeUtils.configThemeBeforeOnCreate(this, R.style.AppThemeLight,R.style.AppThemeDark);
        super.onCreate(savedInstanceState);
        // TODO: 17/6/30  

    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        return false;
    }
}

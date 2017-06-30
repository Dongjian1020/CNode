package org.cnodejs.android.md.ui.util;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;

/**
 * Created by jiangdongjian on 2017/6/14.
 */

public class Navigator {
    private Navigator() {}

    public static void openInMarket(@NonNull Context context){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.setData(Uri.parse("market://details?id=" + context.getPackageName()));

    }
}

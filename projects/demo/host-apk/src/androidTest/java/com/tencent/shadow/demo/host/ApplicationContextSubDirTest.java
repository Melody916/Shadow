package com.tencent.shadow.demo.host;

import android.content.Intent;

import androidx.test.core.app.ApplicationProvider;

public class ApplicationContextSubDirTest extends SubDirContextThemeWrapperTest {
    @Override
    Intent getLaunchIntent() {
        Intent pluginIntent = new Intent();
        String packageName = ApplicationProvider.getApplicationContext().getPackageName();
        pluginIntent.setClassName(
                packageName,
                "com.tencent.shadow.demo.usecases.context.ApplicationContextSubDirTestActivity"
        );
        return pluginIntent;
    }
}

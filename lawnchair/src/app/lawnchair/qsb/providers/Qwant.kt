package app.lawnchair.qsb.providers

import android.content.Intent
import app.lawnchair.qsb.ThemingMethod
import com.android.launcher3.R

data object Qwant : QsbSearchProvider(
    id = "qwant",
    name = R.string.search_provider_qwant,
    icon = R.drawable.ic_qwant,
    themingMethod = ThemingMethod.TINT,
    packageName = "com.qwant.liberty",
    action = Intent.ACTION_WEB_SEARCH,
    website = "https://qwant.com/",
)

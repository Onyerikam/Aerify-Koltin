package com.aerify.app.modules.splash.`data`.model

import com.aerify.app.R
import com.aerify.app.appcomponents.di.MyApp
import kotlin.String

data class SplashModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSocial: String? = MyApp.getInstance().resources.getString(R.string.lbl_social)

)

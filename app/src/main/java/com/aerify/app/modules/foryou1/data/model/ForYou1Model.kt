package com.aerify.app.modules.foryou1.`data`.model

import com.aerify.app.R
import com.aerify.app.appcomponents.di.MyApp
import kotlin.String

data class ForYou1Model(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_lucas_anna)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt3516: String? = MyApp.getInstance().resources.getString(R.string.lbl_35_16)

)

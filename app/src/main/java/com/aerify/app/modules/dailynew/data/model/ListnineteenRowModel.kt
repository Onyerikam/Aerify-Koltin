package com.aerify.app.modules.dailynew.`data`.model

import com.aerify.app.R
import com.aerify.app.appcomponents.di.MyApp
import kotlin.String

data class ListnineteenRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAgnessMonica: String? = MyApp.getInstance().resources.getString(R.string.lbl_agness_monica)

)

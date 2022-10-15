package com.aerify.app.modules.storiesandtweets.`data`.model

import com.aerify.app.R
import com.aerify.app.appcomponents.di.MyApp
import kotlin.String

data class ListellipsetwentytwoRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCountry: String? = MyApp.getInstance().resources.getString(R.string.lbl_jordan)

)

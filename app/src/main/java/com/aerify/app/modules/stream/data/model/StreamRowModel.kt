package com.aerify.app.modules.stream.`data`.model

import com.aerify.app.R
import com.aerify.app.appcomponents.di.MyApp
import kotlin.String

data class StreamRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRosalia: String? = MyApp.getInstance().resources.getString(R.string.lbl_rosalia)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDuration: String? = MyApp.getInstance().resources.getString(R.string.lbl_45_minutes_ago)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRosaliaOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_rosalia)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDurationOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_45_minutes_ago)

)

package com.aerify.app.modules.notifications.`data`.model

import com.aerify.app.R
import com.aerify.app.appcomponents.di.MyApp
import kotlin.String

data class NotificationsRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtKevinhasfollo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_kevin_has_follo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDuration: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_hour_ago)

)

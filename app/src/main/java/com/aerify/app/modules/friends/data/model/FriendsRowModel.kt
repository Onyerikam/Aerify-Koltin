package com.aerify.app.modules.friends.`data`.model

import com.aerify.app.R
import com.aerify.app.appcomponents.di.MyApp
import kotlin.String

data class FriendsRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtKevinAllsrub: String? = MyApp.getInstance().resources.getString(R.string.lbl_kevin_allsrub)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYourefriends: String? =
      MyApp.getInstance().resources.getString(R.string.msg_your_e_friends)

)

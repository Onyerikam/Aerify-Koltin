package com.aerify.app.modules.messages.`data`.model

import com.aerify.app.R
import com.aerify.app.appcomponents.di.MyApp
import kotlin.String

data class ListellipsetwentytwoOneRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRichardAlves: String? = MyApp.getInstance().resources.getString(R.string.lbl_richard_alves)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHeybrowhere: String? = MyApp.getInstance().resources.getString(R.string.msg_hey_bro_where)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_10_00_am)

)

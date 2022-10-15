package com.aerify.app.modules.loginscreen.`data`.model

import com.aerify.app.R
import com.aerify.app.appcomponents.di.MyApp
import kotlin.String

data class LoginScreenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFindnewfriend: String? =
      MyApp.getInstance().resources.getString(R.string.msg_find_new_friend)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_with_billions_o)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOrloginwith: String? = MyApp.getInstance().resources.getString(R.string.lbl_or_login_with)

)

package com.aerify.app.modules.chat.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.aerify.app.R
import com.aerify.app.appcomponents.base.BaseActivity
import com.aerify.app.databinding.ActivityChatBinding
import com.aerify.app.modules.chat.`data`.viewmodel.ChatVM
import kotlin.String
import kotlin.Unit

class ChatActivity : BaseActivity<ActivityChatBinding>(R.layout.activity_chat) {
  private val viewModel: ChatVM by viewModels<ChatVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.chatVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "CHAT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ChatActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

package com.aerify.app.modules.accoutview.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.aerify.app.R
import com.aerify.app.appcomponents.base.BaseActivity
import com.aerify.app.databinding.ActivityAccoutViewBinding
import com.aerify.app.modules.accoutview.`data`.viewmodel.AccoutViewVM
import kotlin.String
import kotlin.Unit

class AccoutViewActivity : BaseActivity<ActivityAccoutViewBinding>(R.layout.activity_accout_view) {
  private val viewModel: AccoutViewVM by viewModels<AccoutViewVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.accoutViewVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "ACCOUT_VIEW_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AccoutViewActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

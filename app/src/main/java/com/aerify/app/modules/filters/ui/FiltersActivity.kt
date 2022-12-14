package com.aerify.app.modules.filters.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.aerify.app.R
import com.aerify.app.appcomponents.base.BaseActivity
import com.aerify.app.databinding.ActivityFiltersBinding
import com.aerify.app.modules.filters.`data`.viewmodel.FiltersVM
import kotlin.String
import kotlin.Unit

class FiltersActivity : BaseActivity<ActivityFiltersBinding>(R.layout.activity_filters) {
  private val viewModel: FiltersVM by viewModels<FiltersVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.filtersVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "FILTERS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FiltersActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

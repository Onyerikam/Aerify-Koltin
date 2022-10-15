package com.aerify.app.modules.trending.ui

import android.view.View
import androidx.fragment.app.viewModels
import com.aerify.app.R
import com.aerify.app.appcomponents.base.BaseFragment
import com.aerify.app.databinding.FragmentTrendingBinding
import com.aerify.app.modules.trending.`data`.model.TrendingRowModel
import com.aerify.app.modules.trending.`data`.viewmodel.TrendingVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class TrendingFragment : BaseFragment<FragmentTrendingBinding>(R.layout.fragment_trending) {
  private val viewModel: TrendingVM by viewModels<TrendingVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val trendingAdapter = TrendingAdapter(viewModel.trendingList.value?:mutableListOf())
    binding.recyclerTrending.adapter = trendingAdapter
    trendingAdapter.setOnItemClickListener(
    object : TrendingAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : TrendingRowModel) {
        onClickRecyclerTrending(view, position, item)
      }
    }
    )
    viewModel.trendingList.observe(requireActivity()) {
      trendingAdapter.updateData(it)
    }
    binding.trendingVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerTrending(
    view: View,
    position: Int,
    item: TrendingRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "TRENDING_FRAGMENT"

  }
}

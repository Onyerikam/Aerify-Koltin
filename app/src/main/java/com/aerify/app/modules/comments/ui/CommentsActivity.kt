package com.aerify.app.modules.comments.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.aerify.app.R
import com.aerify.app.appcomponents.base.BaseActivity
import com.aerify.app.databinding.ActivityCommentsBinding
import com.aerify.app.modules.comments.`data`.model.CommentsRowModel
import com.aerify.app.modules.comments.`data`.viewmodel.CommentsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CommentsActivity : BaseActivity<ActivityCommentsBinding>(R.layout.activity_comments) {
  private val viewModel: CommentsVM by viewModels<CommentsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val commentsAdapter = CommentsAdapter(viewModel.commentsList.value?:mutableListOf())
    binding.recyclerComments.adapter = commentsAdapter
    commentsAdapter.setOnItemClickListener(
    object : CommentsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : CommentsRowModel) {
        onClickRecyclerComments(view, position, item)
      }
    }
    )
    viewModel.commentsList.observe(this) {
      commentsAdapter.updateData(it)
    }
    binding.commentsVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerComments(
    view: View,
    position: Int,
    item: CommentsRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "COMMENTS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CommentsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

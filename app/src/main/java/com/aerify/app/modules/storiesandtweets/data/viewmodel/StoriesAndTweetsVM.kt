package com.aerify.app.modules.storiesandtweets.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.aerify.app.modules.storiesandtweets.`data`.model.ListellipsetwelveRowModel
import com.aerify.app.modules.storiesandtweets.`data`.model.ListellipsetwentytwoRowModel
import com.aerify.app.modules.storiesandtweets.`data`.model.StoriesAndTweetsModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class StoriesAndTweetsVM : ViewModel(), KoinComponent {
  val storiesAndTweetsModel: MutableLiveData<StoriesAndTweetsModel> =
      MutableLiveData(StoriesAndTweetsModel())

  var navArguments: Bundle? = null

  val listellipsetwentytwoList: MutableLiveData<MutableList<ListellipsetwentytwoRowModel>> =
      MutableLiveData(mutableListOf())

  val listellipsetwelveList: MutableLiveData<MutableList<ListellipsetwelveRowModel>> =
      MutableLiveData(mutableListOf())
}

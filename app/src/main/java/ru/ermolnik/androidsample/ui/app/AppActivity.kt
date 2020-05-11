package ru.ermolnik.androidsample.ui.app

import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.navigation.NavController
import androidx.navigation.ui.setupActionBarWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import ru.ermolnik.androidsample.R
import ru.ermolnik.base.presentation.view.BaseActivity
import ru.ermolnik.base.util.ext.setupWithNavController

class AppActivity : BaseActivity<AppViewModel>() {

  override val layoutId = R.layout.activity_main

  private var currentNavController: LiveData<NavController>? = null


  override fun initView() {
    super.initView()
    setupBottomNavigationBar()
  }

  private fun setupBottomNavigationBar() {
    val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_nav)

    val navGraphIds = listOf(
      R.navigation.main,
      R.navigation.settings
    )


    val controller = bottomNavigationView.setupWithNavController(
      navGraphIds = navGraphIds,
      fragmentManager = supportFragmentManager,
      containerId = R.id.container,
      intent = intent
    )

    controller.observe(this, Observer { navController ->
      setupActionBarWithNavController(navController)
    })
    currentNavController = controller
  }

  override fun onSupportNavigateUp(): Boolean {
    return currentNavController?.value?.navigateUp() ?: false
  }

  override fun getViewModelClass(): Class<AppViewModel> = AppViewModel::class.java

  override fun observeViewModel() {

  }
}

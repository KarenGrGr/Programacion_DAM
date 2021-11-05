package com.kagg.pmpd_playground.exercise_alerts.presentation

import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.viewModels
import androidx.core.content.res.ResourcesCompat
import com.kagg.pmpd_playground.R
import com.kagg.pmpd_playground.databinding.ActivityAlertsBinding
import com.kagg.pmpd_playground.exercise_alerts.data.AlertDataRepository
import com.kagg.pmpd_playground.exercise_alerts.domain.GetAlertsUseCase

class AlertsActivity : AppCompatActivity() {
    //private val viewModel:AlertViewModel by viewModels()
    private val viewModel:AlertViewModel= AlertViewModel(GetAlertsUseCase(AlertDataRepository()))
    private lateinit var viewBinding: ActivityAlertsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alerts)
        setupBinding()
        render()
    }
    private fun render(){
        val model = viewModel.getAllAlerts().first()
        viewBinding.cardTitle.text=model.title
        viewBinding.viewTitle.text=getString(R.string.titulo_avisos)
        viewBinding.cardIcon.background=ResourcesCompat.getDrawable(this.resources,R.drawable.information,null)
        viewBinding.cardResume.text=model.summary
        viewBinding.cardUpdateDate.text=model.datePublished
        viewBinding.viewImageTop.background=ResourcesCompat.getDrawable(this.resources,R.drawable.campo,null)
    }
    private fun setupBinding(){
        val layoutInflater = LayoutInflater.from(this)
        viewBinding = ActivityAlertsBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
    }
}
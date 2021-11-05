package com.kagg.pmpd_playground.exercise_alerts.presentation

import androidx.lifecycle.ViewModel
import com.kagg.pmpd_playground.exercise_alerts.domain.GetAlertsUseCase

class AlertViewModel (private val getAlertsUseCase: GetAlertsUseCase) : ViewModel(){
    fun getAllAlerts()= getAlertsUseCase.execute()
}
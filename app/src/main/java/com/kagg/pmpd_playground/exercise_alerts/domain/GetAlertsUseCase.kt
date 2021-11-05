package com.kagg.pmpd_playground.exercise_alerts.domain

class GetAlertsUseCase(val alertRepository: AlertRepository) {
    fun execute():List<AlertModel>{
        return alertRepository.getAlerts()
    }

}
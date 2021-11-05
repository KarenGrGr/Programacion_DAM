package com.kagg.pmpd_playground.exercise_alerts.domain

interface AlertRepository {
    fun getAlerts():List<AlertModel>
}
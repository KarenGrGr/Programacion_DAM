package com.kagg.pmpd_playground.exercise_alerts.domain

data class AlertModel( val id: String, val title: String, val type: Int, val summary: String, val datePublished: String, val body: String, val source: String, val files: List<FileEntity> )

data class FileEntity(val name: String, val url: String)
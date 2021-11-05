package com.kagg.pmpd_playground.exercise_alerts.data

import com.kagg.pmpd_playground.exercise_alerts.domain.AlertModel
import com.kagg.pmpd_playground.exercise_alerts.domain.AlertRepository
import com.kagg.pmpd_playground.exercise_alerts.domain.FileEntity
import java.io.File

class AlertDataRepository : AlertRepository {
    override fun getAlerts(): List<AlertModel> {
        val files = mutableListOf(FileEntity("holi","google.com"),FileEntity("holiwi","google.com"))
        return mutableListOf(
            AlertModel(
                "0",
                "Avispas asesinas fuertes se avecinan a la provincia",
                0,
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer tincidunt lacus ac faucibus rhoncus. Mauris pharetra, nisi sit amet pulvinar ultricies, mi velit ornare velit, convallis rhoncus justo augue vitae turpis. Maecenas a mollis dolor. Proin non iaculis ex. Aenean lacinia erat sit amet purus ultricies mattis. Sed at tincidunt tortor.",
                "26/12/1998",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer tincidunt lacus ac faucibus rhoncus. Mauris pharetra, nisi sit amet pulvinar ultricies, mi velit ornare velit, convallis rhoncus justo augue vitae turpis. Maecenas a mollis dolor. Proin non iaculis ex. Aenean lacinia erat sit amet purus ultricies mattis. Sed at tincidunt tortor. Etiam faucibus fermentum ante eget ullamcorper. Nam pretium, arcu sed dignissim fringilla, nunc purus consectetur turpis, sit amet sagittis magna tellus eget enim. Quisque egestas lacinia aliquam. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla facilisi. Vivamus id ex tellus.",
                "google.com",
                files
            ),
            AlertModel(
                "0",
                "Avispas asesinas fuertes se avecinan a la provincia",
                0,
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer tincidunt lacus ac faucibus rhoncus. Mauris pharetra, nisi sit amet pulvinar ultricies, mi velit ornare velit, convallis rhoncus justo augue vitae turpis. Maecenas a mollis dolor. Proin non iaculis ex. Aenean lacinia erat sit amet purus ultricies mattis. Sed at tincidunt tortor.",
                "26/12/1998",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer tincidunt lacus ac faucibus rhoncus. Mauris pharetra, nisi sit amet pulvinar ultricies, mi velit ornare velit, convallis rhoncus justo augue vitae turpis. Maecenas a mollis dolor. Proin non iaculis ex. Aenean lacinia erat sit amet purus ultricies mattis. Sed at tincidunt tortor. Etiam faucibus fermentum ante eget ullamcorper. Nam pretium, arcu sed dignissim fringilla, nunc purus consectetur turpis, sit amet sagittis magna tellus eget enim. Quisque egestas lacinia aliquam. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla facilisi. Vivamus id ex tellus.",
                "google.com",
                files
            )
        )
    }
}
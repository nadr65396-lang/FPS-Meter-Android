package com.rdevzph.fpsmeter.model

enum class OverlayStyle(val label: String, val description: String) {
    DEFAULT(
        label = "Default",
        description = "Modern compact badge or multi-line card."
    ),
    MSI_AFTERBURNER(
        label = "RTSS",
        description = "Hardware telemetry layout inspired by MSI Afterburner (RTSS) with dedicated rows and signature styling."
    );

    companion object {
        fun fromString(value: String?): OverlayStyle {
            return entries.find { it.name.equals(value, ignoreCase = true) } ?: DEFAULT
        }
    }
}

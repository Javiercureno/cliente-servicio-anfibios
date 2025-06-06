package com.ebc.cliente_servicio_anfibios.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Anfibio(
    val name: String,
    val type: String,
    val description: String,
    @SerialName("img_src") val imgSrc: String)

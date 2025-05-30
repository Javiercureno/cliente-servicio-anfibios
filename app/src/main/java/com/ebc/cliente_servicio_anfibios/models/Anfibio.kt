package com.ebc.cliente_servicio_anfibios.models

import kotlinx.serialization.SerialName

data class Anfibio(
    val name: String,
    val type: String,
    val description: String,
    @SerialName("img_src") val imgSrc: String)

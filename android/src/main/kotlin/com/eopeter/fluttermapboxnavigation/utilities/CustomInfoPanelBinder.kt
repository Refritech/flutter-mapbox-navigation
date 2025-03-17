package com.eopeter.fluttermapboxnavigation.utilities

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mapbox.navigation.dropin.R
import com.mapbox.navigation.dropin.infopanel.InfoPanelBinder

class CustomInfoPanelBinder: InfoPanelBinder() {
    override fun onCreateLayout(layoutInflater: LayoutInflater, root: ViewGroup): ViewGroup {
        // Cria um layout vazio
        val layout = layoutInflater.inflate(R.layout.mapbox_info_panel_layout, root, false) as ViewGroup
        layout.visibility = View.GONE // Defina o layout como invisível (GONE)
        return layout
    }

    // Retorna nulo para não adicionar header
    override fun getHeaderLayout(layout: ViewGroup): ViewGroup? {
        return null // Nenhum layout de header será adicionado
    }

    // Retorna nulo para não adicionar conteúdo
    override fun getContentLayout(layout: ViewGroup): ViewGroup? {
        return null // Nenhum layout de conteúdo será adicionado
    }

}
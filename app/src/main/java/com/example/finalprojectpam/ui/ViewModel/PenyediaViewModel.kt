package com.example.finalprojectpam.ui.ViewModel

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.finalprojectpam.DependenciesInjection.PencatatanApplication
import com.example.finalprojectpam.ui.asset.AssetViewModel
import com.example.finalprojectpam.ui.kategori.KategoriViewModel

object PenyediaViewModel {
    val Factory = viewModelFactory {
        initializer {
            AssetViewModel(pencatatanApplication().container.asetRepository)
        }
        initializer {
            KategoriViewModel(pencatatanApplication().container.kategoriRepository)
        }
    }
}

fun CreationExtras.pencatatanApplication(): PencatatanApplication =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as PencatatanApplication)
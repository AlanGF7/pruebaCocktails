package com.amalip.cocktailapp.presentation.cocktaildetail

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.amalip.cocktailapp.R
import com.amalip.cocktailapp.core.presentation.BaseFragment
import com.amalip.cocktailapp.databinding.CocktailDetailFragmentBinding

class CocktailDetailFragment : BaseFragment(R.layout.cocktail_detail_fragment) {

    private lateinit var binding: CocktailDetailFragmentBinding

    override fun setBinding(view: View) {
        binding = CocktailDetailFragmentBinding.bind(view)
        binding.apply {
            lifecycleOwner = this@CocktailDetailFragment //Especificamos que es ESTE el fragmento a trabajar
            //cocktail = requireArguments()
        }
    }


}
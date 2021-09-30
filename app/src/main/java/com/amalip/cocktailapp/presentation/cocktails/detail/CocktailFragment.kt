package com.amalip.cocktailapp.presentation.cocktails.detail

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.amalip.cocktailapp.R
import com.amalip.cocktailapp.core.extension.failure
import com.amalip.cocktailapp.core.extension.observe
import com.amalip.cocktailapp.core.presentation.BaseFragment
import com.amalip.cocktailapp.core.presentation.BaseViewState
import com.amalip.cocktailapp.databinding.CocktailFragmentBinding
import com.amalip.cocktailapp.domain.model.Cocktail

class CocktailFragment : BaseFragment(R.layout.cocktail_fragment) {

    private lateinit var binding: CocktailFragmentBinding

    private lateinit var adapter: CocktailAdapter
    private val cocktailViewModel by viewModels<CocktailViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        cocktailViewModel.apply {
            observe(state, ::onViewStateChanged)
            failure(failure, ::handleFailure)
        }
    }

    override fun onViewStateChanged(state: BaseViewState?) {
        super.onViewStateChanged(state)
        when(state) {

        }
    }

    private fun setUpAdapter(cocktails: List<Cocktail>) {
        adapter = CocktailAdapter()

        adapter.addData(cocktails)

        binding.rcCocktails.apply {
            adapter = this@CocktailFragment.adapter
        }
    }

    override fun setBinding(view: View) {
        binding = CocktailFragmentBinding.bind(view)

        binding.lifecycleOwner = this
    }


}
package com.medialink.deco9navigation


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_category.*

/**
 * A simple [Fragment] subclass.
 */
class CategoryFragment : Fragment() {

    companion object {
        const val EXTRA_NAME = "EXTRA_NAME"
        const val EXTRA_STOCK = "EXTRA_STOCK"
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_category, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_category_lifestyle.setOnClickListener { view ->
            val toDetailCategoryFragment = CategoryFragmentDirections.actionCategoryFragmentToDetailCategoryFragment()
            toDetailCategoryFragment.name = "Bambang Keren"
            toDetailCategoryFragment.stock = 88
            view.findNavController().navigate(toDetailCategoryFragment)

            /*val bundle = Bundle()
            bundle.putString(EXTRA_NAME, "Lifestyle")
            bundle.putLong(EXTRA_STOCK, 7L)
            view.findNavController().navigate(R.id.action_categoryFragment_to_detailCategoryFragment, bundle)*/
        }
    }
}

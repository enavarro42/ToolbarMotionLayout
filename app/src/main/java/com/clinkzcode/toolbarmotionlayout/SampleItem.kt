package com.clinkzcode.toolbarmotionlayout

import android.view.View
import com.clinkzcode.toolbarmotionlayout.databinding.SampleItemBinding
import com.xwray.groupie.viewbinding.BindableItem

class SampleItem : BindableItem<SampleItemBinding>() {
    override fun bind(viewBinding: SampleItemBinding, position: Int) = Unit

    override fun getLayout(): Int {
        return R.layout.sample_item
    }

    override fun initializeViewBinding(view: View): SampleItemBinding {
        return SampleItemBinding.bind(view)
    }
}
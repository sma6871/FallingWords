package com.sma6871.fallingwords.ui.dialog

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.sma6871.fallingwords.R
import com.sma6871.fallingwords.presentation.viewmodel.GameViewModel
import kotlinx.android.synthetic.main.fragment_welcome.*
import org.koin.androidx.viewmodel.ext.android.getViewModel
import org.koin.androidx.viewmodel.ext.android.sharedViewModel

class WelcomeDialogFragment : DialogFragment() {

    private val viewModel: GameViewModel by sharedViewModel()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_welcome, container)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnStart.setOnClickListener {
            viewModel.nextQuestion()
            dismiss()
        }
    }

}
package com.example.myapplication.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapplication.data.repository.RepositoryImpl
import com.example.myapplication.databinding.FragmentInputBinding
import com.example.domain.models.SaveParam
import com.example.domain.usecase.GetNameInSharPresUseCase
import com.example.domain.usecase.SaveUserNameUseCase
import com.example.myapplication.data.storage.SharedPrefImpl

class InputFragment: Fragment() {
    lateinit var binding: FragmentInputBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentInputBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

         val userRepositoryImpl = RepositoryImpl(sharedPref = SharedPrefImpl(context = requireContext()))
         val saveUserNameUseCase = SaveUserNameUseCase(userRepositoryImpl)
        val getNameInSharPresUseCase = GetNameInSharPresUseCase(userRepositoryImpl)

        val textView = binding.text
        val editText = binding.editText
        val saveDate = binding.saveDateButton
        var getDate = binding.getDateButton

        saveDate.setOnClickListener {
            val saveText = editText.text.toString()
            val param = SaveParam(saveText)
            val viewState = saveUserNameUseCase.execute(param = param).toString()
            val showSave = getNameInSharPresUseCase.execute()
//            textView.text = viewState
            textView.text = showSave

        }


    }
}
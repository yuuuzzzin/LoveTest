package com.yuuuzzzin.lovetest.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.yuuuzzzin.lovetest.R
import com.yuuuzzzin.lovetest.databinding.FragmentQuestionBinding

class QuestionFragment : Fragment(), View.OnClickListener {
    lateinit var navController : NavController

    // 뷰가 사라질 때, 즉 메모리에서 날아갈 때 같이 날리기 위해 따로 해두기
    private var _binding: FragmentQuestionBinding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentQuestionBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.btnNext.setOnClickListener(this)

        return view
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)
    }

    override fun onClick(v: View?) {
        when(v!!.id) {
            R.id.btn_next -> {
                navController.navigate(R.id.action_questionFragment_to_selectionFragment3)
            }
        }
    }

}

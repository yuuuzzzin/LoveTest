package com.yuuuzzzin.lovetest.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.yuuuzzzin.lovetest.R
import com.yuuuzzzin.lovetest.databinding.FragmentResultBinding

class ResultFragment : Fragment() {

    var option = -1

    lateinit var navController : NavController

    // 뷰가 사라질 때, 즉 메모리에서 날아갈 때 같이 날리기 위해 따로 해두기
    private var _binding: FragmentResultBinding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentResultBinding.inflate(inflater, container, false)
        val view = binding.root

        option = arguments?.getInt("index")?:-1

        return view
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)

        setResult(option)

        binding.btnHome.setOnClickListener {
            navController.navigate(R.id.action_resultFragment_to_mainFragment)
        }
    }

    fun setResult(option : Int) {
        when(option) {
            1 -> {
                binding.tvMain.text = "You are a QUITTER!"
                binding.tvSub.text = "You can let the person easily."
            }
            2 -> {
                binding.tvMain.text = "You should focus on yourself"
                binding.tvSub.text = "You become really clingy to your ex."
            }
            3 -> {
                binding.tvMain.text = "You should take it easy"
                binding.tvSub.text = "You can do crazy things no matter what it takes."
            }
            4 -> {
                binding.tvMain.text = "You are pretty mature"
                binding.tvSub.text = "You can easily accept this break-up."
            }
        }
    }


}
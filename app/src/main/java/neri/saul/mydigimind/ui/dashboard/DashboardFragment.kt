package neri.saul.mydigimind.ui.dashboard

import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import neri.saul.mydigimind.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class DashboardFragment : Fragment() {
    private lateinit var dashboardViewModel: DashboardViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        dashboardViewModel = ViewModelProvider(owner = this).get(DashboardViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_dashboard, container,false)
        dashboardViewModel.text.observe(viewLifecycleOwner, Observer { /* nada... */})
        return root
    }
}
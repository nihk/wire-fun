package nick.template.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.dinosaurs.Dinosaur
import com.example.geology.Period
import com.example.jurassic_park.GrpcJurassicParkClient
import com.example.jurassic_park.JurassicParkClient
import com.squareup.wire.GrpcClient
import nick.template.R
import nick.template.databinding.MainFragmentBinding
import javax.inject.Inject

class MainFragment @Inject constructor(
    private val factory: MainViewModel.Factory
) : Fragment(R.layout.main_fragment) {
    private val viewModel: MainViewModel by viewModels { factory.create(this) }

    // todo: create a map in protolang

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val binding = MainFragmentBinding.bind(view)
        val dino = Dinosaur(
            name = "Ralph",
            picture_urls = listOf("a", "b", "c"),
            period = Period.TRIASSIC
        )

        val client = GrpcClient.Builder()
            .build()
        val jurassicPark: JurassicParkClient = GrpcJurassicParkClient(client)
    }
}

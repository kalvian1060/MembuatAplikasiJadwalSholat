package id.kalviansofian.belajarretrofitbasic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import id.kalviansofian.belajarretrofitbasic.model.Items;
import id.kalviansofian.belajarretrofitbasic.model.Jadwal;
import id.kalviansofian.belajarretrofitbasic.rest.ApiClient;
import id.kalviansofian.belajarretrofitbasic.rest.ApiInterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tvSubuh)
    TextView tvSubuh;
    @BindView(R.id.tvZuhur)
    TextView tvZuhur;
    @BindView(R.id.tvAshar)
    TextView tvAshar;
    @BindView(R.id.tvMagrhib)
    TextView tvMaghrib;
    @BindView(R.id.tvIsya)
    TextView tvIsya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnLoadData)
    void actionLoadData() {
        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);

        Call<Items> call = apiService.getJadwalSholat("jakarta");

        call.enqueue(new Callback<Items>() {
            @Override
            public void onResponse(Call<Items> call, Response<Items> response) {
                List<Jadwal> jadwal = response.body().getItems();
                loadData(jadwal);
            }

            @Override
            public void onFailure(Call<Items> call, Throwable t) {

            }
        });
    }


    private void loadData(List<Jadwal> jadwal) {

        for (Jadwal data : jadwal) {
            tvSubuh.setText(data.getSubuh());
            tvZuhur.setText(data.getZuhur());
            tvAshar.setText(data.getAshar());
            tvMaghrib.setText(data.getMaghrib());
            tvIsya.setText(data.getIsya());
        }

    }


}

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface SocketService {
    @GET("/query")
    Call<String> sendMessage(@Query("data") String query);
}

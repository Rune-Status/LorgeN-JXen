package org.tanberg.jxen.api;

import org.tanberg.jxen.entity.user.User;
import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface AuthApi {

    @POST(value = "/auth")
    Call<User> authenticate(
      @Query(value = "login") String username,
      @Query(value = "password") String password,
      @Query(value = "limit_ip") String ipAddress
    );
}

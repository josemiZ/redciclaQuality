package com.cerezaconsulting.reciclappcalidad.data.repositories.remote.request;

import com.cerezaconsulting.reciclappcalidad.data.entities.BenefitEntity;
import com.cerezaconsulting.reciclappcalidad.data.entities.BusinessEntity;
import com.cerezaconsulting.reciclappcalidad.data.entities.UserEntity;
import com.cerezaconsulting.reciclappcalidad.data.entities.trackholders.EntityTrackHolder;
import com.cerezaconsulting.reciclappcalidad.data.repositories.remote.ApiConstants;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;

/**
 * Created by miguel on 29/06/17.
 */

public interface BenefitsRequest {

    @GET(ApiConstants.BENEFITS)
    Call<EntityTrackHolder<BusinessEntity>> getBusinessBenefits(@Header("Authorization") String token,
                                                                @Header("Accept") String json);

    @GET(ApiConstants.USER_BENEFITS)
    Call<UserEntity> getUserBenefits(@Header("Authorization") String token,
                                     @Header("Accept") String json, @Path("id") String id);
}

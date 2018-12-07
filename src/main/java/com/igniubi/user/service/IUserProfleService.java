package com.igniubi.user.service;

import com.igniubi.model.CommonRsp;
import com.igniubi.user.model.UserProfile;
import com.igniubi.model.dtos.user.req.RegisterReqBO;
import com.igniubi.model.dtos.user.req.UserProfileReqBO;

public interface IUserProfleService {

    CommonRsp register(RegisterReqBO registerReq);

    UserProfile getUserProfile(UserProfileReqBO userProfileReqBO);
}
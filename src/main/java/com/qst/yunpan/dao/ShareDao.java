package com.qst.yunpan.dao;

import com.qst.yunpan.pojo.Share;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@ResponseBody
public interface ShareDao {

    void shareFile(Share share) throws Exception;
    List<Share> findShare(Share share) throws Exception;
    List<Share> findShareByName(@Param("username") String username, @Param("status")  int status) throws Exception;
    void cancelShare(@Param("url") String url, @Param("filePath")  String filePath, @Param("status") int status) throws Exception;

}
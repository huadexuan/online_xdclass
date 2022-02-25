package net.xdclass.online_xdclass.service.Imp;

import net.xdclass.online_xdclass.domain.Video;
import net.xdclass.online_xdclass.domain.VideoBanner;
import net.xdclass.online_xdclass.mapper.VideoMapper;
import net.xdclass.online_xdclass.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoServiceImpl implements VideoService {

    @Autowired
    private VideoMapper videoMapper;

    @Override
    public List<Video> ListVideo() {
        return videoMapper.listVideo();
    }

    @Override
    public List<VideoBanner> ListVideoBanner() {
        return videoMapper.listVideoBanner();
    }

    @Override
    public List<Video> findDetailById(int videoId) {

        //Mybatis关联查询
        return videoMapper.findDetailById(videoId);
    }
}

package net.xdclass.online_xdclass.mapper;

import net.xdclass.online_xdclass.domain.Video;
import net.xdclass.online_xdclass.domain.VideoBanner;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
public interface VideoMapper {

    List<Video> listVideo();

    List<VideoBanner> listVideoBanner();

    List<Video> findDetailById(int videoId);
}

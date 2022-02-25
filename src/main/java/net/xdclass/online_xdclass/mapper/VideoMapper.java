package net.xdclass.online_xdclass.mapper;

import net.xdclass.online_xdclass.model.entity.Video;
import net.xdclass.online_xdclass.model.entity.VideoBanner;

import java.util.List;
public interface VideoMapper {

    List<Video> listVideo();

    List<VideoBanner> listVideoBanner();

    List<Video> findDetailById(int videoId);
}

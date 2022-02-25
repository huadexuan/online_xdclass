package net.xdclass.online_xdclass.service;

import net.xdclass.online_xdclass.model.entity.Video;
import net.xdclass.online_xdclass.model.entity.VideoBanner;

import java.util.List;

public interface VideoService {

    List<Video> ListVideo();

    List<VideoBanner> ListVideoBanner();

    List<Video> findDetailById(int videoId);
}

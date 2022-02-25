package net.xdclass.online_xdclass.controller;

import net.xdclass.online_xdclass.domain.Video;
import net.xdclass.online_xdclass.domain.VideoBanner;
import net.xdclass.online_xdclass.service.VideoService;
import net.xdclass.online_xdclass.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/pub/video")
public class VideoController {

    @Autowired
    private VideoService videoService;

    @GetMapping("list_banner")
    public JsonData listVideoBanner(){
        List<VideoBanner> videoBanner =   videoService.ListVideoBanner();
        return JsonData.buildSucces(videoBanner);
    };

    @GetMapping("list")
    public JsonData ListVideo(){
        List<Video> videoList = videoService.ListVideo();
        return JsonData.buildSucces(videoList);
    };

    @GetMapping("findDetailById")
    public JsonData findDetailById(@RequestParam(value = "video_id")int videoId){
        List<Video> video = videoService.findDetailById(videoId);
//        int i = 1/0;
        return JsonData.buildSucces(video);
    };

}

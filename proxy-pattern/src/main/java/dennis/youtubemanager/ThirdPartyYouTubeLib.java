package dennis.youtubemanager;

// The interface of a remote service.
public interface ThirdPartyYouTubeLib {
    void listVideos();
    void getVideoInfo(int id);
    void downloadVideo(int id);
}

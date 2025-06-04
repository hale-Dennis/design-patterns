package dennis.youtubemanager;

public class YouTubeManager {
    private ThirdPartyYouTubeLib service;

    public YouTubeManager(ThirdPartyYouTubeLib service) {
        this.service = service;
    }

    public void renderVideoPage(int id) {
        service.getVideoInfo(id);
    }

    public void renderListPanel() {
        service.listVideos();
    }

    public void reactOnUserInput() {
        renderVideoPage(1);
        renderListPanel();
    }
}

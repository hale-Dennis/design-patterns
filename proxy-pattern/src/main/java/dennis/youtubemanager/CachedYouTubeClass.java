package dennis.youtubemanager;

public class CachedYouTubeClass implements ThirdPartyYouTubeLib {
    private ThirdPartyYouTubeLib service;
    private String listCache;
    private String videoCache;
    private boolean needReset;

    public CachedYouTubeClass(ThirdPartyYouTubeLib service) {
        this.service = service;
        this.needReset = false;
    }

    @Override
    public void listVideos() {
        if (listCache == null || needReset) {
            System.out.println("Fetching list of videos from real service...");
            service.listVideos();
            listCache = "List of videos (cached)";
        } else {
            System.out.println("Returning cached list of videos");
        }
    }

    @Override
    public void getVideoInfo(int id) {
        if (videoCache == null || needReset) {
            System.out.println("Fetching video info from real service...");
            service.getVideoInfo(id);
            videoCache = "Video info (cached)";
        } else {
            System.out.println("Returning cached video info");
        }
    }

    @Override
    public void downloadVideo(int id) {
        if (downloadExists(id) && !needReset) {
            System.out.println("Returning cached video download");
        } else {
            System.out.println("Downloading video from real service...");
            service.downloadVideo(id);
        }
    }

    private boolean downloadExists(int id) {
        return true;
    }
}


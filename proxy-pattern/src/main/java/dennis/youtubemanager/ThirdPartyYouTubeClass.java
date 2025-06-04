package dennis.youtubemanager;

public class ThirdPartyYouTubeClass implements ThirdPartyYouTubeLib {
    @Override
    public void listVideos() {
        System.out.println("Fetching list of videos from YouTube...");
    }

    @Override
    public void getVideoInfo(int id) {
        System.out.println("Fetching video info for video ID: " + id);
    }

    @Override
    public void downloadVideo(int id) {
        System.out.println("Downloading video with ID: " + id);
    }
}

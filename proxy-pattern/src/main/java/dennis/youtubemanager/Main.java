package dennis.youtubemanager;




public class Main {
    public static void main(String[] args) {
        ThirdPartyYouTubeLib realYouTubeService = new ThirdPartyYouTubeClass();

        ThirdPartyYouTubeLib proxyYouTubeService = new CachedYouTubeClass(realYouTubeService);
        
        YouTubeManager manager = new YouTubeManager(proxyYouTubeService);

        System.out.println("User Interaction 1:");
        manager.reactOnUserInput();

        System.out.println("\nUser Interaction 2 (cached results):");
        manager.reactOnUserInput();


        System.out.println("\nResetting cache and re-running interactions:");
        proxyYouTubeService = new CachedYouTubeClass(realYouTubeService);
        manager = new YouTubeManager(proxyYouTubeService);
        manager.reactOnUserInput();
    }
}


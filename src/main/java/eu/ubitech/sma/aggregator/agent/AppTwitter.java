package eu.ubitech.sma.aggregator.agent;

/**
 *
 * @author Chris Paraskeva
 */
public class AppTwitter {

    public static void main(String[] args) {


        TwitterAgent tagent = new TwitterAgent();


        //tagent.isValidPage("Barclaysaaefr24");
        //return;
        //tagent.setAccessToken("2237544295-L37YEFJyyGOPVw0CZ3KDwn7NZaf79L9Lf09kaD9", "gnBBNh3xlnUQalanxLAqxXEZ0Nx4Ss5TcUXc1rMJmijSw");
       /* try {
            
         //Get current tweets
         ResponseList<Status> results = tagent.getTwitter().getUserTimeline("myfcmb");
         for (Status status: results ){
         System.out.println("ID: "+status.getId()+" Text: "+status.getText() +  " Retweets: "+status.getRetweetCount() + " Reply: " +status.getInReplyToStatusId());
         if (status.getInReplyToStatusId() > 0){
         System.out.println("\nTweet has responses:\n---Start of conversation\n");
         //GET reply text
         Status replyStatus = tagent.getTwitter().showStatus(status.getInReplyToStatusId());
         System.out.println(replyStatus.getText() + " extra status: " +replyStatus.getInReplyToStatusId() +"\n\n---End of conversation\n");
         }
         }
            
            

            
            
         } catch (TwitterException ex) {
         Logger.getLogger(AppTwitter.class.getName()).log(Level.SEVERE, null, ex);
         }
         */

            //tagent.getTwitter().getuser
        //  args = new String[]{"6dcwuOOz3giCTzYjAM4T3Q","QoyeE9ckUzp224PoWwa9q7A0waP0um0JnbivplKf5g"};
        /*
         File file = new File("twitter4j.properties");
         Properties prop = new Properties();
         InputStream is = null;
         OutputStream os = null;
         try {
         if (file.exists()) {
         is = new FileInputStream(file);
         prop.load(is);
         }
         if (args.length < 2) {
         if (null == prop.getProperty("oauth.consumerKey")
         && null == prop.getProperty("oauth.consumerSecret")) {
         // consumer key/secret are not set in twitter4j.properties
         System.out.println(
         "Usage: java twitter4j.examples.oauth.GetAccessToken [consumer key] [consumer secret]");
         System.exit(-1);
         }
         } else {
         prop.setProperty("oauth.consumerKey", args[0]);
         prop.setProperty("oauth.consumerSecret", args[1]);
         os = new FileOutputStream("twitter4j.properties");
         prop.store(os, "twitter4j.properties");
         }
         } catch (IOException ioe) {
         ioe.printStackTrace();
         System.exit(-1);
         } finally {
         if (is != null) {
         try {
         is.close();
         } catch (IOException ignore) {
         }
         }
         if (os != null) {
         try {
         os.close();
         } catch (IOException ignore) {
         }
         }
         }
         try {
         Twitter twitter = new TwitterFactory().getInstance();
         RequestToken requestToken = twitter.getOAuthRequestToken();
         System.out.println("Got request token.");
         System.out.println("Request token: " + requestToken.getToken());
         System.out.println("Request token secret: " + requestToken.getTokenSecret());
         AccessToken accessToken = null;
            
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         while (null == accessToken) {
         System.out.println("Open the following URL and grant access to your account:");
         System.out.println(requestToken.getAuthorizationURL());
         try {
         Desktop.getDesktop().browse(new URI(requestToken.getAuthorizationURL()));
         } catch (UnsupportedOperationException ignore) {
         } catch (IOException ignore) {
         } catch (URISyntaxException e) {
         throw new AssertionError(e);
         }
         System.out.print("Enter the PIN(if available) and hit enter after you granted access.[PIN]:");
         String pin = br.readLine();
         try {
         if (pin.length() > 0) {
         accessToken = twitter.getOAuthAccessToken(requestToken, pin);
         } else {
         accessToken = twitter.getOAuthAccessToken(requestToken);
         }
         } catch (TwitterException te) {
         if (401 == te.getStatusCode()) {
         System.out.println("Unable to get the access token.");
         } else {
         te.printStackTrace();
         }
         }
         }
         System.out.println("Got access token.");
         System.out.println("Access token: " + accessToken.getToken());
         System.out.println("Access token secret: " + accessToken.getTokenSecret());
            
         try {
         prop.setProperty("oauth.accessToken", accessToken.getToken());
         prop.setProperty("oauth.accessTokenSecret", accessToken.getTokenSecret());
         os = new FileOutputStream(file);
         prop.store(os, "twitter4j.properties");
         os.close();
         } catch (IOException ioe) {
         ioe.printStackTrace();
         System.exit(-1);
         } finally {
         if (os != null) {
         try {
         os.close();
         } catch (IOException ignore) {
         }
         }
         }
         System.out.println("Successfully stored access token to " + file.getAbsolutePath() + ".");
         System.exit(0);
         } catch (TwitterException te) {
         te.printStackTrace();
         System.out.println("Failed to get accessToken: " + te.getMessage());
         System.exit(-1);
         } catch (IOException ioe) {
         ioe.printStackTrace();
         System.out.println("Failed to read the system input.");
         System.exit(-1);
         }
         }
         */
    }
}

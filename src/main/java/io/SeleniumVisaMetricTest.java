package io;

import org.apache.hc.client5.http.fluent.Request;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.io.IOException;
import java.net.URISyntaxException;
import java.security.cert.X509Certificate;

/**
 * ZenRow API Key:
 * a1471960ae6961f6dacd5a0810318f078fea508d
 *
 * @author abbas
 */
public class SeleniumVisaMetricTest {
    public static void main(String[] args) throws IOException, URISyntaxException {
//        // pass the path of the chromedriver location in the second argument
//        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//
//        DevTools devTools = ((ChromeDriver) driver).getDevTools();
//        devTools.createSession();
//        devTools.send(Network.enable(Optional.of(1000000), Optional.empty(), Optional.empty()));
//        devTools.addListener(Network.responseReceived(), responseReceived -> {
//            String responseUrl = responseReceived.getResponse().getUrl();
//            if (responseUrl.contains("makemytrip")) {
//                System.out.println("Url: " + responseUrl);
//                System.out.println("Response headers: " + responseReceived.getResponse().getHeaders().toString());
//            }
//
//        });
//
////        driver.get("https://www.makemytrip.com");

//        URL uri = new URL("https://it-ir-appointment.visametric.com/ir");
////        System.out.println(uri.getAuthority());
////        System.out.println(uri.getRawAuthority());
////        System.out.println(uri.getRawUserInfo());
////        System.out.println(uri.getScheme());
//        HttpURLConnection con = (HttpURLConnection) uri.openConnection();
//        con.addRequestProperty("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/16.4 Safari/605.1.15");
//        con.connect();
//        String cookie = con.getHeaderField("Cookie");
//        System.out.println(cookie);
//        System.out.println(con.getResponseMessage());

//        Document doc;
//        try {
//            doc = Jsoup.connect("https://it-ir-appointment.visametric.com/ir")
//                    .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/108.0.0.0 Safari/537.36")
//                    .header("Accept-Language", "*")
//                    .get();
//            System.out.println(doc.title());
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }


//        try (Playwright playwright = Playwright.create()) {
//            Browser browser = playwright.chromium().launch();
//            BrowserContext context = browser.newContext();
//            Page page = context.newPage();
//            page.setExtraHTTPHeaders(
//                    Map.of("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/110.0.0.0 Safari/537.36",
//                            "Accept-Language", "en-US,en;q=0.9",
//                            "Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
//                            "Accept-Encoding", "gzip, deflate"
//                    )
//            );
//            Response navigate = page.navigate("https://it-ir-appointment.visametric.com/ir");
//            System.out.println(navigate.text());
//            try {
//                File file = new File("/Users/incondensable/Desktop/Java/Books/Java-SE/pdf/body.pdf");
//                FileOutputStream os = new FileOutputStream(file);
//                os.write(navigate.body());
//                os.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            System.out.println(Arrays.toString(navigate.body()));
//            System.out.println(page.title());
//    }

        String apiUrl = "https://api.zenrows.com/v1/?apikey=a1471960ae6961f6dacd5a0810318f078fea508d&url=https%3A%2F%2Fit-ir-appointment.visametric.com%2Fir&js_render=true&antibot=true&original_status=true&device=desktop&autoparse=true";
        String response = Request.get(apiUrl)
                .execute().returnContent().asString();

        System.out.println(response);
    }

    private static void ignoreCertWarning() {
        SSLContext ctx = null;
        TrustManager[] trustAllCerts = new X509TrustManager[]{new X509TrustManager() {
            public X509Certificate[] getAcceptedIssuers() {
                return null;
            }

            public void checkClientTrusted(X509Certificate[] certs, String authType) {
            }

            public void checkServerTrusted(X509Certificate[] certs, String authType) {
            }
        }};

        try {
            ctx = SSLContext.getInstance("SSL");
            ctx.init(null, trustAllCerts, null);
            SSLContext.setDefault(ctx);
        } catch (Exception e) {
        }
    }
}

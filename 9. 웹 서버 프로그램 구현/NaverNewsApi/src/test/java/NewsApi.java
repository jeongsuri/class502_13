import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class NewsApi {
    private static final String CLIENT_ID = "OeXHR47mWF9PTQ159vMp"; // 애플리케이션 등록 시 발급 받은 클라이언트 아이디
    private static final String CLIENT_SECRET = "yllhp759uT"; // 애플리케이션 등록 시 발급 받은 클라이언트 시크릿

    public static void main(String[] args) {
        String query = "중앙정보"; // 검색어
        String apiURL = "https://openapi.naver.com/v1/search/news.json?query=" + query;

        try {
            CloseableHttpClient httpClient = HttpClients.createDefault();
            HttpGet request = new HttpGet(apiURL);
            request.addHeader("X-Naver-Client-Id", CLIENT_ID);
            request.addHeader("X-Naver-Client-Secret", CLIENT_SECRET);

            HttpResponse response = httpClient.execute(request);
            int responseCode = response.getStatusLine().getStatusCode();

            System.out.println("Response Code : " + responseCode);

            if (responseCode == HttpURLConnection.HTTP_OK) { // 정상 호출
                String responseBody = EntityUtils.toString(response.getEntity());
                System.out.println("Response Body : " + responseBody);

                ObjectMapper mapper = new ObjectMapper();
                JsonNode rootNode = mapper.readTree(responseBody);
                JsonNode itemsNode = rootNode.path("items");

                for (JsonNode item : itemsNode) {
                    System.out.println("Title: " + item.path("title").asText());
                    System.out.println("Link: " + item.path("link").asText());
                    System.out.println("Description: " + item.path("description").asText());
                    System.out.println("---------------------------");
                }
            } else { // 에러 발생
                BufferedReader br = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
                String inputLine;
                StringBuffer responseBuffer = new StringBuffer();

                while ((inputLine = br.readLine()) != null) {
                    responseBuffer.append(inputLine);
                }
                br.close();
                System.out.println(responseBuffer.toString());
            }
            httpClient.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package sample_news.restapicontroller;

import java.util.HashMap;
import java.util.Map;

//JAX-RS와 관련된 패키지는 꼭 javax.ws.rs.*을 사용
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/api") //REST API 서비스 진입점을 의미
public class RestConfig extends Application {
	public Map<String, Object> getProperties(){
		Map<String, Object> properties = new HashMap<String, Object>();
		//클래스에서 REST-API 서비스를 찾는다는 설정으로 속성 이름인 "jersey.config.server.provider.packages" 정확히 작성
		properties.put("jersey.config.server.provider.packages", "restAPI");
		return properties;
	}
}

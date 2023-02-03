package restConfig;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/api")
public class RestConfig extends Application{
	public Map<String,Object> getProperties(){
		Map<String,Object> properties = new HashMap<String,Object>();
		//클래스에서 REST-APi 서비스를 찾는다는 설정으로 속성 이름인 "jersey.confing.server.provider.packages"정확히 작성
		return properties;
	}
}

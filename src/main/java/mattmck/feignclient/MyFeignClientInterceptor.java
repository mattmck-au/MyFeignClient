package mattmck.feignclient;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyFeignClientInterceptor implements RequestInterceptor {
    @Override
    public void apply(RequestTemplate template) {
        log.info("Request Url: {}", template.url());
    }
}

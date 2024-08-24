package mattmck.feignclient;

import feign.Response;
import feign.codec.ErrorDecoder;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyFeignClientErrorDecoder implements ErrorDecoder {
    @Override
    public Exception decode(String methodKey, Response response) {
        log.info("Method : {}, Response: {}", methodKey, response);

        switch (response.status()) {
            case 400:
            case 404:
                return new MyFeignClientNotFoundException();
            default:
                return new Exception("Generic error");
        }
    }
}

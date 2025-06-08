package br.com.potential.hotel;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/api")
public class StatusController {

    private static final String SERVICE_NAME = "service";
    private static final String HOTEL_API = "Hotel API";
    private static final String SERVICE_STATUS = "status";
    private static final String UP = "UP";
    private static final String HTTP_STATUS = "httpStatus";
    private static final Integer SUCCESSFUL = HttpStatus.OK.value();

    @GetMapping("status")
    public ResponseEntity<HashMap<String, Object>> getApiStatus() {
        HashMap<String, Object> response = new HashMap<>();
        response.put(SERVICE_NAME, HOTEL_API);
        response.put(SERVICE_STATUS, UP);
        response.put(HTTP_STATUS, SUCCESSFUL);

        return ResponseEntity.ok(response);
    }
}
